package popups;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseSpecifiedBrowser {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allWin = driver.getWindowHandles();
		for (String string : allWin) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			System.out.println(title);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Enter Specific Browser Name");
		Scanner sc = new Scanner(System.in);
		String browser = sc.next();
		for (String string : allWin) {
			driver.switchTo().window(string);
			String title = driver.getTitle();
			if (browser.equals(title)) {
				driver.close();
				System.out.println(browser+ " browser has been closed");
			} else {
				driver.switchTo().window(string);
			}
		}
		sc.close();
	}
}
