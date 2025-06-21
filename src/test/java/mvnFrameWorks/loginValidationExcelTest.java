package mvnFrameWorks;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.cartPg;
import utilities.excelUtility;
import utilities.globalData;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;

 public class loginValidationExcelTest extends invokingBrowser{
 String prdName="ZARA COAT 3"; String loginMsg="Login Successfully";
  
 @Test (dataProvider="loginData")
 public void loginTest(String email, String password, String product, String country) throws IOException, InterruptedException   {
 lp.webLogin(email, password);
 Assert.assertEquals(loginMsg, lp.loginMsgValidation());
 Thread.sleep(2000);
 orderPg op = new orderPg(driver);
 op.logout();
 Thread.sleep(2000);
 }
 
 
 @Test (dataProvider="loginData")
 public void prdMatch(String email, String password, String product, String country) throws InterruptedException, IOException   {
 prdCatalogues pc = lp.webLogin(email, password);
 pc.addToCart(product);
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(product);
 Assert.assertTrue(productMatch);
 }
 
 @DataProvider
 public Object[][] loginData() throws IOException   {
 Properties prop = globalData.file(); 
 Object [][] exlTestData = 
    excelUtility.readFromExcel(System.getProperty("user.dir")
	   +prop.getProperty("excelpath"), prop.getProperty("sheet"));	 
 return exlTestData;
 }

}
