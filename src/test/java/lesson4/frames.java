package lesson4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/droppable/");
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	WebElement frms = driver.findElement(By.tagName("iframe"));
	System.out.println("Total frames- "+frames.size());
	driver.switchTo().frame(frms);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).build().perform();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	String url = driver.findElement(By.xpath("//a[text()='Resizable']")).getDomProperty("href");
	System.out.println(url);
	Thread.sleep(2000);
	driver.quit();   */		
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://jqueryui.com/droppable/");
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	WebElement frms = driver.findElement(By.tagName("iframe"));
	System.out.println("Total frames- "+frames.size());
	driver.switchTo().frame(frms);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).build().perform();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	String url = driver.findElement(By.xpath("//a[text()='Resizable']")).getDomProperty("href");
	System.out.println(url);
	Thread.sleep(2000);
	driver.quit();
	
	}

}