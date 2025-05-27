package lesson2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class futureDates1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.findElement(By.cssSelector("input[id='datepicker']")).click();
	WebElement mm = driver.findElement(By.cssSelector("span[class='ui-datepicker-month']"));
	System.out.println(mm.getText());
	WebElement yy = driver.findElement(By.cssSelector("span[class='ui-datepicker-year']"));
	System.out.println(yy.getText());
	while (!(driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("June")
	&& driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText().contains("2026")))   {
	driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();	
	}
	List<WebElement> dates = driver.findElements(By.cssSelector("a[class='ui-state-default']"));
	for (int i=0;i<dates.size();i++)   {
	String dTxt = dates.get(i).getText();	
	if (dTxt.equals("1"))   {
	dates.get(i).click();	
	}
	}
	Thread.sleep(2000);
	driver.quit();   */	
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.findElement(By.cssSelector("input[id='datepicker']")).click();
	WebElement mm = driver.findElement(By.cssSelector("span[class='ui-datepicker-month']"));
	System.out.println(mm.getText());
	WebElement yy = driver.findElement(By.cssSelector("span[class='ui-datepicker-year']"));
	System.out.println(yy.getText());
	while (!(driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("June")
	&& driver.findElement(By.cssSelector("span[class='ui-datepicker-year']")).getText().contains("2026")))   {
	driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();	
	}
	List<WebElement> dates = driver.findElements(By.cssSelector("a[class='ui-state-default']"));
	for (int i=0;i<dates.size();i++)   {
	String dTxt = dates.get(i).getText();	
	if (dTxt.equals("1"))   {
	dates.get(i).click();	
	}
	}
	Thread.sleep(2000);
	driver.quit();
	
	}

}