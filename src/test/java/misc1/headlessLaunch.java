package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headlessLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Without launching the browser	
/*	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--headless");
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/");
	WebElement wb = driver.findElement(By.xpath("(//div[@class='login-btn'])[2]"));
	System.out.println(wb.getText());   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--headless");
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/");
	WebElement wb = driver.findElement(By.xpath("(//div[@class='login-btn'])[2]"));
	System.out.println(wb.getText());
	
	}

}
