package lesson2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softHardAssertions {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	SoftAssert s = new SoftAssert();
	List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	for (WebElement ftrLinks:links)   {
	String urlLinks = ftrLinks.getDomProperty("href");
	HttpURLConnection conn = (HttpURLConnection) new URL(urlLinks).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rspCd = conn.getResponseCode();
	System.out.println(urlLinks+"--->"+rspCd);
	s.assertTrue(rspCd<400, "The Link with the Text: "+urlLinks+": is broken with code: "+rspCd);
	}
	driver.quit();
	s.assertAll();   */   //assertAll() should be used in the last, else driver.quit() does not work and will not close the browser

//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	SoftAssert s = new SoftAssert();
	List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	for (WebElement ftrLinks:links)   {
	String urlLinks = ftrLinks.getDomProperty("href");
	HttpURLConnection conn = (HttpURLConnection) new URL(urlLinks).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rspCd = conn.getResponseCode();
	System.out.println(urlLinks+"--->"+rspCd);
	s.assertTrue(rspCd<400, "The Link with the Text: "+urlLinks+": is a broken with code: "+rspCd);
	}
	driver.quit();
	s.assertAll();
	
	}

}
