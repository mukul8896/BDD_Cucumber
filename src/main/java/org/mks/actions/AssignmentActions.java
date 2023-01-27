package org.mks.actions;

import io.cucumber.core.api.Scenario;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.mks.applicationUtils.Reporting;
import org.mks.applicationUtils.Status;
import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class AssignmentActions extends BaseActions {

    JSONObject testData;
    public AssignmentActions(){
        this.testData = (JSONObject) DriverUtils.getPageData().get(this.getClass().getSimpleName());
    }
    public void openURL() throws InterruptedException {
        System.out.println("open url");

        DriverUtils.getDriver().get("https://www.google.com/");
        Thread.sleep(Long.parseLong("5000"));
        System.out.println(testData.get("data1").toString());

        Reporting.addStepScreenShot("This button with screen shot");

        Reporting.addStepLog("This is button");

    }

    public void clickButton() {
        Reporting.addStepLog("This is button");
        Reporting.addStepScreenShot("This button with screen shot");
        Reporting.addHardStepWithScreenShot("This button with screen shot assert", Status.FAIL);

        Reporting.addStepLog("Last logs");
    }
}
