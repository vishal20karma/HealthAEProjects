package lesson1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	List<WebElement> bxs = driver.findElements(By.cssSelector("input[id*='ctl00_mainContent_chk_']"));
	Assert.assertEquals(6, bxs.size());
	WebElement chkBx = driver.findElement(By.cssSelector("input[id*='IndArm']"));
	System.out.println(chkBx.isSelected());
	chkBx.click();
	System.out.println(chkBx.isSelected());
	Thread.sleep(2000);
	driver.quit();   */
			
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	List<WebElement> bxs = driver.findElements(By.cssSelector("input[id*='ctl00_mainContent_chk_']"));
	Assert.assertEquals(6, bxs.size());
	WebElement chkBx = driver.findElement(By.cssSelector("input[id*='IndArm']"));
	System.out.println(chkBx.isSelected());
	chkBx.click();
	System.out.println(chkBx.isSelected());
	Thread.sleep(2000);
	driver.quit();
		
	}

}