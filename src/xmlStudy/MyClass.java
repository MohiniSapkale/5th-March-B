package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void add() {
	  
	  Reporter.log("Add is running", true);
  }
  @Test
  public void sub() {
	  
	  Reporter.log("sub is running", true);
  }
  @Test
  public void mul() {
	  
	  Reporter.log("Mul is running", true);
  }
  @Test
  public void div() {
	  
	  Reporter.log("div is running", true);
  }
  @Test
  public void percentage() {
	  
	  Reporter.log("percentage is running", true);
  }
}
