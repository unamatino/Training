package testscripts;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pageobject.GoogleSearchPagePO;
import pageobject.SearchResultPagePO;

public class TestTwitter extends BaseTest{
	@Test
	public void twitter() {
		try {
			GoogleSearchPagePO gpo=new GoogleSearchPagePO(driver);
			gpo.searchBox().sendKeys(twitter);
			gpo.searchBox().sendKeys(Keys.ENTER);
			
			SearchResultPagePO spo=new SearchResultPagePO(driver);
			spo.twitterLink().click();
			
			String expTitle="Twitter. It’s what’s happening / Twitter";
			String actTitle = driver.getTitle();
			
			Assert.assertEquals(actTitle, expTitle);
			Reporter.log("Title is Matchingg", true);
		} catch (Exception e) {
			Reporter.log("Title is not Matchingg", true);
			Assert.fail();
		}
	}
}
