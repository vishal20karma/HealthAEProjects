package lesson3;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addAllItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
/*  WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	List<WebElement> addItems = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
	for (int i=0;i<addItems.size();i++)   {
	addItems.get(i).click();	
	}
	Thread.sleep(2000);
	String totItems = driver.findElement(By.xpath("(//tbody/tr/td[3]/strong)[1]")).getText();
	Assert.assertEquals(30, Integer.parseInt(totItems));
	Thread.sleep(2000);
	driver.quit();   */

//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	List<WebElement> addItems = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
	for (int i=0;i<addItems.size();i++)   {
	addItems.get(i).click();	
	}
	Thread.sleep(2000);
	String totItems = driver.findElement(By.xpath("(//tbody/tr/td[3]/strong)[1]")).getText();
	Assert.assertEquals(30, Integer.parseInt(totItems));
	Thread.sleep(2000);
	driver.quit();
	
	}

}
