package misc2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowRoot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://books-pwakit.appspot.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement srchBx = (WebElement) js.executeScript("return document.querySelector('book-app').shadowRoot.querySelector('app-header>app-toolbar.toolbar-bottom>book-input-decorator>input')");
//  String sk = "arguments[0].setAttribute('value','Harry Potter')";
//  js.executeScript(sk, srchBx);
	srchBx.sendKeys("Harry Potter");   //This works, but always show upper commented codes during interview
	Thread.sleep(2000);
	driver.quit();   */
	
//  For Practice
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://books-pwakit.appspot.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement srchBx = (WebElement) js.executeScript("return document.querySelector('book-app').shadowRoot.querySelector('app-header>app-toolbar.toolbar-bottom>book-input-decorator>input')");
//	String sk = "arguments[0].setAttribute('value','Harry Potter')";
//	js.executeScript(sk, srchBx);
	srchBx.sendKeys("Harry Potter");
	Thread.sleep(2000);
	driver.quit();
	
	}

}