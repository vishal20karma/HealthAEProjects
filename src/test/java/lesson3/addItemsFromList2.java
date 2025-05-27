package lesson3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addItemsFromList2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	String [] prdItems = {"Cucumber", "Tomato", "Apple", "Banana", "Nuts Mixture"};
	List<String> neededList = Arrays.asList(prdItems);
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	int j=0;
	for (int i=0;i<products.size();i++)   {
	String prdNames = products.get(i).getText();	
	String [] spltNames = prdNames.split("-");
	String frmNames = spltNames[0].trim();
	if (neededList.contains(frmNames))   {
	System.out.println(frmNames);
	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();	
	j++;
	if (j==prdItems.length)   {
	break;	
	}
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
	String [] prdItems = {"Cucumber", "Tomato", "Apple", "Banana", "Nuts Mixture"};
	List<String> neededList = Arrays.asList(prdItems);
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	int j=0;
	for (int i=0;i<products.size();i++)   {
	String prdNames = products.get(i).getText();	
	String [] spltNames = prdNames.split("-");
	String frmNames = spltNames[0].trim();
	if (neededList.contains(frmNames))   {
	System.out.println(frmNames);
	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();	
	j++;
	if (j==prdItems.length)   {
	break;	
	}
	}
	}
	Thread.sleep(2000);
	driver.quit();
	}

}