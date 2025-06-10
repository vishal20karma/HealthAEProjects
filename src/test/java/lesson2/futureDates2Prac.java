package lesson2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class futureDates2Prac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    monthYearDate(driver, "June", "2026", "1");		
	Thread.sleep(2000);
	driver.quit();
	
	}

    public static void monthYearDate(WebDriver driver, String month, String year, String date)   {
    driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
    driver.findElement(By.cssSelector("input[id='datepicker']")).click();
    while (!(driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains(month)
    && driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText().contains(year)))   {
    driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();	
    }
    List<WebElement> dates = driver.findElements(By.cssSelector("a[class='ui-state-default']"));
    for (int i=0;i<dates.size();i++)   {
    String dTxt = dates.get(i).getText();	
    if (dTxt.equals(date))   {
    dates.get(i).click();	
    }
    }
    }
}
