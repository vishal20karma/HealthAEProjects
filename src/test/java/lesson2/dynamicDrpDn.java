package lesson2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDrpDn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Mumbai (BOM)']")).click();
//	driver.findElement(By.xpath("(//a[text()=' Coimbatore (CJB)'])[2]")).click();   //By Indexing
	driver.findElement(By.xpath("(//div[@class='dropdownDiv'])[3] //a[text()=' Coimbatore (CJB)']")).click();   //Xpath within Xpath
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Mumbai (BOM)']")).click();
//	driver.findElement(By.xpath("(//a[text()=' Coimbatore (CJB)'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='dropdownDiv'])[3] //a[text()=' Coimbatore (CJB)']")).click();
	Thread.sleep(2000);
	driver.quit();

	}

}
