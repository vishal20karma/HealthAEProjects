package mvnFrameWorks;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import utilities.cartPg;
import utilities.excelUtil;
import utilities.invokingBrowser;
import utilities.prdCatalogues;
import utilities.retry;

 public class loginValidationExcelTest extends invokingBrowser{
 String prdName="IPHONE 13 PRO"; String loginMsg="Login Successfully";
  
 @Test
 public void loginTest() throws IOException, InterruptedException   {
 Object [][] exlTestData = excelUtil.readFromExcel(System.getProperty("user.dir")+"//src//main//java//dataStores//testData3.xlsx", "LoginDetails");	 
 for (int i=0;i<exlTestData.length;i++)   {
 lp.webLogin(exlTestData[i][0].toString(), exlTestData[i][1].toString());
 Assert.assertEquals(loginMsg, lp.loginMsgValidation());
 Thread.sleep(2000);
 driver.findElement(By.xpath("//i[@class='fa fa-sign-out']")).click();
 Thread.sleep(2000);
 }
 
 
 
// @Test
// public void prdMatch() throws InterruptedException, IOException   {
// Object [][] exlTestData = excelUtil.readFromExcel(System.getProperty("user.dir")+"//src//main//java//dataStores//testData3.xlsx", "LoginDetails");	 	 
// prdCatalogues pc = lp.webLogin(exlTestData[0][0].toString(), exlTestData[0][1].toString());
// pc.addToCart(exlTestData[0][2].toString());
// pc.waitAfterAddToCart();
// cartPg cpg = pc.goToCartPage();
// boolean productMatch = cpg.verifyProduct(exlTestData[0][2].toString());
// Assert.assertTrue(productMatch);
 }

}
