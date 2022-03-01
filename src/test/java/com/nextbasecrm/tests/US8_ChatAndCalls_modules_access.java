package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US8_ChatAndCalls_modules_access {

    WebDriver driver;
    String password = "UserUser";
    WebElement chatAndCalls;
    List<WebElement> chatAndCallsModules;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }

    @Test
    public void hr1(){

        CRM_Utilities.crm_login(driver, "hr67@cydeo.com", password);


        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }


    }

    @Test
    public void hr2(){

        CRM_Utilities.crm_login(driver, "hr68@cydeo.com", password);


        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }


    }

    @Test
    public void hr3(){

        CRM_Utilities.crm_login(driver, "hr69@cydeo.com", password);


        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }


    }

    @Test
    public void helpDesk1(){

        CRM_Utilities.crm_login(driver, "helpdesk67@cydeo.com", password);

        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }


    }

    @Test
    public void helpDesk2(){

        CRM_Utilities.crm_login(driver, "helpdesk68@cydeo.com", password);

        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }


    }

    @Test
    public void helpDesk3(){

        CRM_Utilities.crm_login(driver, "helpdesk69@cydeo.com", password);

        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }


    }

    @Test
    public void marketing1(){

        CRM_Utilities.crm_login(driver, "marketing67@cydeo.com", password);


        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }



    }

    @Test
    public void marketing2(){

        CRM_Utilities.crm_login(driver, "marketing68@cydeo.com", password);

        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }

    }

    @Test
    public void marketing3(){

        CRM_Utilities.crm_login(driver, "marketing69@cydeo.com", password);

        chatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']/span[@class='menu-item-link-text']"));
        chatAndCalls.click();

        chatAndCallsModules = driver.findElements(By.xpath("//div[contains(@class, 'bx-desktop-tab-icon bx-desktop-tab-icon')]"));

        for (WebElement eachModule : chatAndCallsModules) {
            Assert.assertTrue(eachModule.isDisplayed());
        }



    }


}
