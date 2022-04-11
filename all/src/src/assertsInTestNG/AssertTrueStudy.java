package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void testing()
  {
	  
	  boolean result=true;
	  
	  Assert.assertTrue(result, "Result is false");
  }
}
