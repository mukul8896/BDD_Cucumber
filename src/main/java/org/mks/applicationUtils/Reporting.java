package org.mks.applicationUtils;

import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Reporting {

    public static void addStepLog(String message){
        DriverUtils.getScenario().write(message);
    }

    public static void addStepScreenShot(String message){
        takeScreenShot(message);
    }

    public static void addHardStep(String message,Status status){
        if(status == Status.FAIL){
            DriverUtils.getScenario().write(message);
            Assert.fail();
        } else if (status == Status.PASS) {
            DriverUtils.getScenario().write(message);
            Assert.assertTrue(true);
        } else if (status == Status.INFO) {
            DriverUtils.getScenario().write(message);
        }
    }

    public static void addHardStepWithScreenShot(String message,Status status){
        if(status == Status.FAIL){
            takeScreenShot(message);
            Assert.fail();
        } else if (status == Status.PASS) {
            takeScreenShot(message);
            Assert.assertTrue(true);
        } else if (status == Status.INFO) {
            takeScreenShot(message);
            DriverUtils.getScenario().write(message);
        }
    }

    public static void addSoftStep(String message,Status status){
        SoftAssert softAssert = new SoftAssert();
        if(status == Status.FAIL){
            DriverUtils.getScenario().write(message);
            softAssert.fail();
        } else if (status == Status.PASS) {
            DriverUtils.getScenario().write(message);
            softAssert.assertTrue(true);
        } else if (status == Status.INFO) {
            DriverUtils.getScenario().write(message);
        }
    }

    public static void addSoftStepWithScreenShot(String message,Status status){
        SoftAssert softAssert = new SoftAssert();
        if(status == Status.FAIL){
            takeScreenShot();
            softAssert.fail();
        } else if (status == Status.PASS) {
            takeScreenShot(message);
            softAssert.assertTrue(true);
        } else if (status == Status.INFO) {
            takeScreenShot(message);
        }
    }

    private static void takeScreenShot(){
        try {
            byte[] screenshot = ((TakesScreenshot) DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);
            DriverUtils.getScenario().embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    private static void takeScreenShot(String name){
        try {
            byte[] screenshot = ((TakesScreenshot) DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);
            DriverUtils.getScenario().embed(screenshot, "image/png",name);
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

}
