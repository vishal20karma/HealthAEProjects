package lesson2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestiveDrDn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("mal");
	List<WebElement> autoSg = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	for (int i=0;i<autoSg.size();i++)   {
	String s = autoSg.get(i).getText();	
	if (s.equalsIgnoreCase("somalia"))   {
	autoSg.get(i).click();
	break;
	}
	}
	Thread.sleep(2000);
	driver.quit();   */
    
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("mal");
	List<WebElement> autoSg = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	for (int i=0;i<autoSg.size();i++)   {
	String s = autoSg.get(i).getText();	
	if (s.equalsIgnoreCase("somalia"))   {
	autoSg.get(i).click();
	break;
	}
	}
	Thread.sleep(2000);
	driver.quit();
	
	}

}
