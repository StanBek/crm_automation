package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US_14_desktop_icons {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void cram_desktop_icons() throws InterruptedException {
        driver.get("https://login2.nextbasecrm.com");

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk55@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");


        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

        WebElement desktopIcon =driver.findElement(By.xpath("(//div[@class='b24-app-block b24-app-desktop']/div)[1]"));


        String actualIcon = desktopIcon.getText();
        String expectedIcon = "DESKTOP CLIENT";

        Assert.assertEquals(actualIcon,expectedIcon);

        WebElement macOsBtn = driver.findElement(By.xpath("//*[contains(text(),'Mac OS')]"));
        String actualMacOsBtn = macOsBtn.getText();
        String expectedMacOsBtn = "MAC OS";

        Assert.assertEquals(actualMacOsBtn,expectedMacOsBtn);

        WebElement windowsBtn = driver.findElement(By.xpath("//*[@class='b24-app-block b24-app-desktop']/div/a/span[contains(text(),'Windows')]"));
        String actualWindowsBtn = windowsBtn.getText();
        String expectedWindowsBtn = "WINDOWS";

        Assert.assertEquals(actualWindowsBtn,expectedWindowsBtn);

        WebElement linuxBtn = driver.findElement(By.xpath("//*[@class='b24-app-block b24-app-desktop']/div/a/span[contains(text(),'Linux')]"));
        String actualLinuxBtn = linuxBtn.getText();
        String expectedLinuxBtn = "LINUX";

        Assert.assertEquals(actualLinuxBtn,expectedLinuxBtn);



    }
}
