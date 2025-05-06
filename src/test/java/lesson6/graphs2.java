package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class graphs2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.worldometers.info/coronavirus/country/india/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2100)");
	List<WebElement> wbRects = driver.findElements(By.xpath("(//*[local-name()='svg'])[4]//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"));	
	System.out.println("Total rects on the graph- "+wbRects.size());
	String toolTip = "//*[name()='svg']//*[local-name()='text' and @data-z-index='1']";
	Actions a = new Actions(driver);
	for (WebElement s:wbRects)   {
	if (!s.getDomAttribute("height").contains("0") || !s.getDomAttribute("height").contains("1"))   {   //many wbReacts WebElements do not have tooltip message, therefore filtered out on the basis of height attribute
	a.moveToElement(s).build().perform();
	Thread.sleep(500);
	String toolTipTxt = driver.findElement(By.xpath(toolTip)).getText();   //Somehow this xpath is not working but in actual its showing correctly. Logic in this code is correct
	System.out.println(toolTipTxt);
	}
	}   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.worldometers.info/coronavirus/country/india/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2100)");
	List<WebElement> wbRects = driver.findElements(By.xpath("(//*[local-name()='svg'])[4]//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"));	
	System.out.println("Total rects on the graph- "+wbRects.size());
	String toolTip = "//*[name()='svg']//*[local-name()='text' and @data-z-index='1']";
	Actions a = new Actions(driver);
	for (WebElement s:wbRects)   {
	if (!s.getDomAttribute("height").contains("0") || !s.getDomAttribute("height").contains("1"))   {   //many wbReacts WebElements do not have tooltip message, therefore filtered out on the basis of height attribute
	a.moveToElement(s).build().perform();
	Thread.sleep(500);
	String toolTipTxt = driver.findElement(By.xpath(toolTip)).getText();   //Somehow this xpath is not working but in actual its showing correctly. Logic in this code is correct
	System.out.println(toolTipTxt);
	}
	}
   
	}
}
