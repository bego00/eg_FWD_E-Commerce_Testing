package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
    WebDriver driver;

    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Get_Login_page() {
        return driver.findElement(By.className("ico-login"));

    }

    public WebElement Email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement Password() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement Login_button() {
        return driver.findElement(By.cssSelector("form>div>.button-1 "));
    }
}
