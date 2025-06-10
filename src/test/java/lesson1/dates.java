package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dates {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	Thread.sleep(2000);
	driver.quit();   */
			
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}

}