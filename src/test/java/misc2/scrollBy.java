package misc2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*  WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0, 600)");   //Webpage Scroll
	Thread.sleep(2000);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600)");
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	Thread.sleep(2000);
	driver.quit();
	
	}

}