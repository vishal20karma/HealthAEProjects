package mvnFrameWorks;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;

public class shoppingOrder2Test extends invokingBrowser{
 //   String prdName="IPHONE 13 PRO"; String countryName="India"; 
 String confirmationMsg="Thankyou for the order.";
 @Test (dataProvider="getData")
 public void productShoppings(String email, String password, String prdName, String country) throws InterruptedException   {
 prdCatalogues pc = lp.webLogin(email, password);
 pc.addToCart(prdName);
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(prdName);
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
 public Object[][] getData()   {
 Object [][] data = new Object[2][4];
 data[0][0]="vishal.vishwakarma20@gmail.com";
 data[0][1]="@Jas10sum";
 data[0][2]="ZARA COAT 3";
 data[0][3]="India";
 
 data[1][0]="shetty@gmail.com";
 data[1][1]="Iamking@000";
 data[1][2]="ADIDAS ORIGINAL";
 data[1][3]="Afghanistan";
 return data;
 
 }
 
}
