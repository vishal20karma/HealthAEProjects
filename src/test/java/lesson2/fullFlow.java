package lesson2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fullFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*		WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Mumbai (BOM)']")).click();
	driver.findElement(By.xpath("(//div[@class='dropdownDiv'])[3] //a[text()=' Coimbatore (CJB)']")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
	WebElement rtUI = driver.findElement(By.id("Div1"));
	if (rtUI.getDomAttribute("style").contains("0.5"))   {
	System.out.println("UI is disabled");	
	}
	else {
	System.out.println("UI is enabled");
	}
	Assert.assertTrue(true);
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	int i=0;
	while (i<4)   {
	driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
	i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	WebElement drpDn = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
	Select s = new Select(drpDn);
    s.selectByValue("INR");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(2000);
    driver.quit();   */	
	
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Mumbai (BOM)']")).click();
	driver.findElement(By.xpath("(//div[@class='dropdownDiv'])[3] //a[text()=' Coimbatore (CJB)']")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
	WebElement rtUI = driver.findElement(By.id("Div1"));
	if (rtUI.getDomAttribute("style").contains("0.5"))   {
	System.out.println("UI is disabled");	
	}
	else {
	System.out.println("UI is enabled");
	}
	Assert.assertTrue(true);
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	int i=0;
	while (i<4)   {
	driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
	i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	WebElement drpDn = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
	Select s = new Select(drpDn);
    s.selectByValue("INR");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(2000);
    driver.quit();
	
	}

}