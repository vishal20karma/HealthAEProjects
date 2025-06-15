package lesson6;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class pagination3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.xpath("//thead/tr/th[1]")).click();
	List<String> price;
	do {
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr"));
	price = orgList.stream().filter(s->getVeggie(s).contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
	price.forEach(a->System.out.println("Rice price: "+a));
	if (price.size()<1)   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	
	}
	} while (price.size()<1);
	driver.quit();
		
	}

	public static String getVeggie(WebElement orgList)   {
	String veggie = orgList.findElement(By.xpath("td[1]")).getText();
	return veggie;
	}

	public static String getPrice(WebElement orgList)   {
	String price = orgList.findElement(By.xpath("td[1]/following-sibling::td[1]")).getText();	
	return price;
    }

}
