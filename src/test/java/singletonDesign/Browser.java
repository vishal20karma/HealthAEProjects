package singletonDesign;

// How to achieve Singleton design pattern
   public class Browser {
/*
// 1-Private static instance of the class
   private volatile static Browser browser;   //It will be same name as class name, 'Volatile' keyword helps in systematic way to provide 'browser' copy/instance properly
	
// 2-Private constructor to prevent/avoid instantiation/object
   private Browser() {
   }
	
// 3-Public static method to provide access to the instance/object
   public static Browser getInstance()   {   //if 'synchronized' key used then multiple threads will access the instance one by one, 'synchronized' key locks the instance and when it is released then only next thread access it. 
   if (browser==null)   {
   synchronized(Browser.class)   {	   
   if (browser==null)   {
   browser = new Browser();
   }
   }
   }
   return browser;
   }
   
// 4-Individual method of the class	
   public void displayInfo()   {
   System.out.println("Browser Information");	   
   }   */

// For Practice
// 1-Private static instance of the class
   private volatile static Browser browser;
   
// 2-Private constructor to prevent/avoid instantiation/object
   private Browser()   {
   }

// 3-Public static method to provide access to the instance/object
   public static Browser getInstance()   {
   if (browser==null)   {
   synchronized (Browser.class)   {	   
   if (browser==null)   {
   browser = new Browser();   
   }
   }
   }
   return browser;
   }

   public void displayInfo()   {
   System.out.println("Browser Information");
   }

}