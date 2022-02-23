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

public class US1_Login_to_HomePage {

    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement clickLoginButton;
    String actual_incorrectLoginOrPassword;
    String expected_incorrectLoginOrPassword="Incorrect login or password";

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
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("hr67@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();
    }

    @Test
    public void loginHr68(){
        username = driver.findElement(By.cssSelector("div>input[name='USER_LOGIN']"));
        username.sendKeys("hr68@cydeo.com");

        password = driver.findElement(By.cssSelector("div>input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.cssSelector("div>input[value='Log In']"));
        clickLoginButton.click();

    }

    @Test
    public void loginHr69(){
        username = driver.findElement(By.cssSelector("input[class='login-inp'][type='text']"));
        username.sendKeys("hr69@cydeo.com");

        password = driver.findElement(By.cssSelector("input[class='login-inp'][type='password']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.cssSelector("input[type='submit'][class='login-btn']"));
        clickLoginButton.submit();
    }

    @Test
    public void loginHelpDesk67(){
        username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("helpdesk67@cydeo.com");

        password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        clickLoginButton=driver.findElement(By.className("login-btn"));
        clickLoginButton.click();

    }
    @Test
    public void loginHelpDesk68(){
        username= driver.findElement(By.xpath("//input[contains(@name,'USER_LOGIN')]"));
        username.sendKeys("helpdesk68@cydeo.com");

        password= driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("UserUser");

        clickLoginButton=driver.findElement(By.cssSelector("input[type='submit']"));
        clickLoginButton.click();

    }

    @Test
    public void loginHelpDesk69(){
        username= driver.findElement(By.cssSelector("input[placeholder='Login']"));
        username.sendKeys("helpdesk69@cydeo.com");

        password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser");

        clickLoginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        clickLoginButton.click();
    }

    @Test
    public void marketing67(){
        username= driver.findElement(By.cssSelector("input[placeholder='Login']"));
        username.sendKeys("marketing67@cydeo.com");

        password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("UserUser");

        clickLoginButton= driver.findElement(By.cssSelector("input[type='submit'][value='Log In']"));
        clickLoginButton.click();
    }

    @Test
    public void marketing68(){
        username = driver.findElement(By.cssSelector("div>input[name='USER_LOGIN']"));
        username.sendKeys("marketing68@cydeo.com");

        password = driver.findElement(By.cssSelector("div>input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.cssSelector("div>input[value='Log In']"));
        clickLoginButton.click();

    }

    @Test
    public void marketing69(){
        username = driver.findElement(By.cssSelector("input[class='login-inp'][type='text']"));
        username.sendKeys("marketing69@cydeo.com");

        password = driver.findElement(By.cssSelector("input[class='login-inp'][type='password']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.cssSelector("input[type='submit'][class='login-btn']"));
        clickLoginButton.submit();
    }

    @Test
    public void incorrectUsername(){
        username = driver.findElement(By.cssSelector("input[class='login-inp'][type='text']"));
        username.sendKeys("jdhfds@cydeo.com");

        password = driver.findElement(By.cssSelector("input[class='login-inp'][type='password']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.cssSelector("input[type='submit'][class='login-btn']"));
        clickLoginButton.submit();

        actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();

        Assert.assertEquals(actual_incorrectLoginOrPassword,expected_incorrectLoginOrPassword,"Failed");
    }

    @Test
    public void incorrectPassword(){
        username = driver.findElement(By.cssSelector("div>input[name='USER_LOGIN']"));
        username.sendKeys("marketing68@cydeo.com");

        password = driver.findElement(By.cssSelector("div>input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser!");

        clickLoginButton = driver.findElement(By.cssSelector("div>input[value='Log In']"));
        clickLoginButton.click();

        actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();
        Assert.assertEquals(actual_incorrectLoginOrPassword,expected_incorrectLoginOrPassword,"Failed");
    }
    @Test
    public void EmptyUserName(){
        username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("       ");

        password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        clickLoginButton=driver.findElement(By.className("login-btn"));
        clickLoginButton.click();

        actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();
        Assert.assertEquals(actual_incorrectLoginOrPassword,expected_incorrectLoginOrPassword,"Failed");
    }

    @Test
    public void EmptyPassword(){
        username= driver.findElement(By.cssSelector("input[placeholder='Login']"));
        username.sendKeys("marketing67@cydeo.com");

        password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("");

        clickLoginButton= driver.findElement(By.cssSelector("input[type='submit'][value='Log In']"));
        clickLoginButton.click();

        actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();
        Assert.assertEquals(actual_incorrectLoginOrPassword,expected_incorrectLoginOrPassword,"Failed");
    }

    @Test
    public void EmptyCredentials(){
        username= driver.findElement(By.xpath("//input[contains(@name,'USER_LOGIN')]"));
        username.sendKeys(" ");

        password= driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("");

        clickLoginButton=driver.findElement(By.cssSelector("input[type='submit']"));
        clickLoginButton.click();

        actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();
        Assert.assertEquals(actual_incorrectLoginOrPassword,expected_incorrectLoginOrPassword,"Failed");
    }
}
