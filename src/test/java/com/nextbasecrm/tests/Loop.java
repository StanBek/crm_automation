package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Loop {

    WebDriver driver;
    String password = "UserUser";
    WebElement chatAndCalls;
    List<WebElement> chatAndCallsModules;

    @Test
    public void loginSetUp() {

        List<String> UserList = new ArrayList<>(Arrays.asList("hr67@cydeo.com","hr68@cydeo.com", "hr69@cydeo.com",
                "helpdesk67@cydeo.com", "helpdesk68@cydeo.com", "helpdesk69@cydeo.com",
                "marketing67@cydeo.com", "marketing68@cydeo.com", "marketing69@cydeo.com"));
        for (String credential : UserList) {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login1.nextbasecrm.com/");

            CRM_Utilities.crm_login(driver, credential, password);

            chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
            chatAndCalls.click();

            chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

            for (WebElement eachModule : chatAndCallsModules) {
                Assert.assertTrue(eachModule.isDisplayed());
            }

            driver.close();

        }
    }


}
