package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staticDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement stDrpDn = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select s = new Select(stDrpDn);
	s.selectByIndex(3);
	System.out.println(s.getFirstSelectedOption().getText());   //How to get selected drop down
	Thread.sleep(1000);
	s.selectByValue("INR");
	System.out.println(s.getFirstSelectedOption().getText());
	s.selectByVisibleText("AED");
	System.out.println(s.getFirstSelectedOption().getText());
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("div#divpaxinfo")).click();
	Thread.sleep(1000);
	int i=0;
	while (i<4)   {
	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	
	i++;
	}
	driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	String st = driver.findElement(By.cssSelector("div#divpaxinfo")).getText();
	System.out.println(st);
	driver.close();   */
		
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement stDrpDn = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select s = new Select(stDrpDn);
	s.selectByIndex(3);
	System.out.println(s.getFirstSelectedOption().getText());
	Thread.sleep(1000);
	s.selectByValue("INR");
	System.out.println(s.getFirstSelectedOption().getText());
	Thread.sleep(1000);
	s.selectByVisibleText("AED");
	System.out.println(s.getFirstSelectedOption().getText());
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("div#divpaxinfo")).click();
	int i=0;
	while (i<4)   {
	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	i++;
	}
	driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
	String st = driver.findElement(By.cssSelector("div#divpaxinfo")).getText();
	System.out.println(st);
	driver.quit();
	
	}

}