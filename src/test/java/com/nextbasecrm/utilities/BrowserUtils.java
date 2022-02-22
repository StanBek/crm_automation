package com.nextbasecrm.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    //This method accepts a String "expectedTitle" and Asserts if it is true
    public static void VerifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    //This method will accept int and execute Thread.sleep
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {

        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

}
