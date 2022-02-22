package com.nextbasecrm.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {

    //This method accepts a String "expectedTitle" and Asserts if it is true
    public static void VerifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }



}
