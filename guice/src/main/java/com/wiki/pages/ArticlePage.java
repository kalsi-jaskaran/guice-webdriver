package com.wiki.pages;

import ca.co.af.qa.qualifier.PageObject;
import ca.co.af.qa.wait.COAFWait;
import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

@PageObject
public class ArticlePage {
    @FindBy(id = "firstHeading")
    private WebElement heading;

    @Inject
    private COAFWait coafWait;

    public String getHeading() {
        coafWait.until(ExpectedConditions.visibilityOf(heading));
        return heading.getText();
    }
}
