package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferenceBetweenCloseAndQuit {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
//		driver.close();
		driver.quit();
	}

}
