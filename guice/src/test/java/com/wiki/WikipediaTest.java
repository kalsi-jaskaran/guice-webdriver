package com.wiki;

import ca.co.af.qa.junit5.COAFExtension;
import ca.co.af.qa.junit5.guice.Modules;
import ca.co.af.qa.modules.COAFRunModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@COAFExtension
@Modules(COAFRunModule.class)
public class WikipediaTest extends BaseTest{

    private static final String SEARCH_QUERY = "hello world";
    private static final String HEADING = "\"Hello, World!\" program";

    @Test
    public void wikiSearchTest() {
        homePage.open().getSearchComponent().searchForQuery(SEARCH_QUERY);
        Assertions.assertEquals(articlePage.getHeading(), HEADING);
    }
}
