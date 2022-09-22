package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage(driver);

    @When("user click on first slider")
    public void userClickOnFirstSlider() {
        home.click_1slider().click();
    }

    @Then("^user redirected to \"(.*)\"$")
    public void userRedirectedTo(String url) {
    home.userRedirected(url);
    }

    @When("user click on second slider")
    public void userClickOnSecondSlider() {
        home.click_2slider().click();
    }


}
