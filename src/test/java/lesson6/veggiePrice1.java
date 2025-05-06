package lesson6;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class veggiePrice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//thead/tr/th[1]")).click();
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	List<String> price = orgList.stream().filter(s->s.getText()
			.contains("Beans")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
	price.forEach(a->System.out.println("Beans price: "+a));
	driver.quit();
	}

	public static String getVeggiePrice(WebElement s)   {
	String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();	
	return priceValue;   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//thead/tr/th[1]")).click();
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	List<String> price = orgList.stream().filter(s->s.getText()
			.contains("Beans")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
	price.forEach(a->System.out.println("Beans price: "+a));
	driver.quit();
	}

	public static String getVeggiePrice(WebElement s)   {
	String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();	
	return priceValue;
	}

}