package lesson3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addSelItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));	
	for (int i=0;i<products.size();i++)   {
	String prdNames = products.get(i).getText();	
	if (prdNames.contains("Tomato"))   {
	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
	System.out.println(prdNames);
	break;
	}
	}
	Thread.sleep(2000);
	driver.quit();   */

//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));	
	for (int i=0;i<products.size();i++)   {
	String prdNames = products.get(i).getText();	
	if (prdNames.contains("Tomato"))   {
	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
	System.out.println(prdNames);
	break;
	}
	}
	Thread.sleep(2000);
	driver.quit();	
	
	}

}
