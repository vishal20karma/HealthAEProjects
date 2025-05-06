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

public class pagination4Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");		
	driver.findElement(By.xpath("//thead/tr/th[1]")).click();
	ArrayList<String> vg = new ArrayList<String>();
	ArrayList<String> pr = new ArrayList<String>();
	String next=null;
	do {
	next = driver.findElement(By.xpath("//a[@aria-label='Next']")).getDomAttribute("aria-disabled");	
	List<WebElement> orgList = driver.findElements(By.xpath("//tbody/tr"));
	List<String> veggies = orgList.stream().map(s->getVeggie(s)).collect(Collectors.toList());
	vg.addAll(veggies);
	List<String> prices =  orgList.stream().map(s->getPrice(s)).collect(Collectors.toList());
	pr.addAll(prices);
	if (next.contains("false"))   {
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	}
	} while (next.contains("false"));
	
	System.out.println(vg);
	System.out.println(pr);
	for (int i=0;i<vg.size();i++)   {
	System.out.println(vg.get(i)+" : "+pr.get(i));
	driver.quit();
	}
	
	}

	public static String getVeggie(WebElement s)   {
	String veggies = s.findElement(By.xpath("td[1]")).getText();	
	return veggies;
	}

    public static String getPrice(WebElement s)   {
    String price = s.findElement(By.xpath("td[1]/following-sibling::td[1]")).getText();	
    return price;
    }
}
