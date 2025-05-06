package lesson5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rowColTableValues6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
//  Adding all the values and comparing with total	
/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600)");
	Thread.sleep(2000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	List<WebElement> tValues = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
	int vSum=0;
	for (int i=0;i<tValues.size();i++)   {
	vSum=vSum+Integer.parseInt(tValues.get(i).getText());	
	}
	System.out.println("Calculated sum - "+vSum);
	String s = driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
	String [] sValue = s.split(":");
	String fValue = sValue[1].trim();
	int tValue = Integer.parseInt(fValue);
	System.out.println("Total sum - "+tValue);
	Assert.assertEquals(vSum, tValue);
    Thread.sleep(2000);
    driver.quit();   */

//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600)");
	Thread.sleep(1000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	List<WebElement> tValues = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
	int vSum=0;
	for (int i=0;i<tValues.size();i++)   {
	vSum=vSum+Integer.parseInt(tValues.get(i).getText());
	}
	System.out.println("Calculated sum: "+vSum);
	String s = driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
	String [] sValue = s.split(":");
	String fValue = sValue[1].trim();
	int tValue = Integer.parseInt(fValue);
	System.out.println("Total value: "+tValue);
	Assert.assertEquals(vSum, tValue);
	Thread.sleep(2000);
	driver.quit();
	
	}

}
