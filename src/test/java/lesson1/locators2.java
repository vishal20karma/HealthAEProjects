package lesson1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String txt = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();   //Parent Child traverse
	System.out.println(txt);
	String tagName = driver.findElement(By.xpath("//header/div/button[2]/parent::div")).getTagName();   //Child Parent traverse
	System.out.println(tagName);
	String ps = driver.findElement(By.xpath("//header/div/button[3]/preceding-sibling::button[2]")).getText();   //Preceding Sibling (If already traversed within siblings, then traversing previous siblings, if 1 index used then will traverse just above, if 2 index used then will traverse next to above)
	System.out.println(ps);   */
			
//  For Practice
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String txt = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
	System.out.println(txt);
	String tagName = driver.findElement(By.xpath("//header/div/button[2]/parent::div")).getTagName();
	System.out.println(tagName);
	String ps = driver.findElement(By.xpath("//header/div/button[3]/preceding-sibling::button[2]")).getText();
	System.out.println(ps);	
	
	}

}
