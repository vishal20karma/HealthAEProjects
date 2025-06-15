package misc1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incognito {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to launch browser in incognito mode	(Note-DesiredCapabilites have been depreciated)
/*	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver.quit();   */
	
//  For Practice
	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--incognito");
	WebDriver driver1 = new ChromeDriver(c);
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver1.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver1.quit();
		
//  Open Firefox in private window (incognito mode of firefox)	
/*	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions f = new FirefoxOptions();
	f.addArguments("--private");
	WebDriver driver2 = new FirefoxDriver(f);
	driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver2.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver2.quit();   */
	
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions f = new FirefoxOptions();
	f.addArguments("-private");
	WebDriver driver2 = new FirefoxDriver(f);
	driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver2.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver2.quit();
	
//  Open Edge InPrivate window (incognito mode of firefox)	
/*	WebDriverManager.edgedriver().setup();
	EdgeOptions e = new EdgeOptions();
	e.addArguments("--inprivate");
	WebDriver driver3 = new EdgeDriver(e);
	driver3.manage().window().maximize();
	driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver3.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver3.quit();   */
	
//  For Practice
	WebDriverManager.edgedriver().setup();
	EdgeOptions e = new EdgeOptions();
	e.addArguments("--inprivate");
	WebDriver driver3 = new EdgeDriver(e);
	driver3.manage().window().maximize();
	driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver3.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver3.quit();
	
	}

}