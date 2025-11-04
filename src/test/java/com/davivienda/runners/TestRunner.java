package com.davivienda.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/E2E/",
        tags = "@E2E",
        glue = "com.davivienda.stepdefinitions",
        plugin = {
                "pretty",
                "json:target/cucumber_report.json",
                "html:target/cucumber-reports.html"
        }
)
public class TestRunner {
}
