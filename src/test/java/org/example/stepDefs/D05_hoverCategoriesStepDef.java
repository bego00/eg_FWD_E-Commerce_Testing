package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage(driver);

    @When("user hover on the random main category that contains sub category")
    public void userHoverOnTheRandomMainCategoryThatContainsSubCategory() {
        home.hover_maincate();
    }

    @And("select one of it's own subCategory and click on it")
    public void selectOneOfItSOwnSubCategory() {
        home.selectsubcat();
    }


    @Then("the pageTitle should be equal to name of Selected subCategory")
    public void thePageTitleShouldBeEqualToNameOfSelectedSubCategory() {
        home.pageTitle();
    }
}
