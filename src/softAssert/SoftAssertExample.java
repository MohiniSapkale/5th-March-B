package softAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	SoftAssert soft= new SoftAssert();
	 @Test
	 public void TC1() 
	 {
	String ExpectedResult="VCTCPune";
	String ActualResult="VCTC";
	soft.assertEquals(ActualResult, ExpectedResult, "Value is not matching");
	Reporter.log("TC1 softAssert is running",true);
	
	soft.assertNotNull(ActualResult);
	Reporter.log("running TC",true);
	soft.assertAll(); //If we don’t write assertAll then it will not notify 
	
	 }
	 
}
