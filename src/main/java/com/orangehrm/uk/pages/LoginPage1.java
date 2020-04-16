package com.orangehrm.uk.pages;

import com.orangehrm.uk.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage1 extends Utility {
    By userNameFeature= By.xpath("//input[@id='txtUsername']");
    By userPasswordFeature=By.xpath("//input[@id='txtPassword']");
    By userLoginBtn=By.xpath("//input[@id='btnLogin']");

    public void setUserNameFeature(String Name1){
        sendTextToElement(userNameFeature,Name1);
    }
    public void setUserPasswordFeature(String Password1){
        sendTextToElement(userPasswordFeature,Password1);
    }
    public void setUserLoginBtn(){
        clickOnElement(userLoginBtn);
    }
}
