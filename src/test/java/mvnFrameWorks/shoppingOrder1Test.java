package mvnFrameWorks;

import org.junit.Assert;
import org.testng.annotations.Test;

import utilities.cartPg;
import utilities.checkOutPg;
import utilities.confirmPg;
import utilities.invokingBrowser;
import utilities.orderPg;
import utilities.prdCatalogues;

public class shoppingOrder1Test extends invokingBrowser{
 String prdName="ZARA COAT 3"; String countryName="India"; String confirmationMsg="Thankyou for the order.";
 @Test
 public void productShoppings() throws InterruptedException   {
 prdCatalogues pc = lp.webLogin("vishal.vishwakarma20@gmail.com", "@Jas10sum");
 pc.addToCart(prdName);
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(prdName);
 Assert.assertTrue(productMatch);
 pc.thread();
 pc.windowScroll();
 checkOutPg cop = cpg.checkOutBt();
 cop.selectCountry(countryName);
 confirmPg cnf = cop.placeOrder();
 String confirmTxt = cnf.verifyConfirmMessage();
 Assert.assertTrue(confirmTxt.equalsIgnoreCase(confirmationMsg));
 }

 @Test (dependsOnMethods= {"productShoppings"})
 public void verifyOrderHistory()   {
 prdCatalogues pc = lp.webLogin("vishal.vishwakarma20@gmail.com", "@Jas10sum");
 orderPg op = pc.goToOrderPage();
 Assert.assertTrue(op.verifyOrdersList(prdName));
 }

}
