package org.example.stepDefs;

import org.example.pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {
    P01_register register=new P01_register(Hooks.driver);
    SoftAssert soft = new SoftAssert();

    @Given("user go to register page")
    public void goRegisterPage() {
        register.register().click();
    }

    @When("user select gender type")
    public void Gender_type() {
        register.gender_btn();
    }

    @And("user enter first name 'ahmed' and last name 'hussein'")
    public void first_last_name() {
        register.first_name().sendKeys("ahmed");
        register.second_name().sendKeys("hussein");
    }

    @And("user enter date of birth")
    public void Date_of_Birth() {
        register.dropdown_date();
    }

    @And("user enter email 'test@example.com' field")
    public void enter_email() {
        register.Enter_Email().sendKeys("ahmedmohamed660000@gmail.com");
    }

    @And("user enter password and confirmation password")
    public void Enter_pass_confirm() {
        register.get_pass1().sendKeys("123456");
        register.get_pass2().sendKeys("123456");
    }

    @And("user clicks on register button")
    public void register_button() {
        register.RegisterButton().click();
    }

    @When("success message is displayed with green background")
    public void success_register() {
        String ExpectedResult = "Your registration completed";
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
        String ActualResult = Hooks.driver.findElement(By.className("result")).getText();
        soft.assertEquals(ActualResult, ExpectedResult);
        String Color = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        soft.assertEquals(Color, "rgba(76, 177, 124, 1)");
    }

}
