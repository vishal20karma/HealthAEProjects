package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators3 {

	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("academy");
	driver.findElement(By.cssSelector("button.signInBtn")).click();   //cssSelector - tagname.attribute's value
	String s = driver.findElement(By.className("error")).getText();
	System.out.println(s);
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@123.com");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("123456789");   //css indexing
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//	String t = driver.findElement(By.xpath("//form/p")).getText();   //Parent Child Traversing Xpath
	String t = driver.findElement(By.cssSelector("form p")).getText();   //Parent Child Traversing Css
	System.out.println(t);
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();   //Customised Xpath with child traverse
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");   //tagname#id
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");   //Css Regular Expression
	driver.findElement(By.xpath("//button[contains(@class, 'signInBtn')]")).click();   //Xpath Regular Expression
	Thread.sleep(2000);
	String sms1 = driver.findElement(By.xpath("//p[contains(text(), 'You are')]")).getText();
	Assert.assertEquals(sms1, "You are successfully logged in.");
	String sms2 = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
    Assert.assertEquals(sms2, "Hello Rahul,");
	driver.findElement(By.cssSelector(".logout-btn")).click();
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("academy");
	driver.findElement(By.cssSelector("button.signInBtn")).click();
	String s = driver.findElement(By.className("error")).getText();
	System.out.println(s);
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@123.com");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("123456789");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//	String t = driver.findElement(By.xpath("//form/p")).getText();
	String t = driver.findElement(By.cssSelector("form p")).getText();
	System.out.println(t);
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[contains(@class, 'signInBtn')]")).click();
	Thread.sleep(2000);
	String sms1 = driver.findElement(By.xpath("//p[contains(text(),'You are')]")).getText();
	Assert.assertEquals(sms1, "You are successfully logged in.");
	String sms2 = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
	Assert.assertEquals(sms2, "Hello Rahul,");
	driver.findElement(By.cssSelector(".logout-btn")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}

}
