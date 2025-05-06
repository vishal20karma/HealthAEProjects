package singletonDesign;

public class browserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
//	Browser.getInstance().displayInfo();   //How to call this once
//  How to call for multi threaded environment
    Runnable task = ()-> {Browser.getInstance().displayInfo();};
	
    Thread tr1 = new Thread(task);
    Thread tr2 = new Thread(task);
    Thread tr3 = new Thread(task);
    Thread tr4 = new Thread(task);
    
    tr1.start();
    tr2.start();
    tr3.start();
    tr4.start();
    
    try   {
    tr1.join();
    tr2.join();
    tr3.join();
    tr4.join();
    }
	catch (InterruptedException e)   {
	e.printStackTrace();
	}   */
	
//  For Practice
//	Browser.getInstance().displayInfo();	
	Runnable task = ()-> {Browser.getInstance().displayInfo();};
	
	Thread tr1 = new Thread(task);
	Thread tr2 = new Thread(task);
	Thread tr3 = new Thread(task);
	Thread tr4 = new Thread(task);
	
	tr1.start();
	tr2.start();
	tr3.start();
	tr4.start();
	
	try   {
	tr1.join();
	tr2.join();
	tr3.join();
	tr4.join();
	}
	catch (InterruptedException e)   {
	}
	
	}
}
