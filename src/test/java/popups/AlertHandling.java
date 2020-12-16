package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///home/qualitrix/Desktop/ws/Training/htmlfiles/alerts.html");
		driver.findElement(By.xpath("//button[text()='Try Me']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();//Click on OK button
		Thread.sleep(3000);
		driver.close();
	}
}
