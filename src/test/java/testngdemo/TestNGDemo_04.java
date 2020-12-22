package testngdemo;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class TestNGDemo_04 {
	@Test(priority=1,groups= {"regression"})
	public void registerUser() {
		Reporter.log("User Registratioon Success!!", true);
	}
	@Test(priority=2,invocationCount=2,groups= {"regression"})
	public void loginUser() {
		Reporter.log("User Login Success!!", true);
	}
	@Test(priority=3,enabled=true,groups= {"regression"})
	public void deleteUser() {
		Reporter.log("User Deleted Successfully!!", true);
	}
}
