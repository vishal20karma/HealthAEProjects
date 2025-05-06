package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.extentRep;

public class listeners implements ITestListener{

	ExtentReports extent = extentRep.extentReports();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	test = extent.createTest(result.getMethod().getMethodName());	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	test.log(Status.PASS, "TEST PASS");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	test.log(Status.FAIL, "TEST FAIL");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
	extent.flush();	
	}

}
