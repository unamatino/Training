package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GoogleSearchPagePO extends BasePage{

	public GoogleSearchPagePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="q")
	private WebElement searchBox;
	public WebElement searchBox() {
		return searchBox;
	}
	
}
