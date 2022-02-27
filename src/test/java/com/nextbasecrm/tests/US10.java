package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;




public class US10 {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
//Users are on the homepage
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get(" https://login2.nextbasecrm.com/");
       // String username = "hr68@cydeo.com";
        //String password = "UserUser";
       // CRM_Utilities.crm_login(driver, username, password);
    }



    @Test
    public void crm_login_test() {
        driver.get(" https://login2.nextbasecrm.com/");
        WebElement inputUsername = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        inputUsername.sendKeys("hr68@cydeo.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        inputPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
         loginButton.click();
        WebElement taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        WebElement inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("CYDEO");
    }




}
