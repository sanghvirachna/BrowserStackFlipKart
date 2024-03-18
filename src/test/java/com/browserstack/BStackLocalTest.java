package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackLocalTest extends SeleniumTest {

    @Test
    public void test() throws Exception {
    	driver.get("https://www.flipkart.com");
        System.out.println("Title: " + driver.getTitle());

        Assert.assertTrue(driver.getTitle().contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
    }
}
