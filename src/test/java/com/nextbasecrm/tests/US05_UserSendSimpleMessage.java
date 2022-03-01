package com.nextbasecrm.tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class US05_UserSendSimpleMessage {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void TC2_Users_get_errorMessageTitle() {
        // go to home page
        driver.get("https://login1.nextbasecrm.com/");


        // locate input box write credentials
        WebElement userInputBox = driver.findElement(By.name("USER_LOGIN"));
        userInputBox.sendKeys("marketing67@cydeo.com");

        WebElement userPasswordBox = driver.findElement(By.name("USER_PASSWORD"));
        userPasswordBox.sendKeys("UserUser");

        //click login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //click message tab
        WebElement messageTab = driver.findElement(By.id("feed-add-post-form-tab-message"));
        messageTab.click();

        //click send button
        WebElement sendBtn = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendBtn.click();

        //display "The message title is not specified"
        WebElement messageTitle = driver.findElement(By.cssSelector("div[class='feed-add-error']"));
        System.out.println("messageTitle.isDisplayed() = " + messageTitle.isDisplayed());



    }


    @Test
    public void TC1_Users_send_message_successfully(){
        // go to home page
        driver.get("https://login2.nextbasecrm.com/");

        // locate input box write credentials
        WebElement userInputBox = driver.findElement(By.name("USER_LOGIN"));
        userInputBox.sendKeys("marketing67@cydeo.com");

        WebElement userPasswordBox = driver.findElement(By.name("USER_PASSWORD"));
        userPasswordBox.sendKeys("UserUser");

        //click login button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //click message tab
        WebElement messageTab = driver.findElement(By.id("feed-add-post-form-tab-message"));
        messageTab.click();

        //write message in the message body
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello");

        driver.switchTo().parentFrame();

        //click send button
        WebElement sendBtn = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendBtn.click();

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}


