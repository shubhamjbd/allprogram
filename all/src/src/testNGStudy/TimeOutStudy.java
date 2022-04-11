package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
	  @Test
	  public void a()
	  {
		  Reporter.log("Running A method", true);
	  }
	 
	  @Test(timeOut = 1000)
	  public void c() throws InterruptedException
	  {
		  Thread.sleep(2000);
		  Reporter.log("Running C method", true);
	  }
	  @Test
	  public void b()
	  {
		  Reporter.log("Running B method", true);
	  }
	 
}
