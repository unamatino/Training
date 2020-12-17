package advance;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseWheelRobotClass {

	public static void main(String[] args) throws Exception{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://emicalculator.net/");
		Robot robot = new Robot();
		// MIDDLE WHEEL CLICK
//		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//		Thread.sleep(2000);
//		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
//		Thread.sleep(2000);
		// SCROLL THE MOUSE WHEEL
		robot.mouseWheel(5000);
		Thread.sleep(5000);
		robot.mouseWheel(-5000);
		driver.close();
	}

}
