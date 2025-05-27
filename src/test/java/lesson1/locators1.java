package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Rahul");   //By id
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");   //By name
	driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();   //By Xpath
	String s = driver.findElement(By.partialLinkText("privacy")).getText();   //By Partial link text
	System.out.println(s);
	driver.findElement(By.className("signInBtn")).click();   //ClassName (if element has class attribute then its values can be used for 'classname', also it can only have one value)
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();   //Xpath by Text method
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgot your password?")).click();   //By link text
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();   //By Css
	Thread.sleep(2000);
	String t = driver.findElement(By.tagName("h1")).getText();   //By tagname
	System.out.println(t);
	driver.quit();   */
			
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
	String s = driver.findElement(By.partialLinkText("privacy")).getText();
	System.out.println(s);
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
	Thread.sleep(2000);
	String t = driver.findElement(By.tagName("h1")).getText();
	System.out.println(t);
	driver.quit();	
	
	}

}