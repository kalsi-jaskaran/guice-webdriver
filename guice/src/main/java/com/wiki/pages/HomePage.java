package com.wiki.pages;

import ca.co.af.qa.page.Page;
import ca.co.af.qa.qualifier.PageObject;
import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@PageObject
public class HomePage extends Page<HomePage> {
    @Inject
    protected WebDriver driver;

    @FindBy(id = "p-search")
    private SearchComponent searchComponent;

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }
}
