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

public class parentChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Links on Webpage - "+links.size());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000)");
	WebElement ftr = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	List<WebElement> ftrLinks = ftr.findElements(By.tagName("a"));
	System.out.println("Total Links on footer - "+ftrLinks.size());
	WebElement frstClm = ftr.findElement(By.xpath("(//table[@class='gf-t']/tbody/tr/td/ul)[1]"));
	List<WebElement> frstClmLnks = frstClm.findElements(By.tagName("a"));
	System.out.println("Links on footer first column - "+frstClmLnks.size());
	String prWin = driver.getWindowHandle();
	String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);
	for (int i=0;i<frstClmLnks.size();i++)   {
	frstClmLnks.get(i).sendKeys(keys);	
    Thread.sleep(1000);
	}
	Set<String> windows = driver.getWindowHandles();   //For Parent Window
	Iterator<String> it = windows.iterator();
	while (it.hasNext())   {
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
	Thread.sleep(1000);
	}
	driver.switchTo().window(prWin);   //Switching on Parent Window
	System.out.println("Parent Window - "+driver.getTitle());
	driver.quit();   */		
		
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> links =  driver.findElements(By.tagName("a"));
	System.out.println("Total links on the webpage: "+links.size());
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000)");
	WebElement ftr = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	List<WebElement> ftrLinks = ftr.findElements(By.tagName("a"));
	System.out.println("Total links on the footer: "+ftrLinks.size());
    WebElement frstClm = driver.findElement(By.xpath("(//table[@class='gf-t']/tbody/tr/td/ul)[1]"));
	List<WebElement> frstClmLinks = frstClm.findElements(By.tagName("a"));	
	System.out.println("Total links in first coloumn: "+frstClmLinks.size());
	String prWin = driver.getWindowHandle();
	String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);
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
	driver.switchTo().window(prWin);
	System.out.println("Parent window: "+driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
	
	}

}
