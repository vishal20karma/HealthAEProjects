package misc1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	driver.findElement(By.xpath("//div[@id='start']/button")).click();
	boolean b = fWait(driver).isDisplayed();
	System.out.println(b);
	Thread.sleep(1000);
	driver.quit();
	
	}

    public static WebElement fWait(WebDriver driver)   {
    Wait<WebDriver> wt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
    			.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
    WebElement wb = driver.findElement(By.xpath("//div[@id='finish']/h4"));
    return wt.until(ExpectedConditions.visibilityOf(wb));   */
    		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	driver.findElement(By.xpath("//div[@id='start']/button")).click();
	boolean b = fWait(driver).isDisplayed();
	System.out.println(b);
	Thread.sleep(1000);
	driver.quit();
	}
	
	public static WebElement fWait(WebDriver driver)   {
	Wait<WebDriver> wt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
			.pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
	WebElement wb = driver.findElement(By.xpath("//div[@id='finish']/h4"));
	return wt.until(ExpectedConditions.visibilityOf(wb));
	
	}
}

