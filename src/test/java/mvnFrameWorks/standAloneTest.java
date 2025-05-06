package mvnFrameWorks;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standAloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    String prdName="IPHONE 13 PRO";
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://rahulshettyacademy.com/client");
	driver.findElement(By.id("userEmail")).sendKeys("vishal.vishwakarma20@gmail.com");
	driver.findElement(By.id("userPassword")).sendKeys("@Jas10sum");
	driver.findElement(By.id("login")).click();
	List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	WebElement item = products.stream().filter(s->s.findElement(By.cssSelector("b"))
			.getText().equals(prdName)).findFirst().orElse(null);
	item.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
	WebElement spinner = driver.findElement(By.cssSelector(".ng-animating"));
	WebElement prdAdd = driver.findElement(By.cssSelector("div#toast-container"));
	wt.until(ExpectedConditions.invisibilityOf(spinner));
	wt.until(ExpectedConditions.visibilityOf(prdAdd));
	driver.findElement(By.cssSelector("button[routerlink*='cart']")).click();
	List<WebElement> cartItems = driver.findElements(By.cssSelector(".cartSection h3"));
	boolean itemMatch = cartItems.stream().anyMatch(s->s.getText().equalsIgnoreCase(prdName));
	Assert.assertTrue(itemMatch);
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 400)");
	driver.findElement(By.cssSelector(".totalRow button")).click();
	WebElement countryDropDn = driver.findElement(By.cssSelector("input[placeholder='Select Country']"));
	Actions a = new Actions(driver);
	a.moveToElement(countryDropDn).click().sendKeys("India").build().perform();
	WebElement cntText = driver.findElement(By.xpath("(//button[contains(@class, 'ta-item')])[2]"));
	wt.until(ExpectedConditions.visibilityOf(cntText));
	cntText.click();
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0, 400)");
	driver.findElement(By.cssSelector(".action__submit")).click();
	String cnfMsg = driver.findElement(By.cssSelector(".hero-primary")).getText();
	Assert.assertTrue(cnfMsg.equalsIgnoreCase("Thankyou for the order."));
	driver.quit();
	
	}

}
