package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClassDemo_02 {
	@Test
	public void registerUser() {
		Reporter.log("Before Soft Assert Object", true);
		SoftAssert as=new SoftAssert();
		Reporter.log("After Soft Assert Object", true);
		as.assertEquals("World", "World");
		Reporter.log("After Soft Assert Fail", true);
	}
}
