package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enabledDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));   //getAttribute has been deprecated, so better use getDomAttribute
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();   //Comment this line to show enabled or disabled
	if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))   {
	System.out.println("UI is enabled");	
	}
	else {
	System.out.println("UI is disabled");	
	}
	Thread.sleep(2000);
	driver.quit();   */
			
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))   {
	System.out.println("UI is enabled");
	System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
	}
	else {
	System.out.println("UI is disabled");	
	}
	Thread.sleep(2000);
	driver.quit();
	}

}
