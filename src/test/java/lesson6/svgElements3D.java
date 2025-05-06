package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class svgElements3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.petercollingridge.co.uk/blog/3d-svg/3d-animation-svg/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 100)");
	while (true)   {
	List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"
	+ "//*[local-name()='g' and @id='triangles']//*[local-name()='path' and contains(@id, 'triangle')]"));
	for (WebElement e:svgElements)   {
	String value = e.getDomAttribute("d");	
	System.out.println(value);
	}
	}   */
		
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.petercollingridge.co.uk/blog/3d-svg/3d-animation-svg/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 100)");
	String xpath = "//*[local-name()='svg']//*[name()='g' and @id='triangles']//*[name()='path' and contains(@id, 'triangle')]";
	while (true)   {
	List<WebElement> svgElements = driver.findElements(By.xpath(xpath));
	for (WebElement e:svgElements)   {
	String value = e.getDomAttribute("d");	
	System.out.println(value);
	}
	}
	
	}

}
