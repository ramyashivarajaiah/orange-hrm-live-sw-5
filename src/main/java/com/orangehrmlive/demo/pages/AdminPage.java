package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AdminPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='User Management']")
    WebElement userManagement;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Job']")
    WebElement job;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Organization']")
    WebElement organization;

    public void clickOnUserManagement() {
        clickOnElement(userManagement);
        Reporter.log("Click on User Management " + userManagement.toString());
        CustomListeners.test.log(Status.PASS, "Click on User Management " + userManagement);
    }

    public void clickOnJob() {
        clickOnElement(job);
        Reporter.log("Click on Job " + job.toString());
        CustomListeners.test.log(Status.PASS, "Click on Job " + job);
    }

    public void clickOnOrganization() {
        clickOnElement(organization);
        Reporter.log("Click on Organization " + organization.toString());
        CustomListeners.test.log(Status.PASS, "Click on Organization " + organization);
    }
}
