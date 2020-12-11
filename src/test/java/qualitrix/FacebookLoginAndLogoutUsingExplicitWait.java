package qualitrix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginAndLogoutUsingExplicitWait {

	public static void main(String[] args) throws Exception{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("XXXXXXXXXXXXXX");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("XXXXXXXXXXXXXX");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		WebElement accountDropdown = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		accountDropdown.click();
				
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(logout));
//		Thread.sleep(3000);
		logout.click();
		
		driver.close();
	}

}
