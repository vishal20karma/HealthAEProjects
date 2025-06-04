package mvnFrameWorks;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import utilities.cartPg;
import utilities.excelUtil;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;
import utilities.retry;

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
 Object [][] exlTestData = excelUtil.readFromExcel(System.getProperty("user.dir")+"//src//main//java//dataStores//testData3.xlsx", "LoginDetails");	 
 return exlTestData;
 }

}
