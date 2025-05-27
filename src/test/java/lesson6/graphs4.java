package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class graphs4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to handle pie charts	
/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://emicalculator.net/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500)");
	String pieChart = "(//*[name()='svg'])[1]//*[local-name()='g' and @data-z-index='0.1']//*[local-name()='path']";
	String tooTips = "(//*[name()='svg'])[1]//*[local-name()='g'][4]//*[local-name()='text']";
	List<WebElement> pieDivisions = driver.findElements(By.xpath(pieChart));
	Actions a = new Actions(driver);
	for (WebElement e:pieDivisions)   {
	a.moveToElement(e).build().perform();
	String toolTipTxt = driver.findElement(By.xpath(tooTips)).getText();
	System.out.println(toolTipTxt);
	Thread.sleep(1000);
	}
	driver.quit();   */
		
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://emicalculator.net/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500)");
	String pieChart = "(//*[local-name()='svg'])[1]//*[name()='g' and @data-z-index='0.1']//*[name()='path']";
	String toolTip = "(//*[local-name()='svg'])[1]//*[name()='g'][4]//*[name()='text']";
	List<WebElement> pieDivisions = driver.findElements(By.xpath(pieChart));
	Actions a = new Actions(driver);
	for (WebElement e:pieDivisions)   {
	a.moveToElement(e).build().perform();
	String toolTipTxt = driver.findElement(By.xpath(toolTip)).getText();
	System.out.println(toolTipTxt);
	}
	driver.quit();
	
	}

}