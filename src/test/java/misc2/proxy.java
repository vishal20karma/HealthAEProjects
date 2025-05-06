package misc2;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class proxy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	Proxy proxy = new Proxy();
	proxy.setHttpProxy("ipaddress:4444");
	c.setCapability("proxy", proxy);
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.get("https://xyz.com/");
	Thread.sleep(1000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	Proxy proxy = new Proxy();
	proxy.setHttpProxy("ipaddress.4444");
	c.setCapability("proxy", proxy);
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.quit();
	
	}

}
