package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class connectionTimeOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How setup connection timeout on WebDriver
/*	WebDriverManager.chromedriver().timeout(10).setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.youtube.com/");
	driver.findElement(By.cssSelector("div.ytSearchboxComponentInputBox")).sendKeys("movies");
	driver.findElement(By.xpath("(//span[@class='yt-icon-shape style-scope yt-icon yt-spec-icon-shape'])[8]")).click();
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().timeout(10).setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.youtube.com/");
	driver.findElement(By.cssSelector("div.ytSearchboxComponentInputBox")).sendKeys("movies");
	driver.findElement(By.xpath("(//span[@class='yt-icon-shape style-scope yt-icon yt-spec-icon-shape'])[8]")).click();
	Thread.sleep(2000);
	driver.quit();	
	
	}

}
