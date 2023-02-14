package com.amazon.tests;

import com.amazon.pages.AmazonMain;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1Amazon {

    @Test
    public void test1Amazon() {

        AmazonMain locator = new AmazonMain();


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(locator.language).perform();

        Assert.assertTrue(locator.english.isDisplayed());


    }


}
