package lesson3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addItemsGen2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
	String [] prdItems = {"Cucumber", "Tomato", "Apple", "Banana", "Nuts Mixture"};
	List<String> neededList = Arrays.asList(prdItems);
	addItems(driver, neededList);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	WebElement cdTxt = driver.findElement(By.className("promoInfo"));
	wt.until(ExpectedConditions.visibilityOf(cdTxt));
	Assert.assertEquals("Code applied ..!", cdTxt.getText());
	Thread.sleep(2000);
	driver.quit();
	
	}

	public static void addItems(WebDriver driver, List<String> neededList)   {
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
	if (j==neededList.size())   {
	break;	
	}
	}
	}
	
	}
}
