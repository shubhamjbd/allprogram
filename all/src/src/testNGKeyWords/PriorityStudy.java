package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
	  @Test(priority = 1)
	  public void a()
	  {
		  Reporter.log("Running A method", true);
	  }
	 
	  @Test(priority = -2)
	  public void c()
	  {
		  Reporter.log("Running C method", true);
	  }
	  @Test(invocationCount = 3, priority = -9, timeOut = 2000)
	  public void b()
	  {
		  Reporter.log("Running B method", true);
	  }
	 
}
