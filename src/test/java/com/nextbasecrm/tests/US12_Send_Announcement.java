package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class US12_Send_Announcement {

    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement sendBtn;
    WebElement verify;
    WebElement moreTab;
    WebElement Announcement_tab;
    WebElement white_box;



    @BeforeMethod
    public void setupMethod() {
        //Users are on the homepage

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(" https://login2.nextbasecrm.com/");

    }

    @Test
    public void send_announcement_as_user_hr67() {


        //Click more tab
        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr67@cydeo.com");

        password = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        loginButton.click();

        moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
        moreTab.click();
        Assert.assertTrue(moreTab.isDisplayed());
        Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
        Announcement_tab.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        white_box = driver.findElement(By.cssSelector("body[contenteditable='true']"));
        white_box.sendKeys("Today was a productive day");
        driver.switchTo().parentFrame();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
    }


    @Test
    public void error_msg_as_user_hr67() {
        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr67@cydeo.com");

        password = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        loginButton.click();

        moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
        moreTab.click();
        Assert.assertTrue(moreTab.isDisplayed());
        Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
        Announcement_tab.click();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
        verify = driver.findElement(By.xpath("//span[.='The message title is not specified']"));
        verify.isDisplayed();
    }

    @Test
    public void send_announcement_as_user_hr68() {


        //Click more tab
        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr68@cydeo.com");

        password = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        loginButton.click();

        moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
        moreTab.click();
        Assert.assertTrue(moreTab.isDisplayed());
        Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
        Announcement_tab.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        white_box = driver.findElement(By.cssSelector("body[contenteditable='true']"));
        white_box.sendKeys("Today was a productive day");
        driver.switchTo().parentFrame();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
    }


    @Test
    public void error_msg_as_user_hr68() {
        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr68@cydeo.com");

        password = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        loginButton.click();

        moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
        moreTab.click();
        Assert.assertTrue(moreTab.isDisplayed());
        Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
        Announcement_tab.click();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
        verify = driver.findElement(By.xpath("//span[.='The message title is not specified']"));
        verify.isDisplayed();
    }
    @Test
    public void send_announcement_as_user_hr69() {


        //Click more tab
        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr69@cydeo.com");

        password = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        loginButton.click();

        moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
        moreTab.click();
        Assert.assertTrue(moreTab.isDisplayed());
        Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
        Announcement_tab.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        white_box = driver.findElement(By.cssSelector("body[contenteditable='true']"));
        white_box.sendKeys("Today was a productive day");
        driver.switchTo().parentFrame();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
    }


    @Test
    public void error_msg_as_user_hr69() {
        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr69@cydeo.com");

        password = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        loginButton.click();

        moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
        moreTab.click();
        Assert.assertTrue(moreTab.isDisplayed());
        Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
        Announcement_tab.click();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
        verify = driver.findElement(By.xpath("//span[.='The message title is not specified']"));
        verify.isDisplayed();
    }



    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}