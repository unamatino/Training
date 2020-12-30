package testngdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertClassDemo_02 {
	@Test
	public void registerUser() {
		Reporter.log("1st Statement!!",true);
		Reporter.log("2st Statement!!",true);
		Reporter.log("3st Statement!!",true);
		Assert.assertEquals("Hello", "Hello", "Test Pass");
		Assert.assertNotEquals("hey", "hi", "Test Pass");
		
	}
}
