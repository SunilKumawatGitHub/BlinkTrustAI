package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import base.BaseTest;

public class SuiteListener implements ITestListener , IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyser.class);
		
	}

	@Override
	public void onTestStart(ITestResult result)
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String fileName = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator +result.getMethod().getMethodName();
		File file =  ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileUtils.copyFile(file, new File(fileName + ".png"));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
		
	} 

}
