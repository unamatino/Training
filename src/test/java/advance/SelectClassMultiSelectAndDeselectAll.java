package advance;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMultiSelectAndDeselectAll {
	@Test
	public void multiSelect() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		WebElement oldStyle = driver.findElement(By.id("cars"));
		Robot robot = new Robot();
		robot.mouseWheel(10);
		Select refObj=new Select(oldStyle);
		System.out.println(refObj.isMultiple());
		refObj.selectByIndex(0);
		refObj.selectByValue("saab");
		refObj.selectByVisibleText("Audi");
		Thread.sleep(2000);
		refObj.deselectAll();
		Thread.sleep(2000);
		driver.close();
	}
}
