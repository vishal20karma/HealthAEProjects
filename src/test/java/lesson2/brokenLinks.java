package lesson2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
//  How to test if any link is broken or not	
/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000)");
	String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getDomAttribute("href");
	System.out.println(url);
	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rspCd = conn.getResponseCode();
	if (rspCd>400)   {
	System.out.println("Link is broken");	
	}
	else   {
	System.out.println("Link is Active");	
	}
	driver.quit();   */
	
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000)");
	String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getDomAttribute("href");
	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rspCd = conn.getResponseCode();
	if (rspCd>400)   {
	System.out.println("Link is broken");	
	}
	else {
	System.out.println("Link is Active");	
	}
	driver.quit();
	}

}
