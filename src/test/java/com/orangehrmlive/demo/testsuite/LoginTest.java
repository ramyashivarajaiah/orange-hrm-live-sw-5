package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        loginPage.loginPannelTextLocator();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        boolean log = driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?v=1711595107870']")).isDisplayed();
        Assert.assertTrue(log);
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnUserProfileLogo();
        loginPage.mouseHoverAndClickOnLogout();
        loginPage.verifyLoginPanel();
    }

    @Test(groups = {"regression"})
    public void verifyErrorMessageWithInvalidCredentials() {
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.verifyRequired();

    }
}
