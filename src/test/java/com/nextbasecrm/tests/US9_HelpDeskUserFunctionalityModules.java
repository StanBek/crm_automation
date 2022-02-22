package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US9_HelpDeskUserFunctionalityModules {
    WebDriver driver;

    //helpdesk67@cydeo.com
    //helpdesk68@cydeo.com
    //helpdesk69@cydeo.com

    String UserName = "helpdesk67@cydeo.com";
    String Password = "UserUser";

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com");

        //The User can navigate between modules successfully (expected result equals to actual result)
        WebElement LoginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        LoginBox.sendKeys(UserName);
        WebElement PasswordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        PasswordBox.sendKeys(Password);
        WebElement LoginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        LoginButton.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test_HrUserNavigationToActivityModule() {

        //1.Activity module
        WebElement ActivityStream = driver.findElement(By.xpath("//a[@title='Activity Stream']"));
        ActivityStream.click();
        BrowserUtils.VerifyTitle(driver,"Portal");

    }

    @Test
    public void test_HrUserNavigationToTaskModule() {

        //2.Tasks module
        WebElement TasksModule = driver.findElement(By.xpath("//a[@title='Tasks']"));
        TasksModule.click();
        BrowserUtils.VerifyTitle(driver,"Site map");
    }

    @Test
    public void test_HrUserNavigationToChatAndCallsModule() {

        //3.ChatAndCalls module
        WebElement ChatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
        ChatAndCalls.click();
        BrowserUtils.VerifyTitle(driver,"Chat and Calls");
    }

    @Test
    public void test_HrUserNavigationToWorkgroupsModule() {

        //4.Workgroups
        WebElement Workgroups = driver.findElement(By.xpath("//a[@title='Workgroups']"));
        Workgroups.click();
        BrowserUtils.VerifyTitle(driver,"Workgroups and projects");
    }

    @Test
    public void test_HrUserNavigationToDriveModule() {

        //5.DriveModule
        WebElement DriveModule = driver.findElement(By.xpath("//a[@title='Drive']"));
        DriveModule.click();
        BrowserUtils.VerifyTitle(driver,"Site map");
    }

    @Test
    public void test_HrUserNavigationToCalendarModule() {

        //6.CalendarModule
        WebElement CalendarModule = driver.findElement(By.xpath("//a[@title='Calendar']"));
        CalendarModule.click();
        BrowserUtils.VerifyTitle(driver,"Site map");
    }

    @Test
    public void test_HrUserNavigationToContactCenterModule() {

        //7.ContactCenterModule
        WebElement ContactCenterModule = driver.findElement(By.xpath("//a[@title='Contact Center']"));
        ContactCenterModule.click();
        BrowserUtils.VerifyTitle(driver,"Contact Center");
    }

    @Test
    public void test_HrUserNavigationToTimeAndReportsModule() {

        //8.TimeAndReportsModule
        WebElement TimeAndReportsModule = driver.findElement(By.xpath("//a[@title='Time and Reports']"));
        TimeAndReportsModule.click();
        BrowserUtils.VerifyTitle(driver,"Absence Chart");
    }

    @Test
    public void test_HrUserNavigationToEmployeesModule() {

        //9.EmployeesModule
        WebElement EmployeesModule = driver.findElement(By.xpath("//a[@title='Employees']"));
        EmployeesModule.click();
        BrowserUtils.VerifyTitle(driver,"Company Structure");
    }

    @Test
    public void test_HrUserNavigationToServicesModule() {

        //10.ServicesModule
        WebElement ServicesModule = driver.findElement(By.xpath("//a[@title='Services']"));
        ServicesModule.click();
        BrowserUtils.VerifyTitle(driver,"Meeting Rooms");
    }

    @Test
    public void test_HrUserNavigationToCompanyModule() {

        //11.CompanyModule
        WebElement CompanyModule = driver.findElement(By.xpath("//a[@title='Company']"));
        CompanyModule.click();
        BrowserUtils.VerifyTitle(driver,"Company");
    }

}
