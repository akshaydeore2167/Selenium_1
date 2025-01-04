package com.Listners;

import com.Extent_Reporter.Extent_Reporter_Ng;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.slf4j.helpers.SubstituteLogger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
ExtentReports extent =Extent_Reporter_Ng.extentReportGEnerator();
ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Executed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //test.skip(result.getThrowable());
        test.log(Status.SKIP,"Test Case Skip");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();

    }
}
