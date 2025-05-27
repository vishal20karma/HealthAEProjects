package lesson6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class graphs5 {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub

//  xOffset/yOffset for Graphs	
/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.worldometers.info/coronavirus/country/india/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1400)");
	WebElement e = driver.findElement(By.xpath("(//*[name()='svg'])[2]//*[local-name()='g' "
			+ "and @class='highcharts-series highcharts-series-0 highcharts-line-series']"));
	int topLeftY = (e.getSize().getHeight()) - e.getSize().getHeight();
	int topLeftX = (e.getSize().getWidth())/2 - e.getSize().getWidth();
	Actions a = new Actions(driver);
	String strDate = "15-02-2020";
	String endDate = "12-04-2024";
	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
	Date d1 = sdf.parse(strDate);
	Date d2 = sdf.parse(endDate);
//	Date d3 = new Date();   //This will get the current date
	long daysDiff = TimeUnit.MILLISECONDS.toDays(d2.getTime()-d1.getTime());
	System.out.println("Total dates- "+daysDiff);
	for (int i=0;i<daysDiff;i++)   {
	a.moveToElement(e, topLeftX+i, topLeftY).build().perform();
	Thread.sleep(1000);
//  Below Xpath works sporadically, webportal seems unstable 
//	String txt = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @data-z-index='1']")).getText();
//	System.out.println(txt);
	}   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.worldometers.info/coronavirus/country/india/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1400)");	
	WebElement e = driver.findElement(By.xpath("(//*[name()='svg'])[2]//*[local-name()='g' "
			+ "and @class='highcharts-series highcharts-series-0 highcharts-line-series']"));
	int topLeftX = (e.getSize().getWidth()/2)-e.getSize().getWidth();
	int topLeftY = (e.getSize().getHeight()/2)-e.getSize().getHeight();
	Actions a = new Actions(driver);
	String strDt = "15-02-2020";
	String endDt = "12-04-2024";
	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
	Date d1 = sdf.parse(strDt);
	Date d2 = sdf.parse(endDt);
//	Date d3 = new Date();
	long dateDiff = TimeUnit.MILLISECONDS.toDays(d2.getTime()-d1.getTime());
	System.out.println("Total dates- "+dateDiff);
	for (int i=0;i<dateDiff;i++)   {
	a.moveToElement(e, topLeftX+i, topLeftY).build().perform();
	Thread.sleep(1000);
	String txt = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @data-z-index='1']")).getText();
	System.out.println(txt);
	System.out.println(i);
	}
	
	}
}