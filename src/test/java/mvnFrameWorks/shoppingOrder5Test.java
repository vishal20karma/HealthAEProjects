package mvnFrameWorks;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.invokingBrowser;
import utilities.jsonFileReader;
import utilities.orderPg;
import utilities.prdCatalogues;
import utilities.pojo;

public class shoppingOrder5Test extends invokingBrowser{
 //   String prdName="IPHONE 13 PRO"; String countryName="India"; 
 String confirmationMsg="Thankyou for the order.";
 @Test (dataProvider="getData")
 public void productShoppings(pojo prd) throws InterruptedException   {
 prdCatalogues pc = lp.webLogin(prd.getEmail(), prd.getPassword());
 pc.addToCart(prd.getProduct());
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(prd.getProduct());
 Assert.assertTrue(productMatch);
 int images = cpg.imgSize();
 Assert.assertEquals(images, prd.getImageCount());
 pc.thread();
 pc.windowScroll();
 checkOutPg cop = cpg.checkOutBt();
 cop.selectCountry(prd.getCountry());
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
 return jsonFileReader.getJsonData(System.getProperty("user.dir")
			 +"//src//main//java//dataStores//testData2.json", new TypeReference<List<pojo>>() {}); 
 }
}
