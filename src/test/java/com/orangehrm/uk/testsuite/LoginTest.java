package com.orangehrm.uk.testsuite;

import com.orangehrm.uk.loadproperty.LoadProperty;
import com.orangehrm.uk.pages.LoginPage;
import com.orangehrm.uk.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    LoadProperty loadProperty=new LoadProperty();
    @Test
    @Parameters({"Name","Password"})
    public void verifyUserCanNavigateToThePageWithCorrectUserNameAndPassword(String Name,String Password) {
        loginPage.setUserNameFeature(Name);
        loginPage.setUserPasswordFeature(Password);
        loginPage.setUserLoginBtn();

    }
    @Test
    @Parameters({"Name","Password"})
    public void verifyUserShouldNavigateToDashBoardPage(String Name,String Password) {
        loginPage.setUserNameFeature(Name);
        loginPage.setUserPasswordFeature(Password);
        loginPage.setUserLoginBtn();
        String expectedResult = "DashBoard";
        String actualResult = loginPage.setDashBoard();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
