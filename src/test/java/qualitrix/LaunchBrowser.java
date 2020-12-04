package qualitrix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser{
	public static void main(String[] args) throws Exception{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://qualitrix.com/");
		Thread.sleep(3000);
		driver.close();
	}
}
