package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class LibraryPage {

    public LibraryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id= "inputEmail")
    public WebElement inputEmail;

    @FindBy(id= "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath= "//button[@type='submit']")
    public WebElement signInButton;


}
