package com.nextbasecrm.utilities;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilities_For_Login {

        public static List<String> userList = new ArrayList<>(Arrays.asList("hr67@cydeo.com","hr68@cydeo.com","hr69@cydeo.com","helpdesk67@cydeo.com","helpdesk68@cydeo.com","helpdesk69@cydeo.com","marketing67@cydeo.com","marketing68@cydeo.com","marketing69@cydeo.com"));
        public static WebDriver driver;
        public static String password = "UserUser";
        public static String wrongPassword ="useuse";
        public static String [] wrongUsername = {"hrhr@.cydeo.com","market68@cydeo.com","help69@cydeo.com","   "};
        public static String actual_incorrectLoginOrPassword;
        public static String expected_incorrectLoginOrPassword="Incorrect login or password";
    }


