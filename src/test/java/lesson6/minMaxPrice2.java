package lesson6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class minMaxPrice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/v1/inventory.html");
	List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
	ArrayList<Double> arl = new ArrayList<Double>();
	for (WebElement d:priceList)   {
	double price = Double.parseDouble(d.getText().replace("$", "").trim());
	arl.add(price);
	}
	System.out.println(arl);
	double minPrice = arl.get(0);   //In ArrayList we used '.get(0)' for indexing, '[0]' is used in Array
	double maxPrice = arl.get(0);
	for (int i=1;i<arl.size();i++)   {
	if (arl.get(i)<minPrice)   {
	minPrice=arl.get(i);	
	}
	else if (arl.get(i)>maxPrice)   {
	maxPrice=arl.get(i);	
	}
	}
	System.out.println(minPrice);
	driver.findElement(By.xpath("//div[normalize-space()='$"+minPrice+"']/following-sibling::button")).click();
	System.out.println(maxPrice);
	driver.findElement(By.xpath("//div[normalize-space()='$"+maxPrice+"']/following-sibling::button")).click();
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/v1/inventory.html");
	List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
	ArrayList<Double> arl = new ArrayList<Double>();
	for (WebElement d:priceList)   {
	double prices = Double.parseDouble(d.getText().replace("$", "").trim());	
	arl.add(prices);
	}
	System.out.println(arl);
	double minPrice = arl.get(0);
	double maxPrice = arl.get(0);
	for (int i=0;i<arl.size();i++)   {
	if (arl.get(i)<minPrice)   {
	minPrice=arl.get(i);	
	}
	else if (arl.get(i)>maxPrice)   {
	maxPrice=arl.get(i);	
	}
	}
	System.out.println(minPrice);
	driver.findElement(By.xpath("//div[normalize-space()='$"+minPrice+"']/following-sibling::button")).click();
	System.out.println(maxPrice);
	driver.findElement(By.xpath("//div[normalize-space()='$"+maxPrice+"']/following-sibling::button")).click();
	
	}

}
