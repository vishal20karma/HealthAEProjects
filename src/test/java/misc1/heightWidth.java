package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class heightWidth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement wb = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	int width = wb.getRect().getWidth();
	int height = wb.getRect().getHeight();
	System.out.println("Width- "+width+" : "+"Height- "+height);
	Dimension d = wb.getRect().getDimension();
	System.out.println(d);
	Thread.sleep(1000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement wb = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	int width = wb.getRect().getWidth();
	int height = wb.getRect().getHeight();
	System.out.println("Width- "+width+" : "+"Height- "+height);
	Dimension d = wb.getRect().getDimension();
	System.out.println(d);
	Thread.sleep(1000);
	driver.quit();
	
	}

}