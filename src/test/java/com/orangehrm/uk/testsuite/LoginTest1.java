package com.orangehrm.uk.testsuite;

import com.orangehrm.uk.loadproperty.LoadProperty;
import com.orangehrm.uk.pages.LoginPage;
import com.orangehrm.uk.pages.LoginPage1;
import com.orangehrm.uk.testbase.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest1 extends TestBase {
    LoginPage1 loginPage1 = new LoginPage1();
    LoadProperty loadProperty=new LoadProperty();
    @Test
    @Parameters({"Name1","Password1"})
    public void verifyUserCanNavigateToThePageWithCorrectUserNameAndPassword(String Name1,String Password1) {
        loginPage1.setUserNameFeature(Name1);
        loginPage1.setUserPasswordFeature(Password1);
        loginPage1.setUserLoginBtn();
    }
}
