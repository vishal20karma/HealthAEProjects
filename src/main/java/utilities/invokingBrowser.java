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
public WebDriver driver;
public landingPage lp;

public WebDriver browserKickOff() throws IOException   {
Properties prop = new Properties();	
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//dataStores//globalKeys.properties");
prop.load(fis);
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
}

@BeforeMethod
public landingPage launchBrowser() throws IOException   {
driver = browserKickOff();
lp = new landingPage(driver);
lp.goTo();
return lp;
}

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

//StandarCharsets encoding used because 'readFileToString' has been depreciated 
//Json to String - Jackson Databind dependencies jars
public List<HashMap<String, String>> getJsonData(String filepath) throws IOException   {
String jsonData = FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
ObjectMapper mapper = new ObjectMapper();
List<HashMap<String, String>> data = 
    mapper.readValue(jsonData, new TypeReference<List<HashMap<String, String>>>(){});
return data;
}



}
