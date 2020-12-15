package advance;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchiTabOrWindow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		String parentTitle = driver.getTitle();
		Set<String> handles = driver.getWindowHandles();
		for (String str : handles) {
			String title = driver.getTitle();
			if (title.equals(parentTitle)) {
				driver.close();
			}
		}
		Thread.sleep(5000);
//		driver.close();
//		driver.quit();
	}

}
