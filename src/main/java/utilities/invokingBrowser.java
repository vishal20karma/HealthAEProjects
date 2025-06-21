package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invokingBrowser {
/*
public WebDriver driver;
public landingPage lp;
public WebDriver browserKickOff() throws IOException   {
Properties prop = globalData.file();
String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
//prop.getProperty("browser");
if (browserName.equalsIgnoreCase("chrome"))   {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
}
else if (browserName.equalsIgnoreCase("firefox"))   {
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
}
else {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
driver.manage().window().maximize();
}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return driver;
}   */
	
// For Practice
public WebDriver driver;
public landingPage lp;
public WebDriver browserKickOff() throws IOException   {
Properties prop = globalData.file();
String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
//String browserName = prop.getProperty("browser");
if (browserName.equalsIgnoreCase("chrome"))   {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
}
else if (browserName.equalsIgnoreCase("firefox"))   {
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
}
else {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
driver.manage().window().maximize();
}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
return driver;
}

/*
@BeforeMethod
public landingPage launchBrowser() throws IOException   {
driver = browserKickOff();
lp = new landingPage(driver);
lp.goTo();
return lp;
}   */

// For Practice
@BeforeMethod
public landingPage launchBrowser() throws IOException   {
driver = browserKickOff();	
lp = new landingPage(driver);
lp.goTo();
return lp;

}

/*
@AfterMethod
public void quitDriver()   {
driver.quit();	
}   */

@AfterMethod
public void quitDriver()   {
driver.quit();	
}

public String getScreenshot(String testCaseName, WebDriver driver) throws IOException   {
TakesScreenshot ts = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File file = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
FileUtils.copyFile(src, file);
return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
}

}
