package com.choucairtesting.challenge.stepdefinitions;

import com.choucairtesting.challenge.model.Data;
import com.choucairtesting.challenge.questions.TheAswer;
import com.choucairtesting.challenge.tasks.CreateAReport;
import com.choucairtesting.challenge.tasks.Login;
import com.choucairtesting.challenge.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MaxtimeStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than Jhon is already login in MaxTime$")
    public void than_Jhon_is_already_login_in_MaxTime(List<Data> data) {
        theActorCalled("Jhon").wasAbleTo(OpenUp.thePage(), Login.onThePage(data));
    }

    @When("^he create a report$")
    public void he_create_a_report(List<Data> data) {
        theActorInTheSpotlight().attemptsTo(CreateAReport.with(data));
    }

    @Then("^the platform show the message (.*)$")
    public void the_platform_show_the_message_Reporte_Dia(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAswer.toThe(question)));
    }

}
