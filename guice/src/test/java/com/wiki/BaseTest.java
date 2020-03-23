package com.wiki;

import ca.co.af.qa.page.COAFPageFactory;
import com.google.inject.Inject;
import com.wiki.pages.ArticlePage;
import com.wiki.pages.HomePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    @Inject
    COAFPageFactory pageFactory;

    HomePage homePage;

    @Inject
    ArticlePage articlePage;

    @BeforeAll
    public void setUp() {
        homePage = pageFactory.create("https://en.wikipedia.org/wiki/Main_Page", HomePage.class);
    }

}
