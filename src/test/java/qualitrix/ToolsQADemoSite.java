package qualitrix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQADemoSite {

	public static void main(String[] args) throws Exception{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form/");
//		By by=By.id("firstName");
//		driver.findElement(by);
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.clear();
		firstName.sendKeys("Emilia");
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.clear();
		lastName.sendKeys("Clarke");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.clear();
		email.sendKeys("emilia.clarke@qualitrix.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		gender.click();
		
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9046933956");
		
//		WebElement subject = driver.findElement(By.xpath("(//div[@id='subjectsContainer']/div/div)[1]"));
//		subject.click();
//		Thread.sleep(5000);
//		subject.sendKeys("English");
		
		driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
//		driver.findElement(By.id("currentAddress")).sendKeys("Bengaluru");
//		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("submit"));
		int y=submit.getLocation().getY();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String str1="window.scrollTo(0,"+y+")";
		jse.executeScript(str1);
		
		String str2="arguments[0].click()";
		jse.executeScript(str2, submit);
//		submit.click();
		
		
		driver.close();
	}

}
