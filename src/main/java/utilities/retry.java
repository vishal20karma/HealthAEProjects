package utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer{

/*	int count=0;
	int maxTry=1;
	@Override
	public boolean retry(ITestResult result)   {
	if (count<maxTry)   {
	count++;
	return true;
	}
	return false;
	}   */
	
//  For Practice
	int count=0;
	int maxTry=1;
	public boolean retry(ITestResult result)   {
	if (count<maxTry)   {
	count++;
	return true;
	}
	return false;
	}
}	
