package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirmPg extends abstractsMthds{

WebDriver driver;
public confirmPg (WebDriver driver)   {
super(driver);
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(css=".hero-primary")
private WebElement cnfMsg;

public String verifyConfirmMessage()   {
return cnfMsg.getText();	
}

}
