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
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String next=null;
	do {
	List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));   //When page refreshes, then WebElement is not found and throws Stale Element exception. Therefore it has been used in the do while block itself
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");
	int i=0;
	for (WebElement p:prices)   {
	arl.add(Integer.parseInt(p.getText()));
	i++;
	if (prices.size()==i && next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	Thread.sleep(1000);
	}
	}
	} while (next.contains("false"));
	
	System.out.println(arl);
	int minPrice = arl.get(0);
	int maxPrice = arl.get(0);
	for (int j=0;j<arl.size();j++)   {
	if (arl.get(j)<minPrice)   {
	minPrice=arl.get(j);
	}
	else if (arl.get(j)>maxPrice)   {
	maxPrice=arl.get(j);	
	}
	}
			
	Select s = new Select(driver.findElement(By.id("page-menu")));
	s.selectByValue("20");
	Thread.sleep(1000);
	System.out.println("Minimum price- "+minPrice);
	String s1 = driver.findElement(By.xpath("//tbody/tr/td[text()='"+minPrice+"']/preceding-sibling::td")).getText();
	System.out.println(s1);
	System.out.println("Maximum price- "+maxPrice);
	String s2 = driver.findElement(By.xpath("//tbody/tr/td[text()='"+maxPrice+"']/preceding-sibling::td")).getText();
	System.out.println(s2);
	Thread.sleep(2000);
	driver.quit();   */

//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String next = null;
	do {
	List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");
	int i=0;
	for (WebElement p:prices)   {
	arl.add(Integer.parseInt(p.getText()));
	i++;
	if (prices.size()==i && next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	Thread.sleep(1000);
	}
	}
	} while (next.contains("false"));
	
	System.out.println(arl);
	int minPrice = arl.get(0);
	int maxPrice = arl.get(0);
	for (int j=1;j<arl.size();j++)   {
	if (arl.get(j)<minPrice)   {
	minPrice=arl.get(j);	
	}
	else if (arl.get(j)>maxPrice)   {
	maxPrice=arl.get(j);	
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
