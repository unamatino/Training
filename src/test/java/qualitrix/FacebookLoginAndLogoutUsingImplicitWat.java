package qualitrix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginAndLogoutUsingImplicitWat {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("XXXXXXXXXXXXXXX");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("XXXXXXXXXXXXXXXXXXXXX");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		WebElement accountDropdown = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		accountDropdown.click();
				
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logout.click();
		
		driver.close();
	}

}
