package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataVariableLogin {
 
/*
 @Test (dataProvider="getData")   //Below getData can be in separate class and by Extends keywords it can inherited here. Code '(dataProvider="getData")' remains the same to call
 public void login(String userName, String password) throws InterruptedException   {
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://rahulshettyacademy.com/locatorspractice/");
 driver.findElement(By.id("inputUsername")).sendKeys(userName);
 driver.findElement(By.name("inputPassword")).sendKeys(password);
 driver.findElement(By.cssSelector(".submit.signInBtn")).click();
 Thread.sleep(2000);
 driver.quit();
 
 }

 @DataProvider
 public Object[][] getData()   {
 Object [][] data = new Object[4][2];
 data[0][0]="vishal@karma";
 data[0][1]="Vkarma";
 
 data[1][0]="ankit@sharma";
 data[1][1]="Asharma";
 
 data[2][0]="deepika@verma";
 data[2][1]="DVerma";
 
 data[3][0]="jyti@kumari";
 data[3][1]="Jkumari";
 
 return data;
 }   */
	
// For Practice
	
 @Test (dataProvider="getData")
 public void login(String userName, String password) throws InterruptedException   {
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 driver.get("https://rahulshettyacademy.com/locatorspractice/");
 driver.findElement(By.id("inputUsername")).sendKeys(userName);
 driver.findElement(By.name("inputPassword")).sendKeys(password);
 driver.findElement(By.cssSelector(".submit.signInBtn")).click();
 Thread.sleep(2000);
 driver.quit();
 
 }
 
 @DataProvider
 public Object[][] getData()   {
 Object [][] data = new Object [4][2];
 data[0][0]="vishal@karma";
 data[0][1]="Vkarma";
 
 data[1][0]="ankit@sharma";
 data[1][1]="Asharma";
		 
 data[2][0]="deepika@verma";
 data[2][1]="Dverma";
	 
 data[3][0]="jyoti@kumari";
 data[3][1]="Jkumari";
 
 return data;
 }
 
}
