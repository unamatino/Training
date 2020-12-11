package qualitrix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginAndLogoutWithoutSleepMethod {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("XXXXXXXXXXXXXXXXX");
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("XXXXXXXXXXXXXXX");
		Thread.sleep(5000);
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(5000);
		
		WebElement accountDropdown = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		accountDropdown.click();
		
		Thread.sleep(15000);
		
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logout.click();
		
		driver.close();
	}

}
