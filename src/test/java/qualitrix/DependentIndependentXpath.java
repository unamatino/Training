package qualitrix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///home/qualitrix/Desktop/ws/Training/htmlfiles/WebTable.html");
		WebElement manualFee = driver.findElement(By.xpath("//td[text()='Manual Testing']/../td[3]"));
		String fee = manualFee.getText();
		System.out.println(fee);
		driver.close();
	}

}
