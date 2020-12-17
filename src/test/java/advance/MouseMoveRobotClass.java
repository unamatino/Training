package advance;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMoveRobotClass {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://emicalculator.net/");
		Robot robot=new Robot();
		robot.mouseMove(500, 600);
		Thread.sleep(3000);
		driver.close();
	}

}
