package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage home = new P03_homePage(driver);

    @When("user opens facebook link")
    public void user_opens_facebook_link() {
        home.SocialLink(".facebook>a[href]").click();
    }

    @And("Browser wait for two seconds")
    public void browserWaitForSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("^validate \"(.*)\" is opened in new tab$")
    public void is_opened_in_new_tab(String url) {
    home.validatedUrl(url);
    }

    @When("user opens twitter link")
    public void user_opens_twitter_link() {
        home.SocialLink(".twitter>a[href]").click();
    }


    @When("user opens rss link")
    public void user_opens_rss_link() {
        home.SocialLink(".rss>a[href]").click();
    }


    @When("user opens youtube link")
    public void user_opens_youtube_link() {
        home.SocialLink(".youtube>a[href]").click();
    }


}
