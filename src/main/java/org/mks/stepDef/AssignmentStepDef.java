package org.mks.stepDef;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.mks.actions.AssignmentActions;
import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AssignmentStepDef {
    @Given("Open Base URL")
    public void open_Base_URL() throws InterruptedException {
        AssignmentActions assignmentActions = new AssignmentActions();
        assignmentActions.openURL();
    }

    @When("User Click on button")
    public void user_Click_on_button() {
        AssignmentActions assignmentActions = new AssignmentActions();
        assignmentActions.clickButton();
    }
}
