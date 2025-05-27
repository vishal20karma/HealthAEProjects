package singletonDesign;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDriverTest {
/*
private WebDriver driver;
@BeforeClass
@Parameters("browser")
public void setUp(String browser)   {
driver = WebDriverManager.getInstance(browser).getDriver();
//driver.manage().window().maximize();
}

@Test
public void testGoogle()   {
driver.get("https://www.google.co.in/");
System.out.println(Thread.currentThread().getName()+": "+driver.getTitle());
Assert.assertEquals(driver.getTitle(), "Google");
}

@AfterClass
public void tearDown()   {
WebDriverManager.quitDriver();
}   */

// For Practice
private WebDriver driver;	
	
@BeforeClass
@Parameters("browser")
public void setUp(String browser)   {
driver = WebDriverManager.getInstance(browser).getDriver();
driver.manage().window().maximize();
}

@Test
public void testGoogle()   {
driver.get("https://www.google.co.in/");
System.out.println(Thread.currentThread().getName()+": "+driver.getTitle());
Assert.assertEquals(driver.getTitle(), "Google");
}

@AfterClass
public void tearDown()   {
WebDriverManager.quitDriver();	
}

}