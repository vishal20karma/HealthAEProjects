package misc2;

import java.net.URL;

public class urlIpAddressComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  What happens if you compare web url with same url ip address
/*	try   {
	System.out.println(new URL("https://app.hubspot.com/login")
			.equals(new URL("https://104.19.155.83")));      //Without protocol ip address will not work here
	}                                                        //  It always returns true if ip address of website is correct
	catch (Exception e)   {
	}   */
		
//  For Practice
	try {
	System.out.println(new URL("https://app.hubspot.com/login")
			.equals(new URL("https://104.19.155.83")));	
	}
	catch (Exception e)   {
	}
	
	}
}