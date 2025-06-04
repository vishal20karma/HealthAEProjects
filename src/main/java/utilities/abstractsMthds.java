package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractsMthds {

WebDriver driver;
public abstractsMthds(WebDriver driver)   {
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(css="button[routerlink*='cart']")
private WebElement cartPage;

@FindBy(css="button[routerlink*='myorders']")
private WebElement orderPage;

@FindBy(xpath="//i[@class='fa fa-sign-out']")
private WebElement logout;

public cartPg goToCartPage()   {
cartPage.click();
cartPg cpg = new cartPg(driver);
return cpg;
}

public orderPg goToOrderPage()   {
orderPage.click();
orderPg op = new orderPg(driver);
return op;
}

public void logout()   {
logout.click();	
}

public void explWaitVis(WebElement wbEl1)   {
WebDriverWait wt1 = new WebDriverWait(driver, Duration.ofSeconds(5));
wt1.until(ExpectedConditions.visibilityOf(wbEl1));
}

public void explWaitInv(WebElement wbEl2)   {
WebDriverWait wt2 = new WebDriverWait(driver, Duration.ofSeconds(5));
wt2.until(ExpectedConditions.invisibilityOf(wbEl2));
}

public void thread() throws InterruptedException   {
Thread.sleep(2000);	
}

public void windowScroll()   {
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0, 400)");
}

}
