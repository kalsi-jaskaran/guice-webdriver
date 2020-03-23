package com.wiki.pages;

import ca.co.af.qa.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class SearchComponent {
    @FindBy(css = "input[type=search]")
    private WebElement searchField;

    public void searchForQuery(String query) {
        searchField.sendKeys(query);
        searchField.submit();
    }
}
