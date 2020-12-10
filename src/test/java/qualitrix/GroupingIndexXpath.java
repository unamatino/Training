package qualitrix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupingIndexXpath {

	public static void main(String[] args) throws Exception{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Bison");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement link70 = driver.findElement(By.xpath("((//a)[70])"));
		Thread.sleep(2000);
		
//		(//a)[last()]-only last() function is available
//		first() function is invalid
		
		int y=link70.getLocation().getY();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String str1="window.scrollTo(0,"+y+")";
		jse.executeScript(str1);
		Thread.sleep(2000);
		
		String str2="arguments[0].click()";
		jse.executeScript(str2, link70);
		
		Thread.sleep(5000);
		
//		List<WebElement> links = driver.findElements(By.xpath("//a"));
//		for (WebElement link : links) {
//			String text = link.getText();
//			System.out.println(text);
//		}
		driver.close();
	}

}
