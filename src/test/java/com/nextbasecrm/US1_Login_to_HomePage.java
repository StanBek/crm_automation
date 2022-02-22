package com.nextbasecrm;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US1_Login_to_HomePage {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
     driver = WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://login2.nextbasecrm.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }


    @Test
    public void verify_Authorization(){
        WebElement verify_Authorization = driver.findElement(By.xpath("//div[text()='Authorization']"));
        verify_Authorization.isDisplayed();
    }

    @Test
    public void loginHr67(){
        WebElement username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("hr67@cydeo.com");

        WebElement password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();
    }

    @Test
    public void loginHr68(){
        WebElement username = driver.findElement(By.cssSelector("div>input[name='USER_LOGIN']"));
        username.sendKeys("hr68@cydeo.com");

        WebElement password = driver.findElement(By.cssSelector("div>input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement clickLoginButton = driver.findElement(By.cssSelector("div>input[value='Log In']"));
        clickLoginButton.click();

    }

    @Test
    public void loginHr69(){
        WebElement username = driver.findElement(By.cssSelector("input[class='login-inp'][type='text']"));
        username.sendKeys("hr69@cydeo.com");

        WebElement password = driver.findElement(By.cssSelector("input[class='login-inp'][type='password']"));
        password.sendKeys("UserUser");

        WebElement clickLoginButton = driver.findElement(By.cssSelector("input[type='submit'][class='login-btn']"));
        clickLoginButton.submit();
    }


}
