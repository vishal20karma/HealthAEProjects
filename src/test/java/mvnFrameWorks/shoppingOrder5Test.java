package mvnFrameWorks;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.excelUtility;
import utilities.globalData;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;

public class shoppingOrder5Test extends invokingBrowser{
//   String prdName="ZARA COAT 3"; String countryName="India"; 
 String confirmationMsg="Thankyou for the order.";
 @Test (dataProvider="loginData")
 public void productShoppings(String email, String password, String product, String country) throws InterruptedException   {
 prdCatalogues pc = lp.webLogin(email, password);
 pc.addToCart(product);
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(product);
 Assert.assertTrue(productMatch);
 pc.thread();
 pc.windowScroll();
 checkOutPg cop = cpg.checkOutBt();
 cop.selectCountry(country);
 confirmPg cnf = cop.placeOrder();
 String confirmTxt = cnf.verifyConfirmMessage();
 Assert.assertTrue(confirmTxt.equalsIgnoreCase(confirmationMsg));
 }

 @Test (dependsOnMethods= {"productShoppings"})
 public void verifyOrderHistory()   {
 prdCatalogues pc = lp.webLogin("vishal.vishwakarma20@gmail.com", "@Jas10sum");
 orderPg op = pc.goToOrderPage();
 Assert.assertTrue(op.verifyOrdersList("ZARA COAT 3"));
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