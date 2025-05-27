package mvnFrameWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.extentRep;

public class extentTesting extends extentRep{

ExtentReports extent;	
@BeforeTest
public void reporting()   {
extent = extentReports();	
}

@Test
public void demoExtent()   {
extent.createTest("demoExtent");
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/");
System.out.println(driver.getTitle());
driver.quit();
extent.flush();
}

}