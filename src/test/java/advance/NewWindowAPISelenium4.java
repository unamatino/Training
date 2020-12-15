package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowAPISelenium4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alertsWindows");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.google.com/");
		String expTitle="ToolsQA";
		String actTitle=driver.getTitle();
		Thread.sleep(2000);
		if (expTitle.equals(actTitle)) {
			System.out.println("Test Pass!!");
		} else {
			System.out.println("Test Fail!!");
		}
		driver.close();
	}

}
