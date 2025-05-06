package lesson6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//thead/tr/th[1]")).click();
	ArrayList<String> veggieList = new ArrayList<String>();
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	for (WebElement s:orgList)   {
	veggieList.add(s.getText());	
	}
	System.out.println(veggieList);
	List<String> srtList = orgList.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
	System.out.println(srtList);
	Assert.assertEquals(veggieList, srtList);
	System.out.println("Both are equal");
	driver.quit();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//thead/tr/th[1]")).click();
	ArrayList<String> veggieList = new ArrayList<String>();
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	for (WebElement s:orgList)   {
	veggieList.add(s.getText());	
	}
	System.out.println(veggieList);
	List<String> srtList = orgList.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
	System.out.println(srtList);
	Assert.assertEquals(veggieList, srtList);
	System.out.println("Both are equal");
	driver.quit();
	
	}

}
