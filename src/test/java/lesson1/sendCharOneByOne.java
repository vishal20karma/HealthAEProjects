package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendCharOneByOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	WebElement box = driver.findElement(By.xpath("//input[@class='search-keyword']"));
	String str = "Cucumber";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	String s = String.valueOf(c);
	box.sendKeys(s);
	Thread.sleep(500);
	}
	driver.quit();   */		

//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	WebElement box = driver.findElement(By.xpath("//input[@class='search-keyword']"));
	String str = "Cucumber";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	String s = String.valueOf(c);
	box.sendKeys(s);
	Thread.sleep(500);
	}
	driver.quit();
	
	}

}