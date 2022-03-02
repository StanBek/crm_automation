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

public class US13_Users_send_Appreciation_message {

    WebDriver driver;
    String password = "UserUser";

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");

    }

    @Test
    public void TC1_send_appreciation_message_hr(){

        // hr67@cydeo.com
        // hr68@cydeo.com
        // hr69@cydeo.com

        //user go to homepage
        CRM_Utilities.crm_login(driver,"hr67@cydeo.com",password);

        //click "MORE" tab
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreTab.click();

        //select "Appreciation" tab
        WebElement appreciationTab = driver.findElement(By.xpath("//div[@class='menu-popup-items']/span[2]"));
        appreciationTab.click();

        Assert.assertTrue(appreciationTab.isDisplayed());

        //enter message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        WebElement messageArea = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        messageArea.sendKeys("appreciation message test 1");

        driver.switchTo().parentFrame();

        //click send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

    }

    @Test
    public void TC1_send_appreciation_message_helpDesk(){

        //helpdesk67@cydeo.com
        //helpdesk68@cydeo.com
        //helpdesk69@cydeo.com
        // user go to homepage
        CRM_Utilities.crm_login(driver,"helpdesk67@cydeo.com",password);

        //click "MORE" tab
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreTab.click();

        //select "Appreciation" tab
        WebElement appreciationTab = driver.findElement(By.xpath("//div[@class='menu-popup-items']/span[2]"));
        appreciationTab.click();

        Assert.assertTrue(appreciationTab.isDisplayed());

        //enter message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        WebElement messageArea = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        messageArea.sendKeys("testTestTest");

        driver.switchTo().parentFrame();

        //click send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

    }

    @Test
    public void TC1_send_appreciation_message_marketing(){

        //marketing67@cydeo.com
        //marketing68@cydeo.com
        //marketing69@cydeo.com
        //user go to homepage
        CRM_Utilities.crm_login(driver,"marketing67@cydeo.com",password);

        //click "MORE" tab
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreTab.click();

        //select "Appreciation" tab
        WebElement appreciationTab = driver.findElement(By.xpath("//div[@class='menu-popup-items']/span[2]"));
        appreciationTab.click();

        Assert.assertTrue(appreciationTab.isDisplayed());

        //enter message
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        WebElement messageArea = driver.findElement(By.xpath("//body[@contenteditable='true']"));
        messageArea.sendKeys("appreciation message test 2");

        driver.switchTo().parentFrame();

        //click send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

    }


    @Test
    public void TC2_send_appreciation_message_without_content_hr(){

        // hr67@cydeo.com
        // hr68@cydeo.com
        // hr69@cydeo.com

        //user go to homepage
        CRM_Utilities.crm_login(driver,"hr69@cydeo.com",password);

        //click "MORE" tab
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreTab.click();

        //select "Appreciation" tab
        WebElement appreciationTab = driver.findElement(By.xpath("//div[@class='menu-popup-items']/span[2]"));
        appreciationTab.click();

        Assert.assertTrue(appreciationTab.isDisplayed());

        //click send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

        //message title displayed
        String expMessTitle="The message title is not specified";

        WebElement messageTitle = driver.findElement(By.xpath("//span[@class='feed-add-info-text']"));

        Assert.assertTrue(messageTitle.isDisplayed());
        Assert.assertEquals(messageTitle.getText(),expMessTitle);


    }

    @Test
    public void TC2_send_appreciation_message_without_content_helpDesk(){
        //helpdesk67@cydeo.com
        //helpdesk68@cydeo.com
        //helpdesk69@cydeo.com
        // user go to homepage
        CRM_Utilities.crm_login(driver,"helpdesk69@cydeo.com",password);

        //click "MORE" tab
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreTab.click();

        //select "Appreciation" tab
        WebElement appreciationTab = driver.findElement(By.xpath("//div[@class='menu-popup-items']/span[2]"));
        appreciationTab.click();

        Assert.assertTrue(appreciationTab.isDisplayed());

        //click send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

        //message title displayed
        String expMessTitle="The message title is not specified";

        WebElement messageTitle = driver.findElement(By.xpath("//span[@class='feed-add-info-text']"));

        Assert.assertTrue(messageTitle.isDisplayed());
        Assert.assertEquals(messageTitle.getText(),expMessTitle);

    }

    @Test
    public void TC2_send_appreciation_message_without_content_marketing(){

        //marketing67@cydeo.com
        //marketing68@cydeo.com
        //marketing69@cydeo.com
        //user go to homepage
        CRM_Utilities.crm_login(driver,"marketing69@cydeo.com",password);

        //click "MORE" tab
        WebElement moreTab = driver.findElement(By.xpath("//span[@id='feed-add-post-form-link-more']"));
        moreTab.click();

        //select "Appreciation" tab
        WebElement appreciationTab = driver.findElement(By.xpath("//div[@class='menu-popup-items']/span[2]"));
        appreciationTab.click();

        Assert.assertTrue(appreciationTab.isDisplayed());

        //click send button
        WebElement sendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();

        //message title displayed
        String expMessTitle="The message title is not specified";

        WebElement messageTitle = driver.findElement(By.xpath("//span[@class='feed-add-info-text']"));

        Assert.assertTrue(messageTitle.isDisplayed());
        Assert.assertEquals(messageTitle.getText(),expMessTitle);

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
