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

     public WebDriver driver;

     @BeforeMethod
     public void setupMethod() {
          //Users are on the homepage

          driver = WebDriverFactory.getDriver("chrome");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          driver.get(" https://login2.nextbasecrm.com/");
          WebElement inputUsername = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input"));
          inputUsername.sendKeys("hr68@cydeo.com");

          WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input"));
          inputPassword.sendKeys("UserUser");

          WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input"));
          loginButton.click();
     }

     @Test
     public void send_announcement() {


          //Click more tab
          WebElement moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
          moreTab.click();
          Assert.assertTrue(moreTab.isDisplayed());
          WebElement Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
          Announcement_tab.click();
          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
          WebElement white_box = driver.findElement(By.cssSelector("body[contenteditable='true']"));
          white_box.sendKeys("Today was a productive day");
          driver.switchTo().parentFrame();
          WebElement sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
          sendBtn.click();
     }

     @Test
     public void error_msg() {
          WebElement moreTab = driver.findElement(By.xpath("//span[@id=\"feed-add-post-form-link-text\"]"));
          moreTab.click();
          Assert.assertTrue(moreTab.isDisplayed());
          WebElement Announcement_tab = driver.findElement(By.xpath("//div//span[3]/span[.='Announcement']"));
          Announcement_tab.click();
          WebElement sendBtn = driver.findElement(By.xpath("//button[@id=\"blog-submit-button-save\"]"));
          sendBtn.click();
          WebElement verify = driver.findElement(By.xpath("//span[.='The message title is not specified']"));
          verify.isDisplayed();
     }


     @AfterMethod
     public void tearDown() {
          driver.close();
     }
}