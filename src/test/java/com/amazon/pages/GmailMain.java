package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailMain {

    public GmailMain() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(id= ":mz")
    public WebElement spamFolder;

    @FindBy (xpath= "(//span[@role='checkbox'])[2]")
    public WebElement deleteAll;
}
