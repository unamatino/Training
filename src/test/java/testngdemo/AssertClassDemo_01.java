package testngdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertClassDemo_01 {
	@Test
	public void registerUser() {
		Reporter.log("1st Statement!!",true);
		Reporter.log("2st Statement!!",true);
		Reporter.log("3st Statement!!",true);
		Assert.fail();
		Reporter.log("4st Statement!!",true);
		Reporter.log("5st Statement!!",true);
		Reporter.log("6st Statement!!",true);
	}
}
