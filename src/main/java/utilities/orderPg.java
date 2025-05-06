package utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPg extends abstractsMthds{

WebDriver driver;	
public orderPg (WebDriver driver)   {
super(driver);
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(css="tr td:nth-child(3)")
private List<WebElement> orders;

public boolean verifyOrdersList(String prdName)   {
boolean orderMatch = orders.stream().anyMatch(s->s.getText().equalsIgnoreCase(prdName));
return orderMatch;
}

}
