package com.orangehrm.uk.testng;

import org.testng.annotations.Test;

public class TestNgGrouping {
   @Test(groups = {"smoke","regression","sanity"})
    public void LoginTest(){

    }
    @Test(groups ={"smoke","regression","sanity"} )
    public void LoginTest1(){

    }
}
