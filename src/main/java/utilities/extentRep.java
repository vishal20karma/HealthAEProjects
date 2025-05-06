package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentRep {

public static ExtentReports extentReports()   {
String path = System.getProperty("user.dir")+"/reports/index.html";	
ExtentSparkReporter reporter = new ExtentSparkReporter(path);
reporter.config().setReportName("Life Events");
reporter.config().setDocumentTitle("Annual Iteration");

ExtentReports extent = new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("Tester", "Vishal");
return extent;
}



}
