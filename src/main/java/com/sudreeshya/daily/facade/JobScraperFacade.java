package com.sudreeshya.daily.facade;

import com.sudreeshya.daily.facade.dto.JobDetail;
import com.sudreeshya.daily.facade.scraper.Scraper;
import com.sudreeshya.daily.facade.scraper.impl.MeroJobScraper;
import com.sudreeshya.daily.facade.webservice.WebCaller;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

public class JobScraperFacade {

    public List<JobDetail> scrap(String site, String jobName) {
        List<JobDetail> allJobs = new ArrayList<>();
        if (site.equals("merojob")) {
            WebCaller webCaller = new WebCaller();
            int i = 1;
            boolean exists = true;
            while (exists) {
                System.out.println("Fetching " + jobName + " from page-" + i);
                Document document = webCaller.call("https://merojob.com/search/?q=" + jobName + "&page=" + (i++));
                Scraper scraper = new MeroJobScraper();
                List<JobDetail> jobs = (List<JobDetail>) scraper.scrap(document);
                allJobs.addAll(jobs);
                exists = !jobs.isEmpty();
            }
        }
        return allJobs;
    }

}
