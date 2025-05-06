package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

/* @Test
   public void OpenEnrollment1()   {
   System.out.println("Medical Coverages");	
   System.out.println();
   }

   @Test
   public void OpenEnrollment2()   {
   System.out.println("Dental Coverages");	   
   Assert.assertTrue(false);   //Purposely used to fail the test case so that listeners can capture this
   }   */

// For Practice
   @Test (priority=1)
   public void OpenEnrollment1()   {
   System.out.println("Medical Coverages");	   
   }

   @Test (priority=2)
   public void OpenEnrollment2()   {
   System.out.println("Dental Coverages");   
   Assert.assertTrue(false);
   }

}
