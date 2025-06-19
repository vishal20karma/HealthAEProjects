package lesson4;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newTabWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/angularpractice/");		
	driver.switchTo().newWindow(WindowType.TAB);   //This step switches to new tab/window and switches the controls also
//	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://rahulshettyacademy.com/");
	Thread.sleep(1000);
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String pWin = it.next();   //No need to create for child window as already 'newWindow' has been used and control goes to child then
	Thread.sleep(2000);
	String courseName = driver.findElement(By.xpath("(//a[contains(@href, 'cypress')])[2]")).getText();
	System.out.println(courseName);
	driver.switchTo().window(pWin);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(courseName);
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/angularpractice/");		
	driver.switchTo().newWindow(WindowType.TAB);   //This step switches to new tab/window and switches the controls also
//	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://rahulshettyacademy.com/");
	Thread.sleep(1000);
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String pWin = it.next();   //No need to create for child window as already 'newWindow' has been used and control goes to child then
	Thread.sleep(2000);
	String courseName = driver.findElement(By.xpath("(//a[contains(@href, 'cypress')])[2]")).getText();
	System.out.println(courseName);
	driver.switchTo().window(pWin);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(courseName);
	Thread.sleep(2000);
	driver.quit();

	}

}