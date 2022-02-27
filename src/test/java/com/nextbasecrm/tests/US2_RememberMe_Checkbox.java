package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class US2_RememberMe_Checkbox {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  1-go to login page
        driver.get(ConfigurationReader.getProperty("env"));
    }

    @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(3);
        driver.close();
    }

}

//helpdesk67@cydeo.com
//helpdesk68@cydeo.com
//helpdesk69@cydeo.com

//hr67@cydeo.com
//hr68@cydeo.com
//hr69@cydeo.com

//marketing67@cydeo.com
//marketing68@cydeo.com
//marketing69@cydeo.com

//password: UserUser
