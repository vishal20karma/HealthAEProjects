package lesson1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
    driver.navigate().forward();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	
	}

}