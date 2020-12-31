package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class SearchResultPagePO extends BasePage{

	public SearchResultPagePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="(//span[text()='Instagram'])[1]")
	private WebElement instagramLink;
	public WebElement instagramLink() {
		return instagramLink;
	}
	
	@FindBy(xpath="//a[@href='https://twitter.com/?lang=en']")
	private WebElement twitterLink;
	public WebElement twitterLink() {
		return twitterLink;
	}

}
