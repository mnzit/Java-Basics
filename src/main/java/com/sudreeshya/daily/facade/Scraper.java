package com.sudreeshya.daily.facade;

import org.jsoup.nodes.Document;

public interface Scraper {

    Object scrap(Document document);
}
