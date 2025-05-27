package misc2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement wb = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
	File src = wb.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File ("E:\\Screenshots\\3.png"));
	Thread.sleep(1000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement wb = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
	File src = wb.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File ("E:\\Screenshots\\3.png"));
	Thread.sleep(1000);
	driver.quit();
	
	}

}