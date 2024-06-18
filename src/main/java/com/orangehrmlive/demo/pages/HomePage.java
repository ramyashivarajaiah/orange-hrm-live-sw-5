package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logoVerify;

    @CacheLookup
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement admin;

    public void clickOnAdmin() {
        clickOnElement(admin);
        CustomListeners.test.log(Status.PASS, "click on Admin " + admin);
        Reporter.log("Click on Admin" + admin.toString());
    }


    @CacheLookup
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement pim;

    // Method for pim
    public void clickOnPim() {
        clickOnElement(pim);
        Reporter.log("Click on PIM " + pim.toString());
        CustomListeners.test.log(Status.PASS, "Click on PIM " + pim);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement leave;

    // Method for leave
    public void clickOnLeave() {
        clickOnElement(leave);
        Reporter.log("Click on Leave " + leave.toString());
        CustomListeners.test.log(Status.PASS, "click on Leave " + leave);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashBoard;

    //Method for dashboard
    public void clickOnDashBoard() {
        clickOnElement(dashBoard);
        Reporter.log("Click on Dashboard " + dashBoard.toString());
        CustomListeners.test.log(Status.PASS, "Click on Dashboard " + dashBoard);
    }

}
