package mvnFrameWorks;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import utilities.cartPg;
import utilities.invokingBrowser;
import utilities.prdCatalogues;
import utilities.retry;

 public class loginValidationTest extends invokingBrowser{
 String prdName="ZARA COAT 3"; String errorMsg="Incorrect email  password.";
 
 @Test (retryAnalyzer=retry.class)
 public void loginTest()   {
 lp.webLogin("vishal.vishwakarma202@gmail.com", "@Jas10sum");
 Assert.assertEquals(errorMsg, lp.loginMsgValidation());
 }
 
 @Test
 public void prdMatch() throws InterruptedException   {
 prdCatalogues pc = lp.webLogin("vishal.vishwakarma20@gmail.com", "@Jas10sum");
 pc.addToCart(prdName);
 pc.waitAfterAddToCart();
 cartPg cpg = pc.goToCartPage();
 boolean productMatch = cpg.verifyProduct(prdName);
 Assert.assertTrue(productMatch);
 }

}
