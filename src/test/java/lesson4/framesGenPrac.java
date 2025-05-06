package lesson4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framesGenPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://jqueryui.com/droppable/");
    framesDragDrop(driver);
    Thread.sleep(1000);
    driver.switchTo().defaultContent();
    String url = driver.findElement(By.xpath("//a[text()='Resizable']")).getDomProperty("href");
	System.out.println(url);
	driver.quit();
	
	}

	public static void framesDragDrop(WebDriver driver)   {
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	for (int i=0;i<frames.size();i++)   {
	driver.switchTo().frame(i);
	List<WebElement> drags = driver.findElements(By.id("draggable"));
	WebElement dropBx = driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	for (int j=0;j<drags.size();j++)   {
	a.dragAndDrop(drags.get(j), dropBx).build().perform();	
	}
	}
	
	}
}
