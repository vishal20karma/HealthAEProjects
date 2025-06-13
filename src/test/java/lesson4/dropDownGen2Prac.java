package lesson4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownGen2Prac {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
//	WebElement country = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
//  Upper 'country' WebElement has been used just for multiple drop down reference. If multiple drop downs then same WebElement can be called they way currency has been called
	selectDropDown(currency, dropDnType.VISIBLE_TEXT, "AED");
	Thread.sleep(1000);
	selectDropDown(currency, dropDnType.INDEX, "3");
	Thread.sleep(1000);
	selectDropDown(currency, dropDnType.VALUE, "INR");
	Thread.sleep(1000);
	driver.quit();
		
	}
		
	public static void selectDropDown(WebElement dropDown, dropDnType type, String data)   {
	switch (type)   {
	case VISIBLE_TEXT : byVisibleText(dropDown, data);
	break;
	case INDEX : byIndex(dropDown, Integer.parseInt(data));
	break;
	case VALUE : byValue(dropDown, data);
	break;
	default : System.out.println("Enter the correct 'type'");
	}
	}

	public static void byVisibleText(WebElement dropDown, String visibleText)   {
	Select s = new Select(dropDown);
	s.selectByVisibleText(visibleText);
	}

	public static void byIndex(WebElement dropDown, int index)   {
	Select s = new Select(dropDown);
	s.selectByIndex(index);
	}
	    
	public static void byValue(WebElement dropDown, String value)   {
	Select s = new Select(dropDown);	
	s.selectByValue(value);
	}

}