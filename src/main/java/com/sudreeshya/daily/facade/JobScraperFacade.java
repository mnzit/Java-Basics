package com.sudreeshya.daily.facade;

import org.jsoup.nodes.Document;

import java.util.List;

public class JobScraperFacade {

    public List<JobDetail> scrap(String site, String jobName) {
        if (site.equals("merojob")) {
            WebCaller webCaller = new WebCaller();
            Document document = webCaller.call("https://merojob.com/search/?q="+jobName);
            Scraper scraper = new MeroJobScraper();
            return (List<JobDetail>) scraper.scrap(document);
        }
        return null;
    }
}
