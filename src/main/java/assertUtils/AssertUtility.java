package assertUtils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertUtility {
	
	public static void isElementDisplayed(WebElement element) {
		boolean trueOrFalse = element.isDisplayed();
		Assert.assertEquals(true, trueOrFalse);
	}
	
	public static void isElementSelected(WebElement element) {
		boolean trueOrFalse = element.isSelected();
		Assert.assertEquals(true, trueOrFalse);
	}
	
	public static void isElementEnabled(WebElement element) {
		boolean trueOrFalse = element.isEnabled();
		Assert.assertEquals(true, trueOrFalse);
	}

}
