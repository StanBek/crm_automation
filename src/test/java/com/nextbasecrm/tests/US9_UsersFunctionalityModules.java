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

import java.util.concurrent.TimeUnit;

public class US9_UsersFunctionalityModules {
    WebDriver driver;

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
    public void test_HrUserNavigationToActivityModule() {

        //1.Activity module
        WebElement ActivityStream = driver.findElement(By.xpath("//a[@title='Activity Stream']"));
        ActivityStream.click();
        BrowserUtils.verifyTitle(driver,"Portal");

    }

    @Test
    public void test_HrUserNavigationToTaskModule() {

        //2.Tasks module
        WebElement TasksModule = driver.findElement(By.xpath("//a[@title='Tasks']"));
        TasksModule.click();
        BrowserUtils.verifyTitle(driver,"Site map");
    }

    @Test
    public void test_HrUserNavigationToChatAndCallsModule() {

        //3.ChatAndCalls module
        WebElement ChatAndCalls = driver.findElement(By.xpath("//a[@title='Chat and Calls']"));
        ChatAndCalls.click();
        BrowserUtils.verifyTitle(driver,"Chat and Calls");
    }

    @Test
    public void test_HrUserNavigationToWorkgroupsModule() {

        //4.Workgroups
        WebElement Workgroups = driver.findElement(By.xpath("//a[@title='Workgroups']"));
        Workgroups.click();
        BrowserUtils.verifyTitle(driver,"Workgroups and projects");
    }

    @Test
    public void test_HrUserNavigationToDriveModule() {

        //5.DriveModule
        WebElement DriveModule = driver.findElement(By.xpath("//a[@title='Drive']"));
        DriveModule.click();
        BrowserUtils.verifyTitle(driver,"Site map");
    }

    @Test
    public void test_HrUserNavigationToCalendarModule() {

        //6.CalendarModule
        WebElement CalendarModule = driver.findElement(By.xpath("//a[@title='Calendar']"));
        CalendarModule.click();
        BrowserUtils.verifyTitle(driver,"Site map");
    }

    @Test
    public void test_HrUserNavigationToContactCenterModule() {

        //7.ContactCenterModule
        WebElement ContactCenterModule = driver.findElement(By.xpath("//a[@title='Contact Center']"));
        ContactCenterModule.click();
        BrowserUtils.verifyTitle(driver,"Contact Center");
    }

    @Test
    public void test_HrUserNavigationToTimeAndReportsModule() {

        //8.TimeAndReportsModule
        WebElement TimeAndReportsModule = driver.findElement(By.xpath("//a[@title='Time and Reports']"));
        TimeAndReportsModule.click();
        BrowserUtils.verifyTitle(driver,"Absence Chart");
    }

    @Test
    public void test_HrUserNavigationToEmployeesModule() {

        //9.EmployeesModule
        WebElement EmployeesModule = driver.findElement(By.xpath("//a[@title='Employees']"));
        EmployeesModule.click();
        BrowserUtils.verifyTitle(driver,"Company Structure");
    }

    @Test
    public void test_HrUserNavigationToServicesModule() {

        //10.ServicesModule
        WebElement ServicesModule = driver.findElement(By.xpath("//a[@title='Services']"));
        ServicesModule.click();
        BrowserUtils.verifyTitle(driver,"Meeting Rooms");
    }

    @Test
    public void test_HrUserNavigationToCompanyModule() {

        //11.CompanyModule
        WebElement CompanyModule = driver.findElement(By.xpath("//a[@title='Company']"));
        CompanyModule.click();
        BrowserUtils.verifyTitle(driver,"Company");
    }

}
