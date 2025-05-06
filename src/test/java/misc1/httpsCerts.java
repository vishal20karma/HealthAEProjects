package misc1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class httpsCerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  Now Desired Capabilities have been depreciated, instead used ChromeOptions class	
/*	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.setAcceptInsecureCerts(true);
	WebDriver driver1 = new ChromeDriver(c);
	driver1.manage().window().maximize();
	driver1.get("https://expired.badssl.com/");
	Thread.sleep(1000);
	driver1.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.setAcceptInsecureCerts(true);
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.get("https://expired.badssl.com/");
	Thread.sleep(1000);
	driver.quit();

	System.out.println("*****************************");
	
/*	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions f = new FirefoxOptions();
	f.setAcceptInsecureCerts(true);
	WebDriver driver2 = new FirefoxDriver(f);
	driver2.get("https://expired.badssl.com/");
	Thread.sleep(1000);
	driver2.quit();   */
	
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions f = new FirefoxOptions();
	f.setAcceptInsecureCerts(true);
	WebDriver driver2 = new FirefoxDriver(f);
	driver2.get("https://expired.badssl.com/");
	Thread.sleep(1000);
	driver2.quit();
	
	System.out.println("*****************************");
	
/*	WebDriverManager.edgedriver().setup();
	EdgeOptions e = new EdgeOptions();
	e.setAcceptInsecureCerts(true);
	WebDriver driver3 = new EdgeDriver(e);
	driver3.manage().window().maximize();
	driver3.get("https://expired.badssl.com/");
	Thread.sleep(1000);
	driver3.quit();   */
	
	WebDriverManager.edgedriver().setup();
	EdgeOptions e = new EdgeOptions();
	e.setAcceptInsecureCerts(true);
	WebDriver driver3 = new EdgeDriver(e);
	driver3.manage().window().maximize();
	driver3.get("https://expired.badssl.com/");
	Thread.sleep(1000);
	driver3.quit();
	
	}

}
