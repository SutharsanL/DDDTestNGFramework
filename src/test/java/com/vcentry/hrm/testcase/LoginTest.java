package com.vcentry.hrm.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.hrm.utils.CommonFunctions;

public class LoginTest extends CommonFunctions{

	@Test(priority = 2)
	public void loginWithValidCredentials() throws InterruptedException {
		Thread.sleep(3000);
	login.enterUsername(getPropData("username"))
	.enterPassword(getPropData("password")).clickLogin();
	home.verifyHomePage();
	}
	
	@Test(priority = 1,dataProvider = "invalidCredentials",enabled=false)
	public void loginWithInValidCredentials(String uName,String pwd) {
	login.enterUsername(uName)
	.enterPassword(pwd).clickLogin().verifyLoginError();

	} 
	
	@DataProvider(name ="invalidCredentials")
	public Object[][] loginData(){
		return getExcelData("src/test/resources/DataSheet.xlsx", "login");
	}
	
	
	
	
}
