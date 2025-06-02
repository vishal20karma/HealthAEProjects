package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage extends abstractsMthds{

WebDriver driver;
public landingPage(WebDriver driver)   {
super(driver);
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(id="userEmail")
private WebElement userId;

@FindBy(id="userPassword")
private WebElement password;

@FindBy(id="login")
private WebElement submit;

@FindBy(css="div[class*='flyInOut']")
private WebElement loginMsg;

public prdCatalogues webLogin(String email, String passcode)   {
userId.sendKeys(email);
password.sendKeys(passcode);
submit.click();
prdCatalogues pc = new prdCatalogues(driver);
return pc;
}
	
public void goTo()   {
driver.get("https://rahulshettyacademy.com/client");	
}

public String loginMsgValidation()   {
explWaitVis(loginMsg);
return loginMsg.getText();
}

}
