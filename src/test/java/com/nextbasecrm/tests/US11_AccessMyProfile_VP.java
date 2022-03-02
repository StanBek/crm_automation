package com.nextbasecrm.tests;

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

public class US11_AccessMyProfile_VP {

        WebDriver driver;

        String UserName = "helpdesk66@cydeo.com";
        String Password = "UserUser";

        @BeforeMethod
        public void setUp(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login1.nextbasecrm.com/");

            WebElement LoginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            LoginBox.sendKeys(UserName);

            WebElement PasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            PasswordBox.sendKeys(Password);

            WebElement LoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
            LoginButton.click();
        }

        @Test
        public void profilePageAccess() {
            WebElement Tab = driver.findElement(By.xpath("//*[@id='user-block']"));
            Tab.click();

            WebElement MyProfile = driver.findElement(By.xpath("//*[@id=\'popup-window-content-menu-popup-user-menu\']/div/div/a[1]/span[2]"));
            MyProfile.click();

            List<WebElement> listOfHeaderWebElements = driver.findElements(By.xpath("//*[@id=\'profile-menu-filter\']/a[1]"));

            for (WebElement headerWebElement : listOfHeaderWebElements) {
                Assert.assertTrue(headerWebElement.isDisplayed());
            }
        }

        @AfterMethod
        public void tearDown() {

            driver.close();
        }
    }


