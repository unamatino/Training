package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://naukri.com/");
		Actions action=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Recruiters']"));
		action.moveToElement(ele).build().perform();//Move your mouse cursor to centre of the webelement
//		action.moveToElement(target, xOffset, yOffset).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Browse All Recruiters']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
