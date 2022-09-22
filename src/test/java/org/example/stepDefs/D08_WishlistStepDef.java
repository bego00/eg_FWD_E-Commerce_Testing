package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

import static org.example.stepDefs.Hooks.driver;

public class D08_WishlistStepDef {
    P03_homePage home = new P03_homePage(driver);

    @When("user click on wishlist button")
    public void user_click_on_wishlist_button() {
        home.Click_wishlist().click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed() {
        home.validateSuccessMessage();
    }

    @Then("verify background color")
    public void verify_background_color() {
        home.verifyBackground();
    }

    @And("Press on wishlist icon")
    public void pressOnWishlistIcon() {
        home.Click_wishlist_icon().click();
    }

    @Then("check the Qty bigger than zero")
    public void checkTheQtyBiggerThanOrNot() {
        home.verify_Qty();
    }


}
