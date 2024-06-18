package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DashboardPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboardText;

    public void clickOnDashboardText() {
        clickOnElement(dashboardText);
        Reporter.log("Click on Dashboard " + dashboardText.toString());
        CustomListeners.test.log(Status.PASS, "Click on Dashboard " + dashboardText);
    }
}
