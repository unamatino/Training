package testscripts;

import org.testng.annotations.Test;

import assertUtils.AssertUtility;
import common.LoginToApp;
import library.BaseTest;
import pageobject.LoginPagePO;

public class TC_003_LoginWithInvalidUsername extends BaseTest{
	@Test
	public void tc_003_loginWithInvalidUsername() {
		try {
			LoginToApp.loginToApplication(invalidUsername, password);
			LoginPagePO loginpage=new LoginPagePO(driver);
			AssertUtility.isElementDisplayed(loginpage.errorMessage());
		} catch (Exception e) {
			
		}
	}
}
