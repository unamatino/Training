package common;

import library.BaseTest;
import pageobject.LoginPagePO;

public class LoginToApp extends BaseTest{
		
	public static void loginToApplication(String username,String password) {
		LoginPagePO loginpage=new LoginPagePO(driver);
		loginpage.userNameTextBox().sendKeys(username);
		loginpage.passWordTextBox().sendKeys(password);
		loginpage.loginButton().click();
	}
}
