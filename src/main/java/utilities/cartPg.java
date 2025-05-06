package utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPg extends abstractsMthds{

WebDriver driver;	
public cartPg(WebDriver driver)   {
super(driver);
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(css=".itemImg")
private List<WebElement> imageCounts;

@FindBy(css=".cartSection h3")
private List<WebElement> cartItems;

@FindBy(css=".totalRow button")
private WebElement checkOutButton;

public int imgSize()   {
return imageCounts.size();
}

public boolean verifyProduct(String prdName)   {
boolean productMatch = cartItems.stream().anyMatch(s->s.getText().equalsIgnoreCase(prdName));	
return productMatch;
}

public checkOutPg checkOutBt()   {
checkOutButton.click();
return new checkOutPg(driver);
}

}
