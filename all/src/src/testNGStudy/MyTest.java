package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {// this is comment
  @Test
  public void MyMethod1() 
  {
	  System.out.println("Welcome to Test NG1");
  }
  @Test
  public void MyMethod2() 
  {
	  System.out.println("Welcome to Test NG2");
	  Reporter.log("Welcome to Test NG2", true);
  }
}
