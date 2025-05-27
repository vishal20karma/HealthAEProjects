package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolTipMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/social-icon.html");
	Actions a = new Actions(driver);
	WebElement wb =driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-github'])[2]"));
	a.moveToElement(wb).build().perform();
	Thread.sleep(2000);
	String txt = wb.getDomAttribute("title");
	System.out.println(txt);
	Thread.sleep(2000);
	driver.quit();   */
	
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/social-icon.html");
	WebElement wb = driver.findElement(By.xpath("(//a[@class='fa fa-lg fa-github'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(wb).build().perform();
	Thread.sleep(2000);
	String txt = wb.getDomAttribute("title");
	System.out.println(txt);
	Thread.sleep(2000);
	driver.quit();
	
	}

}