package misc1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/");
	Thread.sleep(2000);
	driver.quit();
	
	}

}