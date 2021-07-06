package com.sudreeshya.daily.facade.scraper;

import org.jsoup.nodes.Document;

public interface Scraper {

    Object scrap(Document document);
}
