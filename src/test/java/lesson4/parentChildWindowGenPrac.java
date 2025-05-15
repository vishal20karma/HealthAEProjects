package lesson4;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class parentChildWindowGenPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
	String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);
	clickLinks(driver, keys);
	Thread.sleep(2000);
	driver.quit();
	
	}

	public static void clickLinks(WebDriver driver, String keys) throws InterruptedException   {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000)");
	WebElement frstClm = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td/ul[1]"));
	List<WebElement> frstClmLinks = frstClm.findElements(By.tagName("a"));
	for (int i=0;i<frstClmLinks.size();i++)   {
	frstClmLinks.get(i).sendKeys(keys);
	Thread.sleep(1000);
	}
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	while (it.hasNext())   {
	driver.switchTo().window(it.next());	
	System.out.println(driver.getTitle());
	Thread.sleep(1000);
	}
	}

}
