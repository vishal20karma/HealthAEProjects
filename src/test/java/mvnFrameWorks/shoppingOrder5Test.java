package mvnFrameWorks;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.excelUtil;
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
 Object [][] exlTestData = excelUtil.readFromExcel(System.getProperty("user.dir")+"//src//main//java//dataStores//testData3.xlsx", "LoginDetails");	 
 return exlTestData;
 }

}