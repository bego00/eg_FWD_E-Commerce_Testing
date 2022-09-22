package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchStepDef {
    P03_homePage home = new P03_homePage(driver);
    SoftAssert soft = new SoftAssert();

    @When("user clicks on search field")
    public void Click_Search() {
        home.Search_box().click();
    }

    @And("^user search with \"(.*)\"$")
    public void searchBox(String searchtext) {
        home.Search_box().sendKeys(searchtext);
        home.Search_box().sendKeys(Keys.ENTER);

    }

    @Then("count the size of result")
    public void result_size() {
        home.result_size();
    }

    @And("^The url contains \"(.*)\"$")
    public void Url_Search(String rul) {
        soft.assertTrue(home.Url_Search().contains("url"));

    }

    @And("^search result contains \"(.*)\"$")
    public void search_contain(String Search_word) {
        home.search_result(Search_word);
    }

    //Search - Scenario 2
    @And("user clicks on result")

    public void click_result() {
        home.click_result().click();
    }

    @Then("^user could find \"(.*)\" inside product detail page$")
    public void find_sku(String sku) {
        home.sku(sku);
    }

}
