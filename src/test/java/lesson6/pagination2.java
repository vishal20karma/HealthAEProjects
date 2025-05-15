package lesson6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pagination2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  Pagination with do while loop and streams, for min max number
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String next = null;
	do {
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");   //Always use inside the loop, it refreshes the attribute's value
	List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	List<Integer> priceList = prices.stream().map(s->Integer.parseInt(s.getText())).collect(Collectors.toList());   //It is also 'list' but it can store one page values as this refreshes every loop iteration, therefore ArrayList has been used
	arl.addAll(priceList);
	if (next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	Thread.sleep(1000);
//	System.out.println(priceList);   //It prints the list separately for each page
	}
	} while (next.contains("false"));
	System.out.println(arl);
		
	int minPrice = arl.get(0);
	int maxPrice = arl.get(0);
	for (int i=1;i<arl.size();i++)   {
	if (arl.get(i)<minPrice)   {
	minPrice=arl.get(i);	
	}
	else if (arl.get(i)>maxPrice)   {
	maxPrice=arl.get(i);	
	}
	}
	
	Select s = new Select(driver.findElement(By.id("page-menu")));
	s.selectByValue("20");
	System.out.println("Minimum price- "+minPrice);
	String s1 = driver.findElement(By.xpath("//tbody/tr/td[text()='"+minPrice+"']/preceding-sibling::td")).getText();
	System.out.println(s1);
	System.out.println("Maximum price- "+maxPrice);
	String s2 = driver.findElement(By.xpath("//tbody/tr/td[text()='"+minPrice+"']/preceding-sibling::td")).getText();
	System.out.println(s2);
	driver.quit();   */ 	
	
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String next=null;
	do {
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");
	List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	List<Integer> priceList = prices.stream().map(s->Integer.parseInt(s.getText())).collect(Collectors.toList());
	arl.addAll(priceList);
	if (next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	
	}
	} while (next.contains("false"));
	
	int minPrice = arl.get(0);
	int maxPrice = arl.get(0);
	for (int i=1;i<arl.size();i++)   {
	if (arl.get(i)<minPrice)   {
	minPrice=arl.get(i);	
	}
	else if (arl.get(i)>maxPrice)   {
	maxPrice=arl.get(i);	
	}
	}
	
	Select s = new Select(driver.findElement(By.id("page-menu")));
	s.selectByValue("20");
	Thread.sleep(2000);
	System.out.println("Minimum price: "+minPrice);
	String s1 = driver.findElement(By.xpath("//tbody/tr/td[text()='"+minPrice+"']/preceding-sibling::td")).getText();
	System.out.println(s1);
	System.out.println("Maximum price: "+maxPrice);
	String s2 = driver.findElement(By.xpath("//tbody/tr/td[text()='"+maxPrice+"']/preceding-sibling::td")).getText();
	System.out.println(s2);
	Thread.sleep(2000);
	driver.quit();
	
	}
	
}
