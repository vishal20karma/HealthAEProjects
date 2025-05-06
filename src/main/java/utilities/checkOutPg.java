package utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPg extends abstractsMthds{

WebDriver driver;
public checkOutPg(WebDriver driver)   {
super(driver);
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(css="input[placeholder='Select Country']")
private WebElement countryDropDn;

@FindBy(css=".action__submit")
private WebElement submit;

@FindBy(xpath="//button[contains(@class, 'ta-item')]")
private List<WebElement> cntCount;

@FindBy(xpath="(//button[contains(@class, 'ta-item')])[1]")
private WebElement cntText1;

@FindBy(xpath="(//button[contains(@class, 'ta-item')])[2]")
private WebElement cntText2;

public void selectCountry(String countryName) throws InterruptedException   {
Actions a = new Actions(driver);	
a.moveToElement(countryDropDn).click().sendKeys(countryName).build().perform();
if (cntCount.size()==2)   {
explWaitVis(cntText2);	
cntText2.click();
}
else {
cntText1.click();	
}
thread();
windowScroll();
}

public confirmPg placeOrder()   {
submit.click();	
return new confirmPg(driver);
}

}
