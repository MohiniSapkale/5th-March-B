package testNgListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseClassUsingPropertyWhenTCFailTakeSS;

public class Listener1 implements ITestListener{
	
	BaseClassUsingPropertyWhenTCFailTakeSS bctc = new BaseClassUsingPropertyWhenTCFailTakeSS();
	@Override
	public void onTestFailure(ITestResult result) {
		
		  String name = result.getName();
		  try {
			bctc.takeScreenshot(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is sucess",true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is skipped, please check dependent TC",true);
		Reporter.log("Skipped TC is "+result.getName(),true);

		ITestListener.super.onTestSkipped(result);
	}

}
