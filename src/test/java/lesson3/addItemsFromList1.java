package lesson3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addItemsFromList1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  Adding items from list   //Arrays take less memory to store values, Arrays List are used to handle complicated codes	
//  We can directly create Array List	
/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	String [] prdItems = {"Cucumber - 1 Kg", "Tomato - 1 Kg", "Apple - 1 Kg", "Banana - 1 Kg", "Nuts Mixture - 1 Kg"};
	List<String> neededList = Arrays.asList(prdItems);
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	for (int i=0;i<products.size();i++)   {
	String prdNames = products.get(i).getText();
	if (neededList.contains(prdNames))   {
	System.out.println(prdNames);
	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	}
	}
	Thread.sleep(2000);
	driver.quit();
	}
	}   */
	
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	String [] prdItems = {"Cucumber - 1 Kg", "Tomato - 1 Kg", "Apple - 1 Kg", "Banana - 1 Kg", "Nuts Mixture - 1 Kg"};
	List<String> neededList = Arrays.asList(prdItems);
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	for (int i=0;i<products.size();i++)   {
	String prdNames = products.get(i).getText();
	if (neededList.contains(prdNames))   {
	System.out.println(prdNames);
	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	}
	}
	Thread.sleep(2000);
	driver.quit();
	
	}

}