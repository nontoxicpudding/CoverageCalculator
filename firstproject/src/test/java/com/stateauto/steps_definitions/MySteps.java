package com.stateauto.steps_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

/**
 * Created by smi3003 on 4/4/2017.
 */
public class MySteps {

    @Given("^the user selects a coverage of Bodily Injury$")
    public void the_user_selects_a_coverage_of_Bodily_Injury() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        assertTrue(true);
    }

    @Given("^the user selects a (\\d+)$")
    public void the_user_selects_a(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @Given("^the user asks for the coverage amount to be calculated$")
    public void the_user_asks_for_the_coverage_amount_to_be_calculated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^the coverage amount is (\\d+)$")
    public void the_coverage_amount_is(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Given("^the user selects a coverage of Uninsured Motorists$")
    public void the_user_selects_a_coverage_of_Uninsured_Motorists() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @And("^the user hasn't selected a <coverageName>$")
    public void theUserHasnTSelectedACoverageName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @Then("^an error must be displayed$")
    public void anErrorMustBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @And("^the user hasn't selected a <coverageLimit>$")
    public void theUserHasnTSelectedACoverageLimit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }
}
