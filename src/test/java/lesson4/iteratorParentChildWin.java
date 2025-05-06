package lesson4;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iteratorParentChildWin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.className("blinkingText")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String pWin = it.next();
	String cWin = it.next();
	driver.switchTo().window(cWin);
	Thread.sleep(2000);
	System.out.println("Child Window: "+driver.getTitle());
	String txt = driver.findElement(By.cssSelector(".im-para.red")).getText();
	String [] esplit1 = txt.split("with");
	String [] esplit2 = esplit1[0].split("at");
	String email = esplit2[1].trim();
	System.out.println(email);
	driver.switchTo().window(pWin);
	Thread.sleep(2000);
	System.out.println("Parent Window: "+driver.getTitle());
	driver.findElement(By.id("username")).sendKeys(email);
	Thread.sleep(1000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.className("blinkingText")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String pWin = it.next();
	String cWin = it.next();
	driver.switchTo().window(cWin);
	Thread.sleep(2000);
	System.out.println("Child Window: "+driver.getTitle());
	String txt = driver.findElement(By.cssSelector(".im-para.red")).getText();
	String [] esplit1 = txt.split("with");
	String [] esplit2 = esplit1[0].split("at");
	String email = esplit2[1].trim();
	System.out.println(email);
	driver.switchTo().window(pWin);
	Thread.sleep(2000);
	System.out.println("Parent Window: "+driver.getTitle());
	driver.findElement(By.id("username")).sendKeys(email);
	Thread.sleep(1000);
	driver.quit();	
	
	}

}
