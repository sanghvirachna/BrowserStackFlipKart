package com.browserstack;

import com.browserstack.SeleniumTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackDemoTest extends SeleniumTest {
    @Test
    public void searchProduct() throws Exception {
        // navigate to flipkart
        driver.get("https://www.flipkart.com");
        System.out.println("Title: " + driver.getTitle());

        // Check the title
        Assert.assertTrue(driver.getTitle().matches("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));

        // Find the search box and enter the product name
        driver.findElement(By.name("q")).sendKeys("Samsung Galaxy S10");

        // Submit the search
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Click on "Mobiles" in categories
        new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.linkText("Mobiles"))).click();

        // Wait for the filters to load
        new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Brand']")));

        // Apply filters
     // Apply filters
     // Apply filters
     // Apply filters
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='SAMSUNG']/ancestor::label"))).click();

     // Apply filters
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//img[contains(@src, 'fa_62673a.png')]/ancestor::label"))).click();

        // Sort the entries with Price -> High to Low
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Price -- High to Low']"))).click();

        // Wait for the results to load
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div._2kHMtA")));

        // Create a list with product details
     // Create a list with product details
     // Create a list with product details
        List<WebElement> products = driver.findElements(By.cssSelector("div._2kHMtA"));
        for (WebElement product : products) {
            String productName = product.findElement(By.cssSelector("div._4rR01T")).getText();
            String displayPrice = product.findElement(By.cssSelector("div._30jeq3._1_WHN1")).getText();
            String productDetailsLink = product.findElement(By.cssSelector("a._1fQZEK")).getAttribute("href");

            System.out.println("Product Name: " + productName);
            System.out.println("Display Price: " + displayPrice);
            System.out.println("Link to Product Details Page: " + productDetailsLink);
        }
    }
}