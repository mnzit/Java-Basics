package com.sudreeshya.daily.facade;

import java.io.IOException;
import java.util.List;

public class FacadeDemo {

    public static void main(String[] args) throws IOException {
        JobScraperFacade jobScraperFacade = new JobScraperFacade();
        List<JobDetail> meroJob =  jobScraperFacade.scrap("merojob", "java");
        List<JobDetail> jobs =  jobScraperFacade.scrap("merojob", "java");
        System.out.println(jobs);
    }
}
