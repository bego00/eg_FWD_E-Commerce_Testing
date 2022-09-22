package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {
    P02_login login=new P02_login(driver);
    SoftAssert soft = new SoftAssert();

    //Test Scenario 1
    @Given("user go to login page")
    public void Login_page() {
        login.Get_Login_page().click();
    }

    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void valid_login(String Email, String password) {
        login.Email().sendKeys(Email);
        login.Password().sendKeys(password);

    }

    @And("user press on login button")
    public void Login_button() {
        login.Login_button().click();
    }

    @Then("user login to the system successfully")
    public void success_login() {
        String ExpecUrl = "https://demo.nopcommerce.com/";
        String ActualUrl = driver.getCurrentUrl();
        soft.assertEquals(ExpecUrl, ActualUrl);
        soft.assertTrue(driver.findElement(By.className("ico-account")).isDisplayed());
        soft.assertAll();
    }


    // Test Scenario 2
    @Then("user could not login to the system")
    public void fail_login() {
        String ExpecMessage = "Login was unsuccessful. Please correct the errors and try again.";
        String ActualMessage = driver.findElement(By.className("message-error")).getText();
        soft.assertTrue(ExpecMessage.contains(ActualMessage));
        String MessageColor =driver.findElement(By.className("message-error")).getCssValue("color");
        soft.assertEquals(MessageColor,"red #e4434b");

    }
}
