package mvnFrameWorks;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;

public class shoppingOrder3Test extends invokingBrowser{
 //   String prdName="IPHONE 13 PRO"; String countryName="India"; 
 String confirmationMsg="Thankyou for the order.";
 @Test (dataProvider="getData")
 public void productShoppings(HashMap<String, String>map) throws InterruptedException   {
 prdCatalogues pc = lp.webLogin(map.get("email"), map.get("password"));
 pc.addToCart(map.get("prdName"));
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(map.get("prdName"));
 Assert.assertTrue(productMatch);
 pc.thread();
 pc.windowScroll();
 checkOutPg cop = cpg.checkOutBt();
 cop.selectCountry(map.get("country"));
 confirmPg cnf = cop.placeOrder();
 String confirmTxt = cnf.verifyConfirmMessage();
 Assert.assertTrue(confirmTxt.equalsIgnoreCase(confirmationMsg));
 }

 @Test (dependsOnMethods= {"productShoppings"})
 public void verifyOrderHistory()   {
 prdCatalogues pc = lp.webLogin("vishal.vishwakarma20@gmail.com", "@Jas10sum");
 orderPg op = pc.goToOrderPage();
 Assert.assertTrue(op.verifyOrdersList("IPHONE 13 PRO"));
 }

 @DataProvider
 public Object[][] getData()   {
 HashMap<String, String> hm1 = new HashMap<String, String>();
 hm1.put("email", "vishal.vishwakarma20@gmail.com");
 hm1.put("password", "@Jas10sum");
 hm1.put("prdName", "IPHONE 13 PRO");
 hm1.put("country", "India");
 
 HashMap<String, String> hm2 = new HashMap<String, String>();
 hm2.put("email", "shetty@gmail.com");
 hm2.put("password", "Iamking@000");
 hm2.put("prdName", "ADIDAS ORIGINAL");
 hm2.put("country", "Afghanistan");
 
 return new Object[][] {{hm1},{hm2}};
 }
 
}
