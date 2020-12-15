package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alertsWindows");
		
		driver.navigate().to("https://www.google.co.in/");
		
		driver.navigate().back();//ToolsQA
		driver.navigate().forward();//Google
		driver.navigate().refresh();
		
		driver.close();
	}

}
