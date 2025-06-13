package lesson5;

import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
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
    
	}
   
	public static void getRowColData(WebDriver driver)   {
	List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	for (int i=0;i<cols.size();i++)   {
	System.out.println("Header"+(i+1)+":"+cols.get(i).getText());	
	}
	for (int j=1;j<rows.size();j++)   {
	for (int k=1;k<=cols.size();k++)   {
	String dValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(j+1)+"]/td["+k+"]")).getText();
	System.out.println("Row:"+j+" : "+"Col:"+k);
	System.out.println(dValue);
	}
	}
	}

}