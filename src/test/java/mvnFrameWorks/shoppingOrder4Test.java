package mvnFrameWorks;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;

public class shoppingOrder4Test extends invokingBrowser{
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
 public Object[][] getData() throws IOException   {
 List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")
		 +"//src//main//java//dataStores//testData.json");
 return new Object[][] {{data.get(0)},{data.get(1)}};
 }
 
 
}
