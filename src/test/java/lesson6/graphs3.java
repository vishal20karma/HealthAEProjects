package lesson6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class graphs3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.statista.com/statistics/1104054/india-coronavirus-covid-19-daily-confirmed-recovered-death-cases/");
	driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 250)");
	List<WebElement> bars = driver.findElements(By.xpath("(//*[local-name()='svg'])[214]//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']"));
	System.out.println("Total bars in the graph- "+bars.size());
	Actions a = new Actions(driver);
	for (WebElement s:bars)   {
	if (!s.getDomAttribute("height").contains("0")
			|| !s.getDomAttribute("height").contains("1") 
			       || !s.getDomAttribute("height").contains("2"))   {
	a.moveToElement(s).build().perform();
	Thread.sleep(1000);
	String txt = driver.findElement(By.xpath("//table[@class='tooltip']/tbody/tr[1]/td[1]/span")).getText();
	System.out.println(txt);
	}
	}
	
	}

}
