package KiteAppTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import KiteAppPOMClasses.KiteLoginPage;
import utilityPackage.Utility;

public class KiteAppUserIDErrorMsgValidation extends Base {
  
	KiteLoginPage login;
	
	@BeforeClass
	public void LaunchBrowser()
	{
		launchBrowser();
		login= new KiteLoginPage(driver);
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.enterPAssword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButtton();
		
	}
	
	
	@Test
  public void validateUserIDerrorMsg() throws EncryptedDocumentException, IOException
	{
		int TCID=555;
		String expectedUserIDerrorMsg=Utility.readDataFromExcel(0, 4);
		String actualUserIDerrorMsg = login.getUserIdErrorMsg();
		Assert.assertEquals(actualUserIDerrorMsg, expectedUserIDerrorMsg,"Error msg is not matching");
		Utility.takeScreenshot(driver, TCID);
		 
	}
	@AfterClass
	public void browserClosing()
	{
		closeBrowser();
	}
}
