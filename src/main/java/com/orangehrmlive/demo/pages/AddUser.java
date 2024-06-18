package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddUser extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
    WebElement addUser;

    public void clickOnAddUser() {
        clickOnElement(addUser);
        CustomListeners.test.log(Status.PASS, "Click on add " + addUser);
        Reporter.log("Click on addUser " + addUser.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement dropDown;

    public void clickOnUserRole() {
        clickOnElement(dropDown);
        Reporter.log("Click on User Role " + dropDown.toString());
        CustomListeners.test.log(Status.PASS, "Click on User Role " + dropDown);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeName;

    public void enterEmployeeName() {
        sendTextToElement(employeeName, "Ananya Dash");
        Reporter.log("Enter employee name " + employeeName.toString());
        CustomListeners.test.log(Status.PASS, "Enter employee name " + employeeName);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userName;

    public void enterUserName() {
        sendTextToElement(userName, "Ananya");
        Reporter.log("Enter user name " + userName.toString());
        CustomListeners.test.log(Status.PASS, "Enter user name " + userName);

    }

    @CacheLookup
    @FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
    WebElement statusDropdown;

    public void clickOnStatus() {
        clickOnElement(statusDropdown);
        Reporter.log("click on status " + statusDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Click on status " + statusDropdown);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement password;

    public void enterPassword() {
        sendTextToElement(password, "admin123");
        Reporter.log("Enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPassword;

    public void enterConfirmPassword() {
        sendTextToElement(confirmPassword, "admin123");
        Reporter.log("Reenter Password " + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Reenter Password " + confirmPassword);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement save;

    public void clickOnSave() {
        clickOnElement(save);
        CustomListeners.test.log(Status.PASS, "Click on save" + save);
        Reporter.log("Click on save" + save.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
    WebElement cancel;

    public void clickOnCancel() {
        clickOnElement(cancel);
        CustomListeners.test.log(Status.PASS, "Click on cancel " + cancel);
        Reporter.log("Click on cancel " + cancel.toString());
    }
}
