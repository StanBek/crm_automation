package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US2_RememberMe_Checkbox {

        WebDriver driver;

        @BeforeMethod
        public void setUp () {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/");
        }

        @AfterMethod
        public void tearDown () {
            BrowserUtils.sleep(3);
            driver.close();
        }

        @Test
        public void verify_Checkbox() {
            //Locate checkbox
            WebElement verify_Checkbox = driver.findElement(By.xpath("//input[@name='USER_REMEMBER']"));
            verify_Checkbox.isDisplayed();

        }

        @Test
        public void click_Checkbox(){
            //Verify user can check the "remember me" checkbox.
            WebElement click_Checkbox = driver.findElement(By.xpath("//input[@name='USER_REMEMBER']"));
            click_Checkbox.click();
        }

        @Test
        public void confirm_RememberMeText(){
            //Verify there is a “Remember me on this computer” message displayed.
            WebElement checkbox_Message = driver.findElement(By.className("login-item-checkbox-label"));
            checkbox_Message.isDisplayed();

        }


    }
