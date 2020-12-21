package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo_02 {
	@Test(priority=2,dependsOnMethods= {"test01"})
	public void test03() {
		Reporter.log("Inside Test03", true);
	}
	@Test(priority=1)
	public void test01() {
		Reporter.log("Inside Test01", true);
	}
	@Test(priority=3)
	public void test02() {
		Reporter.log("Inside Test02", true);
	}
}
