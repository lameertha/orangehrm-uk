package com.orangehrm.uk.pages;

import com.orangehrm.uk.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameFeature= By.xpath("//input[@id='txtUsername']");
    By userPasswordFeature=By.xpath("//input[@id='txtPassword']");
    By userLoginBtn=By.xpath("//input[@id='btnLogin']");
    By dashBoard=By.xpath("//h1[contains(text(),'Dashboard')]");
    public void setUserNameFeature(String Name){
        sendTextToElement(userNameFeature,Name);
    }
    public void setUserPasswordFeature(String Password){
        sendTextToElement(userPasswordFeature,Password);
    }
    public void setUserLoginBtn(){
        clickOnElement(userLoginBtn);
    }
    public String setDashBoard(){
     return    getTextFromElement(dashBoard);
    }
}
