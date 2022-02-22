package com.nextbasecrm.utilities;

import org.testng.Assert;

public class ModuleVerification {

    public static void tasksModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Site map");
    }

    public static void activityStreamModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Portal");
    }

    public static void chatAndCallsModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Chat and Calls");
    }

    public static void workgroupsAndProjectsModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Workgroups and projects");
    }

    public static void driveModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Site map");
    }

    public static void calendarModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Site map");
    }

    public static void contactCenterModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Contact Center");
    }

    public static void timeAndReportsModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Absence Chart");
    }

    public static void employeesModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Company Structure");
    }

    public static void servicesModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Meeting Rooms");
    }

    public static void companyModule(String actualTitle) {
        Assert.assertEquals(actualTitle, "Company");
    }


}
