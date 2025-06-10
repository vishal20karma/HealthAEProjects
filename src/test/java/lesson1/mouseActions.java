package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	WebElement wb1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	WebElement wb2 = driver.findElement(By.id("twotabsearchtextbox"));
	WebElement wb3 = driver.findElement(By.cssSelector("span.icp-nav-flag.icp-nav-flag-in.icp-nav-flag-lop"));
	Actions a = new Actions(driver);
	a.moveToElement(wb1).build().perform();   //Move hover
	Thread.sleep(1000);
	a.moveToElement(wb2).click().keyDown(Keys.SHIFT).sendKeys("adidas").doubleClick().build().perform();
	Thread.sleep(1000);
	a.moveToElement(wb3).contextClick().build().perform();   //Right click
	Thread.sleep(1000);
	driver.quit();   */
	
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	WebElement wb1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	WebElement wb2 = driver.findElement(By.id("twotabsearchtextbox"));
	WebElement wb3 = driver.findElement(By.cssSelector(".icp-nav-flag.icp-nav-flag-in.icp-nav-flag-lop"));
	Actions a = new Actions(driver);
	a.moveToElement(wb1).build().perform();
	Thread.sleep(1000);
	a.moveToElement(wb2).click().keyDown(Keys.SHIFT).sendKeys("adidas").doubleClick().build().perform();
	Thread.sleep(1000);
	a.moveToElement(wb3).contextClick().build().perform();
	Thread.sleep(1000);
	driver.quit();
	
	}

}
