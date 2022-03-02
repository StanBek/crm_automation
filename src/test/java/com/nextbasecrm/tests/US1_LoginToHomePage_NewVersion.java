package com.nextbasecrm.tests;


import com.nextbasecrm.utilities.CRM_Utilities;
import com.nextbasecrm.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static com.nextbasecrm.utilities.Utilities_For_Login.*;

public class US1_LoginToHomePage_NewVersion {




    @Test(priority = 1)
    public void loginSetUp() {

        for (String username : userList) {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/");
            String actualVerify_Authorization = driver.findElement(By.xpath("//div[text()='Authorization']")).getText();
            String expectedVerify_Authorization="Authorization";
            Assert.assertEquals(actualVerify_Authorization,expectedVerify_Authorization);
            CRM_Utilities.crm_login(driver, username, password);
            driver.close();
        }
    }

    @Test(priority = 2)
    public void incorrectUsername() {

        for (String username : wrongUsername) {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/");
            CRM_Utilities.crm_login(driver, username, password);
            actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();
            Assert.assertEquals(actual_incorrectLoginOrPassword,expected_incorrectLoginOrPassword,"Failed");
            driver.close();
        }
    }
    @Test(priority = 3)
    public void incorrectPassword() {
        for (String username : userList) {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://login2.nextbasecrm.com/");
            CRM_Utilities.crm_login(driver, username, wrongPassword);
            actual_incorrectLoginOrPassword = driver.findElement(By.xpath("//div[.='Incorrect login or password']")).getText();
            Assert.assertEquals(actual_incorrectLoginOrPassword, expected_incorrectLoginOrPassword, "Failed");
            driver.close();
        }

    }


}
