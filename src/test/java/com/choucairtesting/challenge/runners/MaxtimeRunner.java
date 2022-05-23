package com.choucairtesting.challenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/maxtime.feature",
        tags = "@stories",
        glue = "com.choucairtesting.challenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class MaxtimeRunner {
}
