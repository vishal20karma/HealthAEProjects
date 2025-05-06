package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class heightWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement wb = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	int height = wb.getRect().getHeight();
	int width = wb.getRect().getWidth();
	Dimension d = wb.getRect().getDimension();   //This gets width and height both
	System.out.println("Height-"+height+" : "+"Width-"+width);
	System.out.println(d);   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement wb = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	int height = wb.getRect().getHeight();
	int width = wb.getRect().getWidth();
	Dimension d = wb.getRect().getDimension();
	System.out.println("Height: "+height+" - "+"Width: "+width);
	System.out.println(d);
	driver.quit();
	
	}

}
