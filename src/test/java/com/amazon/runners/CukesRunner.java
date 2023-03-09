package com.amazon.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/cucumber-report.html",
                "json:target/cucumber/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "src/test/resources/features",
        glue = "com/amazon/step_definitions",
        dryRun = false,
        tags = "@smoke",
        publish = true
)


public class CukesRunner {

}

