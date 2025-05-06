package lesson5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rowColTableValues5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to get the nth row/column of any data in a table		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300)");
	String dataValue = "Helen Bennett";
	getRowColData(driver, dataValue);
		
	}

	public static void getRowColData(WebDriver driver, String dataValue)   {
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));	
	for (int i=1;i<rows.size();i++)   {   //Always use i=1 for table rows/col iterations
	for (int j=1;j<cols.size();j++)   {
	String dValue = driver.findElement
			(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();	
	if (dValue.equals(dataValue))   {
	System.out.println("nth Row:"+i+" : "+"nth Col:"+j);
	break;
	}
	}
	}
	
	}
}
