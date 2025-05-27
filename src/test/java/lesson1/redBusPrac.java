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

public class redBusPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

    WebDriverManager.chromedriver().setup();
    ChromeOptions c = new ChromeOptions();
    c.addArguments("--disable-notifications");
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
	if (hol.size()==0)   {
	System.out.println("No Holiday");	
	}
	driver.findElement(By.cssSelector("div[class*='fxvMrr'] div:nth-child(3) svg")).click();	
	}
	System.out.println(wbDt.getText());
	Thread.sleep(2000);
	List<WebElement> hol = driver.findElements(By.cssSelector("div[class='holiday_count']"));
	if (hol.size()==0)   {
	System.out.println("No Holiday");	
	}
	Thread.sleep(2000);
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