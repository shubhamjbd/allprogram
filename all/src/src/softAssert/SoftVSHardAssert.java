package softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVSHardAssert {
  
	SoftAssert s= new SoftAssert();
	@Test
  public void TC1()
  {
	 String a="Pune";
	 String b= "Pune";
	 
	 s.assertNotEquals(a, b,"A and B are equal");// 1st verification point
	 s.assertNull(b,"b is not null");// 2nd verification point
	 s.assertAll();
	  
  }
	
//	@Test
//	public void TC2()
//	  {
//		 String a="Pune";
//		 String b= "Pune";
//		 
//		Assert.assertNotEquals(a, b,"A and B are equal");// 1st verification point
//		Assert.assertNull(b,"Not null");// 2nd verification point
//	
//		  
//	  }
	
	@Test
	public void TC3()
	{
		String m="MyName";
		 String n="MyName";
		s.assertNotEquals(m, n, "a and b are not equal");
		s.assertAll();;
		
	}
	
	
}
