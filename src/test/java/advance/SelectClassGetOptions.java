package advance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassGetOptions {
	@Test
	public void singleSelect() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement oldStyle = driver.findElement(By.id("oldSelectMenu"));
		Select refObj=new Select(oldStyle);
		List<WebElement> options = refObj.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		driver.close();
	}
}
