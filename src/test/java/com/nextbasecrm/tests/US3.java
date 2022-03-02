package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US3 {
WebDriver driver;
WebElement verify;
@BeforeMethod
    public void setUpMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
    public void deskTopOptionTest(){
    driver.get("https://login2.nextbasecrm.com/");
    WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    inputUserName.sendKeys("helpdesk67@cydeo.com");
    WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    inputPassword.sendKeys("UserUser");

    WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
    loginButton.click();

    WebElement logoutBtn = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]/span[2]"));

    logoutBtn.click();

    verify = driver.findElement(By.xpath("//*[@id=\"login-popup\"]"));

    verify.isDisplayed();

}

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}

