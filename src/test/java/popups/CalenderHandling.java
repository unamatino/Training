package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("departureCalendar")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fare_20201223")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
