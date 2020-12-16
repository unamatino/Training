package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAllChildBrowsers {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String ParentTitle = driver.getTitle();
		Set<String> allWin = driver.getWindowHandles();
		int count = allWin.size();
		System.out.println("Number of Browsers:=" + count);
		for (String string : allWin) {
			driver.switchTo().window(string);
			String childTitle = driver.getTitle();
			if (ParentTitle.equals(childTitle)) {
				System.out.println("Parent Title: " + ParentTitle);
			} else {
				Thread.sleep(2000);
				System.out.println("Closed->Child Window: " + childTitle);
				driver.close();
			}
		}
	}

}
