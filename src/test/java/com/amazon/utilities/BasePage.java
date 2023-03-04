package com.amazon.utilities;


import io.cucumber.java.Before;

public class BasePage {

@Before

    public void setUp(){
    Driver.getDriver().get(ConfigurationReader.keyValue("url"));


}


}
