package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {
    P02_login login;
    P03_homePage home= new P03_homePage(driver);
    SoftAssert soft = new SoftAssert();

//    // Background
//    @Given("user navigates to the login page")
//    public void toLoginPage() {
//        home.Get_Login_page();
//    }
//
//    @When("^user enter \"(.*)\" and \"(.*)\"$")
//    public void valid_login(String Email, String password) {
//        login.Email().sendKeys(Email);
//        login.Password().sendKeys(password);
//
//    }
//
////    @Then("user login to the system successfully")
////    public void success_login() {
////        String ExpecUrl = "https://demo.nopcommerce.com/";
////        String ActualUrl = driver.getCurrentUrl();
////        soft.assertEquals(ExpecUrl, ActualUrl);
////        soft.assertTrue(driver.findElement(By.id("ico-account")).isDisplayed());
////        soft.assertAll();
////    }
//
//    //TestScenario 1

    @When("user select us currency from dropdown list")
    public void change_currency_to_US() {
        home.change_currency("US Dollar");
    }

    @Then("validate US Currency")
    public void Validate_US_Curr() {
        home.validateUSChange();
    }

    @When("user select Euro currency from dropdown list")
    public void change_currency_to_Euro() {
        home.change_currency("Euro");
    }

    @Then("validate Euro currency")
    public void validateEuroCurrency() {
    home.validateEuroCurrency();
    }
}
