package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy1 {
  @Test
  public void a()
  {
	  Reporter.log("Running A method", true);
  }
 
  @Test
  public void c()
  {
	  Reporter.log("Running C method", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("Running B method", true);
  }
 
}
