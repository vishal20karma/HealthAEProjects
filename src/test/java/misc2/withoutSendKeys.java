package misc2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('twotabsearchtextbox').value='adidas';");   //ById,ByName,ByClassName,ByTagName can be searched and Javascript only used CSS not Xpath
	Thread.sleep(2000);
	driver.quit();   */
		
//  For Practice
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('twotabsearchtextbox').value='adidas';");
	Thread.sleep(2000);
	driver.quit();
	
	}

}
