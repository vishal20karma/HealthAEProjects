package lesson1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserInvoke {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver1 = new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver1.get("https://www.facebook.com/");
	System.out.println(driver1.getTitle());
	System.out.println(driver1.getCurrentUrl());
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver1 = new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver1.get("https://www.facebook.com/");
	System.out.println(driver1.getTitle());
	System.out.println(driver1.getCurrentUrl());
	Thread.sleep(2000);
	driver1.quit();
	
	System.out.println("*********************************");
		
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver2 = new FirefoxDriver();
	driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver2.get("https://www.facebook.com/");
	System.out.println(driver2.getTitle());
	System.out.println(driver2.getCurrentUrl());
	Thread.sleep(2000);
	driver2.quit();   */
		
//  For Practice	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver2 = new FirefoxDriver();
	driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver2.get("https://www.facebook.com/");
	System.out.println(driver2.getTitle());
	System.out.println(driver2.getCurrentUrl());
	Thread.sleep(2000);
	driver2.quit();
		
	System.out.println("*********************************");
		
/*	WebDriverManager.edgedriver().setup();
	WebDriver driver3 = new EdgeDriver();
	driver3.manage().window().maximize();
	driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver3.get("https://www.facebook.com/");
	System.out.println(driver3.getTitle());
	System.out.println(driver3.getCurrentUrl());
	Thread.sleep(2000);
	driver3.quit();   */
		
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver3 = new EdgeDriver();
	driver3.manage().window().maximize();
	driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver3.get("https://www.facebook.com/");
	System.out.println(driver3.getTitle());
	System.out.println(driver3.getCurrentUrl());
	Thread.sleep(2000);
	driver3.quit();
	
	}

}
