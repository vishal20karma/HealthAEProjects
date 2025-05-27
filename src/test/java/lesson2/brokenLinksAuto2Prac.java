package lesson2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinksAuto2Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	ArrayList<String> urlList = new ArrayList<String>();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links - "+links.size());
	for (int i=0;i<links.size();i++)   {
	String url = links.get(i).getDomProperty("href");	
	urlList.add(url);
	}
	long stTime = System.currentTimeMillis();
//	urlList.parallelStream().forEach(s->brokenLinks(s));   //This works directly, give this logic in interview. Somehow in this java/selenium version have to put in try catch block	
	urlList.parallelStream().forEach(s->{
		try {
			brokenLinks(s);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	long endTime = System.currentTimeMillis();
	System.out.println("Total seconds - "+(endTime-stTime)/1000);
	driver.quit();
	
	}

	public static void brokenLinks(String urlList) throws MalformedURLException, IOException   {
	HttpURLConnection conn = (HttpURLConnection) new URL(urlList).openConnection();	
	conn.setRequestMethod("HEAD");
	conn.connect();
	int rspCd = conn.getResponseCode();
	if (rspCd>400)   {
	System.out.println(urlList+"--->"+rspCd+" - is a Broken link");	
	}
	else {
	System.out.println(urlList+"--->"+rspCd+" - is an Active link");		
	}
	}
}