package qualitrix;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginAndLogoutUsingFluentWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("XXXXXXXXXXXXXX");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("XXXXXXXXXXXXXX");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		WebElement accountDropdown = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		accountDropdown.click();
				
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		
		logout.click();
		
		driver.close();
	}

}
