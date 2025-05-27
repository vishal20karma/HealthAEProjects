package misc2;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to handle or disable pops blocking	
/*	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));   //Array.asList() is mandate here, else code will not run
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(1000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(1000);
	driver.quit();
	
	}

}