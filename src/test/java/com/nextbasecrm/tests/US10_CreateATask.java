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

import java.util.concurrent.TimeUnit;

public class US10_CreateATask {

    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement clickLoginButton;
    WebElement taskTab;
    WebElement inputTitle;
    WebElement contentMessage;
    WebElement sendBtn;
    WebElement verify;





    @BeforeMethod
    public void setupMethod() {
        //Users are on the homepage
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(" https://login2.nextbasecrm.com/");

    }


    //            Users click the TASK tab
    @Test
    public void test_create_as_user_hr68() {

        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("hr68@cydeo.com");

        password= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        clickLoginButton.click();



       taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("CYDEO");

//    Users click the SEND button
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-lifefeed_task_form\"]/iframe")));
      contentMessage = driver.findElement(By.cssSelector("body[style=\"min-height: 84px;\"]"));
        contentMessage.sendKeys("Hello World");
        driver.switchTo().parentFrame();
      sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
//            Verify the task is displayed on the feed
      verify = driver.findElement(By.xpath("//div[@id=\"sonet_log_day_item_KB7VoSvE\"]"));
        verify.isDisplayed();

    }

    @Test
    public void errorMsg_as_user_hr68() {
        //            Users write task title and task content/message
         taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("");

        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();

        verify = driver.findElement(By.xpath("//div[@id=\"feed-add-post-content-tasks-container\"]"));
        verify.isDisplayed();
    }

    @Test
    public void test_create_as_user_helpdesk68() {

        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("helpdesk68@cydeo.com");

        password= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        clickLoginButton.click();



        taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("CYDEO");

//    Users click the SEND button
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-lifefeed_task_form\"]/iframe")));
        contentMessage = driver.findElement(By.cssSelector("body[style=\"min-height: 84px;\"]"));
        contentMessage.sendKeys("Hello World");
        driver.switchTo().parentFrame();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
//            Verify the task is displayed on the feed
        verify = driver.findElement(By.xpath("//div[@id=\"sonet_log_day_item_KB7VoSvE\"]"));
        verify.isDisplayed();

    }

    @Test
    public void errorMsg_as_user_helpdesk68() {
        //            Users write task title and task content/message
        taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("");

        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();

        verify = driver.findElement(By.xpath("//div[@id=\"feed-add-post-content-tasks-container\"]"));
        verify.isDisplayed();
    }



    @Test
    public void test_create_as_user_marketing68() {

        username = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
        username.sendKeys("marketing68@cydeo.com");

        password= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
        clickLoginButton.click();



        taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("CYDEO");

//    Users click the SEND button
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"bx-html-editor-iframe-cnt-lifefeed_task_form\"]/iframe")));
        contentMessage = driver.findElement(By.cssSelector("body[style=\"min-height: 84px;\"]"));
        contentMessage.sendKeys("Hello World");
        driver.switchTo().parentFrame();
        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();
//            Verify the task is displayed on the feed
        verify = driver.findElement(By.xpath("//div[@id=\"sonet_log_day_item_KB7VoSvE\"]"));
        verify.isDisplayed();

    }

    @Test
    public void errorMsg_as_user_marketing68() {
        //            Users write task title and task content/message
        taskTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        Assert.assertTrue(taskTab.isDisplayed());

        inputTitle = driver.findElement(By.xpath("//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']"));
        inputTitle.sendKeys("");

        sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
        sendBtn.click();

        verify = driver.findElement(By.xpath("//div[@id=\"feed-add-post-content-tasks-container\"]"));
        verify.isDisplayed();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}












