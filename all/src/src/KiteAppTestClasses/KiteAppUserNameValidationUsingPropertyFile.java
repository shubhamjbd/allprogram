package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import BaseClasses.BaseUsingPropertyFile;
import KiteAppPOMClasses.KiteHomePage;
import KiteAppPOMClasses.KiteLoginPage;
import KiteAppPOMClasses.KitePinPage;
import utilityPackage.UtilityUsingPropertyFile;

public class KiteAppUserNameValidationUsingPropertyFile extends BaseUsingPropertyFile {
  
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	int TCID=11;
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		launchBrowser();
		
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws IOException
	{
		login.enterUserID(UtilityUsingPropertyFile.getDataFromPropertyFile("UN"));
		login.enterPAssword(UtilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButtton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(UtilityUsingPropertyFile.getDataFromPropertyFile("PIN"));
		pin.clickonContinueButton();
	}
	
	@Test
  public void validateUserID() throws IOException 
  {
	
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 String expectedUserID = UtilityUsingPropertyFile.getDataFromPropertyFile("UN");
	 String actualUserID = home.getActualUserID();
	 Assert.fail();
	 Assert.assertEquals(expectedUserID, actualUserID,"Actual and Expected UserID not matching ");
	 //UtilityUsingPropertyFile.takeScreenshot(driver, TCID);
	 
  }
	
	@AfterMethod
	public void logoutFromKiteApp(ITestResult result) throws InterruptedException, IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			UtilityUsingPropertyFile.takeScreenshot(driver, TCID);
		}
		else
		{
			Reporter.log("TC is passed",true);
			
		}
		
		//home.logout();
	}
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	}
}
