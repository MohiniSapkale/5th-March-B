package testNgListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNgListener.Listener.class)
public class MyTestClass {
	@Test
	public void myTest()
	{
	Assert.fail();
	}
	@Test(dependsOnMethods = {"myTest"})
	 public void myMethod()
	 {
	//Assert.fail();
	Reporter.log("Hi GM",true);
	 }

}
