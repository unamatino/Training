package testscripts;

import org.testng.annotations.Test;

import assertUtils.AssertUtility;
import library.BaseTest;
import pageobject.LoginPagePO;

public class TC_001_LaunchAppWithValidURL extends BaseTest{
	
	@Test
	public void tc_001_launchAppWithValidUrl() {
		try {
			LoginPagePO loginpage=new LoginPagePO(driver);
		
			AssertUtility.isElementDisplayed(loginpage.userNameTextBox());
			
			AssertUtility.isElementDisplayed(loginpage.passWordTextBox());
			
			AssertUtility.isElementDisplayed(loginpage.loginButton());
			
			AssertUtility.isElementEnabled(loginpage.loginButton());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
