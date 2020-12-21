package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsTipActionsClass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips/");
		Actions actions = new Actions(driver); 
		 
		 //Retrieve WebElement 
		 WebElement element = driver.findElement(By.id("toolTipButton")); 
		 
		 // Use action class to mouse hover 
		 actions.moveToElement(element).perform();
		 Thread.sleep(3000);
		 
		 WebElement toolTip = driver.findElement(By.cssSelector(".tooltip-inner")); 
		 
		 // To get the tool tip text and assert 
		 String toolTipText = toolTip.getText();
		 System.out.println("toolTipText-->"+toolTipText); 
		 
		 //Verification if tooltip text is matching expected value 
		 if(toolTipText.equalsIgnoreCase("You hovered over the Button")){ 
		 System.out.println("Pass* : Tooltip matching expected value");
		 }else{
		 System.out.println("Fail : Tooltip NOT matching expected value"); 
		 } 
		 
		 // Close the main window 
		 driver.close();
	}

}
