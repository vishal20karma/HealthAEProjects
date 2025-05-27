package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fontsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.yatra.com/");
	WebElement wbFont = driver.findElement(By.xpath("//p[@title='Mumbai']"));
	String fSize = wbFont.getCssValue("font-size");
	String fWeight = wbFont.getCssValue("font-weight");
	String FHeight = wbFont.getCssValue("line-height");
	String expfSize="32px";
	String expfWeight="600";
	String expfFHeight="45px";
	Assert.assertEquals(fSize, expfSize);
	Assert.assertEquals(fWeight, expfWeight);
	Assert.assertEquals(FHeight, expfFHeight);
	driver.quit();   */
	
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.yatra.com/");
	WebElement wbFont = driver.findElement(By.xpath("//p[@title='Mumbai']"));
	String fSize = wbFont.getCssValue("font-size");
	String fWeight = wbFont.getCssValue("font-weight");
	String FHeight = wbFont.getCssValue("line-height");
	String expfSize="32px";
	String expfWeight="600";
	String expfFHeight="45px";
	Assert.assertEquals(fSize, expfSize);
	Assert.assertEquals(fWeight, expfWeight);
	Assert.assertEquals(FHeight, expfFHeight);
	driver.quit();
	
	}

}