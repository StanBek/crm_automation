package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class US9_UsersFunctionalityModules {
    WebDriver driver;

    //helpdesk67@cydeo.com
    //helpdesk68@cydeo.com
    //helpdesk69@cydeo.com

    //hr67@cydeo.com
    //hr68@cydeo.com
    //hr69@cydeo.com

    //marketing67@cydeo.com
    //marketing68@cydeo.com
    //marketing69@cydeo.com


    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
        String UserName = "marketing67@cydeo.com";
        String Password = "UserUser";

/*
        ArrayList<String> UserName = new ArrayList<String>();
        UserName.add("helpdesk67@cydeo.com");
        UserName.add("helpdesk68@cydeo.com");
        UserName.add("helpdesk69@cydeo.com");
        UserName.add("hr67@cydeo.com");
        UserName.add("hr68@cydeo.com");
        UserName.add("hr69@cydeo.com");
        UserName.add("marketing67@cydeo.com");
        UserName.add("marketing68@cydeo.com");
        UserName.add("marketing69@cydeo.com");

        for (String each : UserName) {

        }

 */
        CRM_Utilities.crm_login(driver, UserName, Password);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test_UserNavigationToActivityModule() {

        //1.Activity module
        WebElement ActivityStream = driver.findElement(By.xpath("//a[@title='Activity Stream']"));
        ActivityStream.click();
        BrowserUtils.verifyTitle(driver, "Portal");

    }

    @Test
    public void test_UserNavigationToTaskModule() {

        //2.Tasks module
        WebElement TasksModule = driver.findElement(By.xpath("//a[@title='Tasks']"));
        TasksModule.click();
        BrowserUtils.verifyTitle(driver, "Site map");
    }

    @Test
    public void test_UserNavigationToChatAndCallsModule() {

        //3.ChatAndCalls module
        WebElement ChatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
        ChatAndCalls.click();
        BrowserUtils.verifyTitle(driver, "Chat and Calls");
    }

    @Test
    public void test_UserNavigationToWorkgroupsModule() {

        //4.Workgroups
        WebElement Workgroups = driver.findElement(By.xpath("//a[@title='Workgroups']"));
        Workgroups.click();
        BrowserUtils.verifyTitle(driver, "Workgroups and projects");
    }

    @Test
    public void test_UserNavigationToDriveModule() {

        //5.DriveModule
        WebElement DriveModule = driver.findElement(By.xpath("//a[@title='Drive']"));
        DriveModule.click();
        BrowserUtils.verifyTitle(driver, "Site map");
    }

    @Test
    public void test_UserNavigationToCalendarModule() {

        //6.CalendarModule
        WebElement CalendarModule = driver.findElement(By.xpath("//a[@title='Calendar']"));
        CalendarModule.click();
        BrowserUtils.verifyTitle(driver, "Site map");
    }

    @Test
    public void test_UserNavigationToContactCenterModule() {

        //7.ContactCenterModule
        WebElement ContactCenterModule = driver.findElement(By.xpath("//a[@title='Contact Center']"));
        ContactCenterModule.click();
        BrowserUtils.verifyTitle(driver, "Contact Center");
    }

    @Test
    public void test_UserNavigationToTimeAndReportsModule() {

        //8.TimeAndReportsModule
        WebElement TimeAndReportsModule = driver.findElement(By.xpath("//a[@title='Time and Reports']"));
        TimeAndReportsModule.click();
        BrowserUtils.verifyTitle(driver, "Absence Chart");
    }

    @Test
    public void test_UserNavigationToEmployeesModule() {

        //9.EmployeesModule
        WebElement EmployeesModule = driver.findElement(By.xpath("//a[@title='Employees']"));
        EmployeesModule.click();
        BrowserUtils.verifyTitle(driver, "Company Structure");
    }

    @Test
    public void test_UserNavigationToServicesModule() {

        //10.ServicesModule
        WebElement ServicesModule = driver.findElement(By.xpath("//a[@title='Services']"));
        ServicesModule.click();
        BrowserUtils.verifyTitle(driver, "Meeting Rooms");
    }

    @Test
    public void test_UserNavigationToCompanyModule() {

        //11.CompanyModule
        WebElement CompanyModule = driver.findElement(By.xpath("//a[@title='Company']"));
        CompanyModule.click();
        BrowserUtils.verifyTitle(driver, "Company");
    }

}
