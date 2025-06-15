package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to handle Java Alerts
/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys("Vishal");
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
//	driver.switchTo().alert().dismiss();   //This also works, accept or dismiss are same in Java alerts
	Thread.sleep(1000);
	driver.findElement(By.id("name")).sendKeys("Vishal");
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(1000);
	String alertText = driver.switchTo().alert().getText();
	System.out.println(alertText);
	driver.switchTo().alert().dismiss();
	driver.quit();   */

//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.id("name")).sendKeys("Vishal");
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
//  driver.switchTo().alert().dismiss();
	driver.findElement(By.id("name")).sendKeys("Vishal");
	driver.findElement(By.id("confirmbtn")).click();
	Thread.sleep(1000);
	String alertTxt = driver.switchTo().alert().getText();
	System.out.println(alertTxt);
	driver.switchTo().alert().dismiss();
	driver.quit();
	
	}

}