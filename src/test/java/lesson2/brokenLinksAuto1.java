package lesson2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinksAuto1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000)");
	long stTime = System.currentTimeMillis();
	brokenLinks(driver);
	long endTime = System.currentTimeMillis();
	System.out.println("Total seconds - "+(endTime-stTime)/1000);
	driver.quit();
		
	}
		
	public static void brokenLinks(WebDriver driver) throws MalformedURLException, IOException   {
	List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	for (int i=0;i<links.size();i++)   {
	String url = links.get(i).getDomProperty("href");
	HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rspCd = conn.getResponseCode();
	if (rspCd>400)   {
	System.out.println(url+"--->"+rspCd+" - is a Broken link");	
	}
	else {
	System.out.println(url+"--->"+rspCd+" - is an Active link");	
	}
	}
		
	}

}
