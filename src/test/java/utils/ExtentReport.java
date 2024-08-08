package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
public static ExtentReports getReport() {
		
		String path="C:\\Users\\Administrator\\eclipse-workspace\\BestBuyE-commerce\\report\\BestBuyReport.html";
		// To create report in the given location
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("BestBuy Reporter");
		
		// To capture test data
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}

}
