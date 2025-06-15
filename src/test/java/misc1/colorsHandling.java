package misc1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class colorsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to get color of any WebElement and convert to Hex value	
/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.yatra.com/");
	WebElement wbColor = driver.findElement(By.xpath("//h4[text()='One Way']"));
	String ftColor = wbColor.getCssValue("color");
	System.out.println("Font color: "+ftColor);
	String ftColorHx = Color.fromString(ftColor).asHex();
	System.out.println("Font Hex Color Value: "+ftColorHx);
	Assert.assertEquals("#d60f0f", ftColorHx);
		
	System.out.println("***********************************");
		
//  Border color identification
	String brdColor = wbColor.getCssValue("border-color");
	System.out.println("Border color: "+brdColor);
	String brdColorHx = Color.fromString(brdColor).asHex();
	System.out.println("Border Hex Color Value: "+brdColorHx);
	Assert.assertEquals("#d60f0f", brdColorHx);
		
	System.out.println("***********************************");
	WebElement bgColor = driver.findElement(By.xpath("//button[@id='simple-tab-0']"));
	String bgColorVl = bgColor.getCssValue("background-color");
	System.out.println("Background color value: "+bgColorVl);
	String bgColorHx = Color.fromString(bgColorVl).asHex();
	System.out.println("Backgroun Hex Color Value: "+bgColorHx);
	Assert.assertEquals("#ffe7e3", bgColorHx);   */
		
//  For Practice
//	How to get color of any WebElement and convert to Hex value	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.yatra.com/");
	WebElement wbColor = driver.findElement(By.xpath("//h4[text()='One Way']"));
	String ftColor = wbColor.getCssValue("color");
	System.out.println("Font color: "+ftColor);
	String ftColorHx = Color.fromString(ftColor).asHex();
	System.out.println("Font Hex Color Value: "+ftColorHx);
	Assert.assertEquals("#d60f0f", ftColorHx);
	
	System.out.println("***********************************");
		
//  Border color identification
	String brdColor = wbColor.getCssValue("border-color");
	System.out.println("Border color: "+brdColor);
	String brdColorHx = Color.fromString(brdColor).asHex();
	System.out.println("Border Hex Color Value: "+brdColorHx);
	Assert.assertEquals("#d60f0f", brdColorHx);
		
	System.out.println("***********************************");
	WebElement bgColor = driver.findElement(By.xpath("//button[@id='simple-tab-0']"));
	String bgColorVl = bgColor.getCssValue("background-color");
	System.out.println("Background color value: "+bgColorVl);
	String bgColorHx = Color.fromString(bgColorVl).asHex();
	System.out.println("Backgroun Hex Color Value: "+bgColorHx);
	Assert.assertEquals("#ffe7e3", bgColorHx);
	
	driver.quit();
	
	}
}