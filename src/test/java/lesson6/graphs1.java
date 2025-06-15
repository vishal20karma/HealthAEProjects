package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class graphs1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://emicalculator.net/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1250)");
    List<WebElement> bars = driver.findElements(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group'])[2]//*[name()='rect']"));
	String toolTips = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
    System.out.println("Total bars on the graph- "+bars.size());
    Actions a = new Actions(driver);
    for (WebElement s:bars)   {
	a.moveToElement(s).build().perform();
	Thread.sleep(500);
	String toolTipTxt = driver.findElement(By.xpath(toolTips)).getText();
    System.out.println(toolTipTxt);
    }
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://emicalculator.net/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1250)");
	List<WebElement> bars = driver.findElements(By.xpath("(//*[local-name()='svg'] //*[name()='g' and @class='highcharts-series-group'])[2] //*[name()='rect']"));
	String toolTips = "//*[local-name()='svg'] //*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined'] //*[name()='text']";
	Actions a = new Actions(driver);
	for (WebElement s:bars)   {
	a.moveToElement(s).build().perform();	
	Thread.sleep(500);
	String toolTipTxt = driver.findElement(By.xpath(toolTips)).getText();
	System.out.println(toolTipTxt);
	}
	driver.quit();
	}

}
