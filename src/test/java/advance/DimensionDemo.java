package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DimensionDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alertsWindows");
		
		String pagesource=driver.getPageSource();
		System.out.println("Pagesource is : "+pagesource);
		
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
		
		String url=driver.getCurrentUrl();
		System.out.println("URL is: "+url);
		
		int width=300,height=500;
		Dimension dim=new Dimension(width, height);
		driver.manage().window().setSize(dim);
		Thread.sleep(3000);
		Point point=new Point(width, height);
		driver.manage().window().setPosition(point);
		Thread.sleep(3000);
		driver.close();
	}

}
