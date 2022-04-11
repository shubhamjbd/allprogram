package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualsStudy {
	 @Test
	  public void AssertTest()
	  {
		  
		  String name="VCTC";
		  String name1="VCTC";
		  
	  Assert.assertNotEquals(name, name1, "Strings are matching");
	  
	  
	  
	  }
}
