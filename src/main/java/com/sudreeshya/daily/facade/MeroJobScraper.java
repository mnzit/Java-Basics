package com.sudreeshya.daily.facade;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class MeroJobScraper implements Scraper {

    @Override
    public Object scrap(Document document) {
        Elements elements = document.select("div.row .job-card");

        List<JobDetail> jobDetails = new ArrayList<>();

        for (Element element : elements) {
            Elements jobTitle = element.select("h1.text-primary").select("a");
            Elements image = element.select("img.border");
            Elements companyName = element.select("h3");
            Elements companyAddress = element.select("span.text-muted > span");
            Elements keySkills = element.select("div.media").get(1).select("div.media-body > span").get(1).select("span");

            JobDetail jobDetail = new JobDetail();
            jobDetail.setTitle(jobTitle.text());
            jobDetail.setCompanyImageUrl("https://merojob.com" + image.attr("src"));
            jobDetail.setCompany(companyName.text());
            jobDetail.setCompanyAddress(companyAddress.text());

            List<String> skills = new ArrayList<>();
            for (Element skill : keySkills) {
                skills.add(skill.text());
            }
            jobDetail.setKeySkills(skills);

            jobDetails.add(jobDetail);
        }
        return jobDetails;
    }
}
