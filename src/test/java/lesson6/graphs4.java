package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class graphs4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to handle pie charts	
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://emicalculator.net/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500)");
	String pieChart = "(//*[local-name()='svg'] //*[name()='g' and @class='highcharts-series-group'])[1] //*[name()='path']";
	String toolTips = "(//*[local-name()='svg'])[1] //*[name()='g' and contains (@class, 'highcharts-label highcharts-tooltip')] //*[name()='text']";
	List<WebElement> pieDivisions = driver.findElements(By.xpath(pieChart));
	Actions a = new Actions(driver);
	for (WebElement e:pieDivisions)   {
	a.moveToElement(e).build().perform();
	Thread.sleep(500);
	String toolTipTxt = driver.findElement(By.xpath(toolTips)).getText();
	System.out.println(toolTipTxt);
	Thread.sleep(1000);
	}
	driver.quit();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://emicalculator.net/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500)");
	String pieChart = "(//*[local-name()='svg'] //*[name()='g' and @class='highcharts-series-group'])[1] //*[name()='path']";
	String toolTips = "(//*[local-name()='svg'])[1] //*[name()='g' and contains (@class, 'highcharts-label highcharts-tooltip')] //*[name()='text']";
	List<WebElement> pieDivisions = driver.findElements(By.xpath(pieChart));
	Actions a = new Actions(driver);
	for (WebElement e:pieDivisions)   {
	a.moveToElement(e).build().perform();
	Thread.sleep(500);
	String toolTipTxt = driver.findElement(By.xpath(toolTips)).getText();
	System.out.println(toolTipTxt);
	Thread.sleep(1000);
	}
	driver.quit();
	
	}

}