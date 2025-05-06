package lesson1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//  How to work with FlexBlox elements, how to disclose it and RedBus calendar UI, Holidays and Weekends	
//  Go to 'Event Listeners'	> Open Blur Option, delete/disable all the items, then inspect any WebElement then it will load all the Elements
	WebDriverManager.chromedriver().setup();
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--disable-notifications");   //How to disable notification pop-ups
	WebDriver driver = new ChromeDriver(c);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.redbus.in/");
	weekendDates(driver, "Jun 2026");
	Thread.sleep(1000);
	driver.quit();
	
	}

    public static void weekendDates(WebDriver driver, String dates) throws InterruptedException   {
	driver.findElement(By.cssSelector("div[class='labelCalendarContainer']")).click();
	WebElement wbDt = driver.findElement(By.cssSelector("div[style*='flex-grow: 2']"));
	while (!wbDt.getText().contains(dates))   {
	System.out.println(wbDt.getText());
	List<WebElement> hol = driver.findElements(By.cssSelector("div[class='holiday_count']"));
	if (hol.size()==0)   {   //This has been used to add 'No Holiday' specially for June month as this month do not have any holidays
    System.out.println("No Holiday");	
    }
	driver.findElement(By.cssSelector("div[class*='fxvMrr'] :nth-child(3) svg")).click();
	}
	System.out.println(wbDt.getText());   //Again printed as last iterated month's text cannot be printed in while loop because loop ends in the last months iteration
	Thread.sleep(2000);
	List<WebElement> hol = driver.findElements(By.cssSelector("div[class='holiday_count']"));
	if (hol.size()==0)   {   //Again used out of while loop as June month do not have any holidays, this block executes if only June month string passed
    System.out.println("No Holiday");	
    }
	Thread.sleep(2000);   //Always use 'wait' before getting the dates
	ArrayList<String> wkDateList = new ArrayList<String>();
	List<WebElement> dt = driver.findElements(By.cssSelector("span[class*='DayTiles__CalendarDaysSpan-sc-1xum02u-1']"));
	for (int i=0;i<dt.size();i++)   {
	if (dt.get(i).getDomAttribute("class").contains("fgdqFw")  
			|| dt.get(i).getDomAttribute("class").contains("bwoYtA"))   {
	String wDates = dt.get(i).getText();
	wkDateList.add(wDates);
	}
	}
	System.out.println(wkDateList);
    }
    
}
