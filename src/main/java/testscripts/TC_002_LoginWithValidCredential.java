package testscripts;

import org.testng.annotations.Test;

import assertUtils.AssertUtility;
import common.LoginToApp;
import library.BaseTest;
import pageobject.ProductsPagePO;

public class TC_002_LoginWithValidCredential extends BaseTest{
	@Test
	public void tc_002_loginWithValidCredential() {
		try {
			LoginToApp.loginToApplication(username, password);
			ProductsPagePO productpage=new ProductsPagePO(driver);
			AssertUtility.isElementDisplayed(productpage.productLabel());
		} catch (Exception e) {
			
		}
	}
}
