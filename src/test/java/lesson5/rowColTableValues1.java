package lesson5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class rowColTableValues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Simplest and direct way to get all the data in a table	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300)");
	getRowsColData(driver);
	driver.quit();
		
	}
	
	public static void getRowsColData(WebDriver driver)   {
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
	for (int i=0;i<rows.size();i++)   {
	String data = rows.get(i).getText();
	System.out.println(data);
	} 
	}
}