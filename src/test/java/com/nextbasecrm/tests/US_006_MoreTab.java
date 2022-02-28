package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_006_MoreTab {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void MoreDropDown_HR1(){
        //hr67@cydeo.com
        //hr68@cydeo.com
        //hr69@cydeo.com
        //UserUser
        CRM_Utilities.crm_login(driver,"hr67@cydeo.com","UserUser");
        WebElement moreButtonLocator=driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-link-text\"]"));
        moreButtonLocator.click();
        List<WebElement> AllMore_Options=driver.findElements(By.xpath("//*[@class='menu-popup-item-text']"));
        System.out.println("AllMore_Options.size() = " + AllMore_Options.size());
        for (WebElement eachMore_option : AllMore_Options) {
            System.out.println("eachMore_option.getText() = " + eachMore_option.getText());
        }
    }
    @Test
    public void MoreDropDown_helpDesk() {
        //   helpdesk67@cydeo.com
        //    helpdesk68@cydeo.com
        //    helpdesk69@cydeo.com
        //    UserUser
        CRM_Utilities.crm_login(driver,"helpDesk67@cydeo.com","UserUser");
        WebElement moreButtonLocator = driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-link-text\"]"));
        moreButtonLocator.click();
        List<WebElement> AllMore_Options = driver.findElements(By.xpath("//*[@class='menu-popup-item-text']"));
        System.out.println("AllMore_Options.size() = " + AllMore_Options.size());
        for (WebElement eachMore_option : AllMore_Options) {
            System.out.println("eachMore_option.getText() = " + eachMore_option.getText());
        }
    }
    @Test
    public void MoreDropDown_marketing() {
        //    marketing67@cydeo.com
//    marketing68@cydeo.com
//    marketing69@cydeo.com
        //    UserUser
        CRM_Utilities.crm_login(driver,"marketing67@cydeo.com","UserUser");
        WebElement moreButtonLocator = driver.findElement(By.xpath("//*[@id=\"feed-add-post-form-link-text\"]"));
        moreButtonLocator.click();
        List<WebElement> AllMore_Options = driver.findElements(By.xpath("//*[@class='menu-popup-item-text']"));
        System.out.println("AllMore_Options.size() = " + AllMore_Options.size());
        for (WebElement eachMore_option : AllMore_Options) {
            System.out.println("eachMore_option.getText() = " + eachMore_option.getText());
        }
    }





}
