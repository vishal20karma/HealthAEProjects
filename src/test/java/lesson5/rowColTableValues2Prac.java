package lesson5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rowColTableValues2Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300)");
	getRowColData(driver);
	driver.quit();
	
	}

	public static void getRowColData(WebDriver driver)   {
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	int k=1;
	for (WebElement s:cols)   {
	System.out.println("Header"+k+"-"+s.getText());	
	k++;
	}
	for (int i=1;i<rows.size();i++)   {
	for (int j=1;j<=cols.size();j++)   {
	String dValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();	
	System.out.println("Row:"+i+" : "+"Col"+j);
	System.out.println(dValue);
	}
	}
	
	}
}