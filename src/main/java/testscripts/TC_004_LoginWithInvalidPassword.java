package testscripts;

import org.testng.annotations.Test;

import assertUtils.AssertUtility;
import common.LoginToApp;
import library.BaseTest;
import pageobject.LoginPagePO;

public class TC_004_LoginWithInvalidPassword extends BaseTest {
	@Test
	public void tc_002_loginWithInvalidPassword() {
		try {
			LoginToApp.loginToApplication(username, invalidPassword);
			LoginPagePO loginpage=new LoginPagePO(driver);
			AssertUtility.isElementDisplayed(loginpage.errorMessage());
		} catch (Exception e) {
			
		}
	}
}
