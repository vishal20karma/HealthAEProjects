package lesson6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pagination4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Pagination with Streams with side by side values
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
	driver.findElement(By.xpath("(//thead/tr/th)[1]")).click();
	ArrayList<String> vg = new ArrayList<String>();
	ArrayList<String> pr = new ArrayList<String>();
	String next = null;
	List<String> veggies;
	List<String> prices;
	do {
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");	
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr"));
	veggies = orgList.stream().map(s->getVeggie(s)).collect(Collectors.toList());
	vg.addAll(veggies);
	prices = orgList.stream().map(s->getPrice(s)).collect(Collectors.toList());
	pr.addAll(prices);
	if (next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	}	
	} while (next.contains("false"));
		
	System.out.println(vg);
	System.out.println(pr);
	for (int i=0;i<vg.size();i++) {
	System.out.println(vg.get(i)+":"+pr.get(i));   //Simple and Best way to print two ArrayList values side by side
	}
	driver.quit();		
	
	}
	
	public static String getVeggie(WebElement s)   {
	String vegValue = s.findElement(By.xpath("td[1]")).getText();	
	return vegValue;
	}
	
	public static String getPrice(WebElement s)   {
	String priceValue = s.findElement(By.xpath("td[1]/following-sibling::td[1]")).getText();	
	return priceValue;
	}

}