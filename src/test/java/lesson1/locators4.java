package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//  How to identify dynamic locators with the help of relative locators, also miscellaneous locators
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement refElmnt1 = driver.findElement(By.id("opentab"));
	WebElement refElmnt2 = driver.findElement(By.id("openwindow"));
	
//  How to find the left locator which is dynamic
	WebElement left = driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(refElmnt1));
	System.out.println(left.getText());
	
//  How to find the right locator which is dynamic
	WebElement right = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(refElmnt2));
	System.out.println(right.getText());
	
//  How to find the above locator which is dynamic
	WebElement above = driver.findElement(RelativeLocator.with(By.tagName("legend")).above(refElmnt1));
	System.out.println(above.getText());
	
//  How to find the below locator which is dynamic	
	WebElement below = driver.findElement(RelativeLocator.with(By.tagName("div")).below(refElmnt1));
	System.out.println(below.getDomAttribute("class"));
	
//	How to find the near locator which is dynamic
	WebElement near = driver.findElement(RelativeLocator.with(By.tagName("legend")).near(refElmnt1));
	System.out.println(near.getText());
	
//  Starts with locator which is dynamic
	WebElement totAmt = driver.findElement(By.xpath("//div[starts-with(@class,'total')]"));
	System.out.println(totAmt.getText());
	
//  Double Xpath(Main to child) by using contains, these are also called descendants xpaths
	WebElement etName = driver.findElement(By.xpath("//fieldset[@class='pull-right'] //input[contains(@placeholder,'Enter')]"));
	etName.sendKeys("Vishal");
	
//  Double Xpath(Main to child) by using contains - Second Example, these are also called descendants xpaths
	WebElement brkLink = driver.findElement(By.xpath("//div[@id='gf-BIG'] //a[contains(text(),'Broken')]"));
	System.out.println(brkLink.getText());
	
//  How to find the last element dynamically
	WebElement yTube = driver.findElement(By.xpath("(//div[@id='gf-BIG'] //a)[last()]"));
	System.out.println(yTube.getText());
	
//  How to find the second last element 	
	WebElement google = driver.findElement(By.xpath("(//div[@id='gf-BIG'] //a)[last()-1]"));
	System.out.println(google.getText());
	
//  How to find the locator with position	
	WebElement soapUI = driver.findElement(By.xpath("(//div[@id='gf-BIG'] //a)[position()=3]"));
	System.out.println(soapUI.getText());
	
	Thread.sleep(2000);
	driver.quit();
	
	}

}
