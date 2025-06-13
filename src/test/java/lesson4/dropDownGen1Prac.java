package lesson4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownGen1Prac {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//  This is for only one drop down automation, WebElement variable directly passed into all the methods
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
    dropDown(currency, "visibleText", "AED");
    Thread.sleep(1000);
    dropDown(currency, "index", "3");
    Thread.sleep(1000);
    dropDown(currency, "value", "INR");
    Thread.sleep(1000);
    driver.quit();
    
	}
	
	public static void dropDown(WebElement currency, String type, String data)   {
	switch (type)   {
	case "visibleText" : byVisibleText(currency, data);
	break;
	case "index" : byIndex(currency, Integer.parseInt(data));
	break;
	case "value" : byValue(currency, data);
	break;
	default : System.out.println("Enter the correct 'type'");
	}
	}

	public static void byVisibleText(WebElement currency, String visibleText)   {
	Select s = new Select(currency);	
	s.selectByVisibleText(visibleText);
	}
	
	public static void byIndex(WebElement currency, int index)   {
	Select s = new Select(currency);	
	s.selectByIndex(index);
	}

    public static void byValue(WebElement currency, String value)   {
    Select s = new Select(currency);
    s.selectByValue(value);
    }
}