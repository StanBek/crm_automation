package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US04 {
    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement clickLoginButton;
    WebElement menuButton;
    WebElement myProfile;
    WebElement editProfileSettings;
    WebElement themesButton;
    WebElement configureNotifications;
    WebElement logOut;

    @BeforeMethod
    public void setup(){

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
    public void loginHr66(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("hr66@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


    }



    @Test
    public void loginHr67(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("hr67@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


    }

    @Test
    public void loginHr68(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("hr68@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


        System.out.println("---------------------------------------------------------------------------");
    }

    @Test
    public void helpDesk66(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("helpDesk66@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


    }



    @Test
    public void helpDesk67(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("helpDesk67@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


    }

    @Test
    public void helpDesk68(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("helpDesk68@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


        System.out.println("---------------------------------------------------------------------------");
    }


    @Test
    public void marketing66(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("marketing66@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


    }



    @Test
    public void marketing67(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("marketing67@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


    }

    @Test
    public void marketing68(){
        username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        username.sendKeys("marketing68@cydeo.com");

        password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        clickLoginButton = driver.findElement(By.xpath("//div/input[@value='Log In']"));
        clickLoginButton.click();

        menuButton = driver.findElement(By.xpath("//span[@id='user-name']"));
        menuButton.click();

        myProfile = driver.findElement(By.xpath("//span[.='My Profile']"));
        myProfile.isDisplayed();

        editProfileSettings = driver.findElement(By.xpath("//span[.='Edit Profile Settings']"));
        editProfileSettings.isDisplayed();

        themesButton = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[1]/span[2]"));
        themesButton.isDisplayed();

        configureNotifications = driver.findElement(By.xpath("//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/span[2]/span[2]"));
        configureNotifications.isDisplayed();

        logOut = driver.findElement(By.xpath("//span[.='Log out']"));
        logOut.isDisplayed();


        System.out.println("---------------------------------------------------------------------------");
    }


}
