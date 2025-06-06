package lesson5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rowColTableValues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Getting data of a particular row/column	
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
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers'] //tr"));	
	for (int i=0;i<rows.size();i++)   {
	if (i==4)   {
	WebElement r4 = rows.get(4);
	List<WebElement> clValues = r4.findElements(By.xpath("td"));   //in this case for xpath, no double slash required in the starting
	for (int j=0;j<clValues.size();j++)   {
	String s = clValues.get(j).getText();
	System.out.println(s);
	}
	}
	}
	
	}
}