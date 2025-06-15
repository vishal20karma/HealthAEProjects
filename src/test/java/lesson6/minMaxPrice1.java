package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class minMaxPrice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//	How to get maximum and minimum prices on eCommerce web portal by using Streams, also how to use Normalize Space Xpath	
/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/v1/inventory.html");
	List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));
	System.out.println("Total Items: "+prices.size());
	double maxPrice = prices.stream().mapToDouble(d->Double.parseDouble(d.getText().replace("$", "")
			.trim())).max().getAsDouble();
	System.out.println(maxPrice);
	double minPrice = prices.stream().mapToDouble(d->Double.parseDouble(d.getText().replace("$", "")
			.trim())).min().getAsDouble();
	System.out.println(minPrice);
	driver.findElement(By.xpath("//div[normalize-space()='$"+maxPrice+"']/following-sibling::button")).click();
	driver.findElement(By.xpath("//div[normalize-space()='$"+minPrice+"']/following-sibling::button")).click();
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.saucedemo.com/v1/inventory.html");
	List<WebElement> priceList = driver.findElements(By.className("inventory_item_price"));
	System.out.println("Total items: "+priceList.size());
	double maxPrice = priceList.stream().mapToDouble(d->Double.parseDouble(d.getText().replace("$", "")
			.trim())).max().getAsDouble();
	System.out.println(maxPrice);
	double minPrice = priceList.stream().mapToDouble(d->Double.parseDouble(d.getText().replace("$", "")
			.trim())).min().getAsDouble();
	System.out.println(minPrice);
	driver.findElement(By.xpath("//div[normalize-space()='$"+maxPrice+"']/following-sibling::button")).click();
	driver.findElement(By.xpath("//div[normalize-space()='$"+minPrice+"']/following-sibling::button")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}

}
