package softAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndNotEquals {
	
	SoftAssert soft = new SoftAssert();
  @Test
  public void myMethod() {
	  
	  String a="Pune";
	  String b="Pune";
	  String C="Mumbai";
	  
	  soft.assertEquals(a, b,"String are not matching TC is failed");
	  
	  soft.assertNotEquals(a, C,"String are Matching TC is Failed");
	  soft.assertAll();
  }
  
  @Test
  public void myMethod1() {
	  
	  boolean a = false;
	  
	  soft.assertTrue(a, "value is true Tc is failed");
	  soft.assertAll();
  }
  
}
