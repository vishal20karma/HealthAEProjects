package lesson4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownGen2 extends drpDnBs{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	By currency = By.id("ctl00_mainContent_DropDownListCurrency");
	dropDown(currency, vt(), "AED");   //drpDnBs.vt() can also be used, but using it directly
	Thread.sleep(1000);
	dropDown(currency, ind(), "3");
	Thread.sleep(1000);
	dropDown(currency, vl(), "INR");
	Thread.sleep(1000);
	driver.quit();
	
	}
	
	public static void dropDown(By locator, String type, String value)   {
	switch (type)   {
	case "visibleText" : ByVisibleText(locator, value);
	break;
	case "index" : ByIndex(locator, Integer.parseInt(value));
	break;
	case "value" : ByValue(locator, value);
	break;
	default: System.out.println("Enter the correct 'Type'");
	}
	}

	public static WebElement getWebElement(By locator)   {
	return driver.findElement(locator);
	}

    public static void ByVisibleText(By locator, String text)   {
    Select s = new Select(getWebElement(locator));	
    s.selectByVisibleText(text);
    }

    public static void ByIndex(By locator, int index)   {
    Select s = new Select(getWebElement(locator));
    s.selectByIndex(index);
    }

    public static void ByValue(By locator, String value)   {
    Select s = new Select(getWebElement(locator));	
    s.selectByValue(value);
    }
}