package testngdemo;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

public class TestNGDemo_03 {
	@Test(priority=1,groups= {"regression"})
	public void registerUser() {
		Assert.fail();
		Reporter.log("User Registratioon Success!!", true);
	}
	@Test(priority=2,alwaysRun=true,dependsOnMethods= {"registerUser"},groups= {"regression"})
	public void loginUser() {
		Reporter.log("User Login Success!!", true);
	}
	@Test(priority=3,groups= {"regression"})
	public void deleteUser() {
		Reporter.log("User Deleted Successfully!!", true);
	}
}
