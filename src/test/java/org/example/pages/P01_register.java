package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class P01_register {


    WebDriver driver;

    public P01_register(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement register() {
        return driver.findElement(By.className("ico-register"));
    }

    public WebElement gender_btn() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement first_name() {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement second_name() {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement Get_Day_of_Birth() {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement Get_Month_of_Birth() {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement Get_Year_of_Birth() {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public void dropdown_date() {
        Select day = new Select(Get_Day_of_Birth());
        Select month = new Select(Get_Month_of_Birth());
        Select year = new Select(Get_Year_of_Birth());

        day.selectByValue("11");
        month.selectByValue("2");
        year.selectByValue("2000");
    }

    public WebElement Enter_Email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement RegisterButton() {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement get_pass1() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement get_pass2() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

}
