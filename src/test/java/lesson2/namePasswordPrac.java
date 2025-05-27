package lesson2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class namePasswordPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	String url = "https://rahulshettyacademy.com/locatorspractice/";
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String name = getName(driver, url);
	String password = getPassword(driver, url);
	driver.get(url);
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys(password);
    driver.findElement(By.cssSelector(".submit.signInBtn")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
    Thread.sleep(2000);
    driver.quit();
    
	}

	public static String getName(WebDriver driver, String url)   {
	driver.get(url);
	String hName = driver.findElement(By.xpath("(//h1)[3]")).getText();	
	String [] hdrName = hName.split(" ");
	String name = hdrName[0].trim();
	return name;
	
	}

    public static String getPassword(WebDriver driver, String url) throws InterruptedException   {
    driver.get(url);
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@123.com");
    driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("123456789");
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    String infoMsg = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
    String [] splInfo = infoMsg.split("'");
    String password = splInfo[1].trim();
    return password;
    
    }

}