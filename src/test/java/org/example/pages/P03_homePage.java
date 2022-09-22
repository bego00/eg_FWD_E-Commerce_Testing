package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class P03_homePage {
    WebDriver driver;

    public P03_homePage(WebDriver driver) {
        this.driver = driver;
    }

    //Search - Scenario 1
    public WebElement Search_box() {
        return driver.findElement(By.cssSelector("input#small-searchterms"));

    }

    public void result_size() {
        List<WebElement> list = driver.findElements(By.className("product-item"));
        System.out.println(list.size());
    }

    public String Url_Search() {
        return driver.getCurrentUrl();
    }

    public void search_result(String search_word) {

        List<WebElement> list = driver.findElements(By.className("product-item"));
        for (WebElement webElement : list) {
            String res = driver.findElement(By.className("product-item")).getText().toLowerCase();
            Assert.assertTrue(res.contains(search_word));
        }
    }

    // search - scenario 2
    public WebElement click_result() {
        return driver.findElement(By.className("item-box"));
    }

    public void sku(String sku) {
        String l = driver.findElement(By.className("sku")).getText();
        Assert.assertTrue(l.contains(sku));

    }

    // Currency Feature
    public WebElement get_cur_list() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public void change_currency(String currency) {
        Select curr = new Select(get_cur_list());
        curr.selectByVisibleText(currency);
    }

    public void validateUSChange() {
        List<WebElement> l = driver.findElements(By.cssSelector("span.price"));

        for (WebElement webElement : l) {
            String output = webElement.getText();
            Assert.assertTrue(output.contains("$"));
        }

    }

    public void validateEuroCurrency() {
        List<WebElement> l = driver.findElements(By.cssSelector("span.price"));

        for (WebElement webElement : l) {
            String output = webElement.getText();
            System.out.println(output);
            Assert.assertTrue(output.contains("€"));
        }

    }

    // HoverCategories
    int random_num = new Random().nextInt(3);

    public void hover_maincate() {
        //Main Categories
        List<WebElement> cats = driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        // hovering on the one of the first 3 random category
        Actions hover = new Actions(driver);
        hover.moveToElement(cats.get(random_num)).perform();
    }

    String sub_hover = "";

    public void selectsubcat() {
        List<WebElement> subcate = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li[1]//li"));
        int random_num_sub = new Random().nextInt(3);
        // hovering on the one of the first 3 random category
        sub_hover = subcate.get(random_num_sub).getText().toLowerCase().trim();
        subcate.get(random_num_sub).click();
        System.out.println(subcate.get(random_num_sub));
    }

    public void pageTitle() {
        String pageTitle = driver.findElement(By.className("page-title")).getText().toLowerCase().trim();
        Assert.assertEquals(pageTitle, sub_hover);

    }

    //homeSlider
    public WebElement click_1slider() {
        return driver.findElement(By.cssSelector("#nivo-slider>a:nth-child(1)"));
    }

    public WebElement click_2slider() {
        return driver.findElement(By.cssSelector("#nivo-slider>a:nth-child(2)"));
    }

    public void userRedirected(String url) {
        String curUrl = driver.getCurrentUrl();

        Assert.assertEquals(curUrl, url);
    }

    //followUs
    public WebElement SocialLink(String locator) {
        return driver.findElement(By.cssSelector(locator));
    }

    public void validatedUrl(String url) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String curUrl1 = driver.getCurrentUrl();
        driver.close();
        driver.switchTo().window(tabs.get(0));
        Assert.assertEquals(curUrl1, url);
    }

    //Wishlist - Scenario 1
    public WebElement Click_wishlist() {
        return driver.findElement(By.cssSelector(" div.master-wrapper-page > " +
                "div.master-wrapper-content " +
                "> div > div > div > div >" +
                " div.product-grid.home-page-product-grid > " +
                "div.item-grid > div:nth-child(3) > " +
                "div div.buttons > " +
                "button.button-2.add-to-wishlist-button"));
    }


    public void validateSuccessMessage() {
        boolean message = driver.findElement(By.className("content")).isDisplayed();
        Assert.assertTrue(message);
    }

    public void verifyBackground() {
        String color_rgb = driver.findElement(By.cssSelector(".bar-notification")).getCssValue("background-color");
        String color_hex = Color.fromString(color_rgb).asHex();
        Assert.assertEquals(color_hex, "#4bb07a");
    }

    //Wishlist - Scenario 2

    public WebElement Click_wishlist_icon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement wishlist = driver.findElement(By.id("bar-notification"));
        wait.until(ExpectedConditions.invisibilityOf(wishlist));
        return driver.findElement(By.cssSelector(".wishlist-label"));
    }

    public void verify_Qty() {

        int Qty_Value = Integer.parseInt(driver.findElement(By.cssSelector("input.qty-input")).getAttribute("value"));
        Assert.assertTrue(Qty_Value>0);

    }


}

