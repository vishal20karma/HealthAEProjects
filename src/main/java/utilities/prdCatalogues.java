package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prdCatalogues extends abstractsMthds {

WebDriver driver;
public prdCatalogues(WebDriver driver)   {
super(driver);
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(css=".mb-3")
private List<WebElement> products;

private By prdTag = By.cssSelector("b");

@FindBy(css=".mb-3")
private WebElement prds;

private By add2Cart = By.cssSelector(".card-body button:last-of-type");

@FindBy(css=".ng-animating")
private WebElement spinner;

@FindBy(css="div#toast-container")
private WebElement prdAddTxt;

public List<WebElement> getProductList()   {
explWaitVis(prds);
return products;
}

public WebElement getProductName(String prdName)   {
WebElement item = getProductList().stream().filter(s->s.findElement(prdTag).getText()
		                 .equalsIgnoreCase(prdName)).findFirst().orElse(null);
return item;
}

public void addToCart(String prdName)   {
WebElement item = getProductName(prdName);
item.findElement(add2Cart).click();
}

public void waitAfterAddToCart()   {
explWaitVis(spinner);
explWaitInv(prdAddTxt);
}

}
