package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUser;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class UserTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    AddUser addUser;
    ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        addUser = new AddUser();
        viewSystemUsersPage = new ViewSystemUsersPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void adminShouldAddUserSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        addUser.clickOnAddUser();
        viewSystemUsersPage.verifyAddUserText();
        //  addUserPage.clickOnAddUser();
        addUser.clickOnUserRole();
        addUser.enterEmployeeName();
        addUser.enterUserName();
        addUser.clickOnStatus();
        addUser.enterPassword();
        addUser.enterConfirmPassword();
        addUser.clickOnSave();

    }

    @Test(groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.enterSystemUserName();
        viewSystemUsersPage.selectSystemUserRole();
        viewSystemUsersPage.selectSystemStatus();
        Thread.sleep(2000);

        viewSystemUsersPage.searchButtonClick();
        viewSystemUsersPage.verifyUserResultList();

    }

    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.enterSystemUserName();
        viewSystemUsersPage.selectSystemUserRole();
        viewSystemUsersPage.selectSystemStatus();
        Thread.sleep(2000);
        viewSystemUsersPage.searchButtonClick();
        viewSystemUsersPage.verifyUserResultList();
        viewSystemUsersPage.chechOnChechbox();
        viewSystemUsersPage.clickOnDeleteButton();
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnDeletePopUp();
        viewSystemUsersPage.verifyUserSuccessfullyDelete();
    }

    @Test(groups = {"regression"}, dataProvider = "DataSet", dataProviderClass = TestData.class)
    public void searchTheUserAndVerifyTheMessageRecordFound(String username, String userrole, String employeeName, String status) {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.enterSystemUserName1(username);
        viewSystemUsersPage.selectSystemUserRole1(userrole);
        viewSystemUsersPage.selectSystemStatus1(status);
        viewSystemUsersPage.selectEmployeeName(employeeName);
        viewSystemUsersPage.searchButtonClick();
        viewSystemUsersPage.verifyRecordFind();
        viewSystemUsersPage.resetClick();
    }

}

