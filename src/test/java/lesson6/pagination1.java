package lesson6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pagination1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
//  Pagination with do while loop with min max number
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String next=null;
	do {
	List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");
	for (WebElement e:prices)   {
	arl.add(Integer.parseInt(e.getText()));
	}   //Always use if condition for clicking 'next' outside the for loop, else it will try to click 'next' page just after first iteration of loop, putting outside 'if' condition will execute once all the prices are stored of that page
	if (next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	
	}
	} while (next.contains("false"));
    
	System.out.println(arl);
	int minPrice=arl.get(0);
	int maxPrice=arl.get(0);
	for (int i=0;i<arl.size();i++)   {
	if (arl.get(i)<minPrice)   {
	minPrice=arl.get(i);	
	}
	else if (arl.get(i)>maxPrice)   {
	maxPrice=arl.get(i);	
	}
	}
		
	Select s = new Select(driver.findElement(By.id("page-menu")));
	s.selectByValue("20");
	Thread.sleep(1000);
	String minPriceItem = driver.findElement(By.xpath("//tbody/tr/td[text()="+minPrice+"]/preceding-sibling::td")).getText();
	System.out.println("Minimum price item: "+minPriceItem+" : "+minPrice);
	String maxPriceItem = driver.findElement(By.xpath("//tbody/tr/td[text()="+maxPrice+"]/preceding-sibling::td")).getText();
	System.out.println("Maximum price item: "+maxPriceItem+" : "+maxPrice);
	Thread.sleep(1000);
	driver.quit();   */

//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String next=null;
	do {
	List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");
	for (WebElement e:prices)   {
	arl.add(Integer.parseInt(e.getText()));
	}
	if (next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	
	}
	} while (next.contains("false"));
    
	System.out.println(arl);
	int minPrice=arl.get(0);
	int maxPrice=arl.get(0);
	for (int i=0;i<arl.size();i++)   {
	if (arl.get(i)<minPrice)   {
	minPrice=arl.get(i);	
	}
	else if (arl.get(i)>maxPrice)   {
	maxPrice=arl.get(i);	
	}
	}
		
	Select s = new Select(driver.findElement(By.id("page-menu")));
	s.selectByValue("20");
	Thread.sleep(1000);
	String minPriceItem = driver.findElement(By.xpath("//tbody/tr/td[text()='"+minPrice+"']/preceding-sibling::td")).getText();
	System.out.println("Minimum price item: "+minPriceItem+" : "+minPrice);
	String maxPriceItem = driver.findElement(By.xpath("//tbody/tr/td[text()='"+maxPrice+"']/preceding-sibling::td")).getText();
	System.out.println("Maximum price item: "+maxPriceItem+" : "+maxPrice);
	Thread.sleep(1000);
	driver.quit();
	
	}
}
