package advance;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyPressAndKeyReleaseRobotClass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://emicalculator.net/");
		Robot robot = new Robot();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
		}
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		driver.close();
	}

}
