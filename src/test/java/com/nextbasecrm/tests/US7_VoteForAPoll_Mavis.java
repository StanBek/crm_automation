package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US7_VoteForAPoll_Mavis {
    WebDriver driver;

    String UserName = "helpdesk67@cydeo.com";
    String Password = "UserUser";
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void US7_VoteForPollTest() throws InterruptedException {

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(UserName);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(Password);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-vote']/span[contains(text(), 'Poll')]")).click();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 7000)", "");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='feed-new-message-inf-text']")).click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 3000)", "");
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("(//span[@class='bx-vote-block-inp-substitute'])[1]")).isDisplayed()) {
            driver.findElement(By.xpath("(//span[@class='bx-vote-block-inp-substitute'])[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='ui-btn ui-btn-lg ui-btn-primary' and @data-bx-vote-button='actVoting']")).click();
            Thread.sleep(3000);
            WebElement voteAgainText = driver.findElement(By.xpath("(//button[contains(text(), 'Vote again')])[1]"));
            Thread.sleep(3000);
            Assert.assertTrue(voteAgainText.isDisplayed());
        }else{
            WebElement voteAgainText = driver.findElement(By.xpath("(//button[contains(text(), 'Vote again')])[1]"));
            Thread.sleep(3000);
            Assert.assertTrue(voteAgainText.isDisplayed());
        }



    }
}
