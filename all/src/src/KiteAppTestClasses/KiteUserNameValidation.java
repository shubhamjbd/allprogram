package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import KiteAppPOMClasses.KiteHomePage;
import KiteAppPOMClasses.KiteLoginPage;
import KiteAppPOMClasses.KitePinPage;
import utilityPackage.Utility;

public class KiteUserNameValidation extends Base {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void browserLaunch()
	{
		launchBrowser();
		login=new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.enterUserID(Utility.readDataFromExcel(0, 0));
		login.enterPAssword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButtton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		
		pin.enterPin(Utility.readDataFromExcel(0, 2));
		pin.clickonContinueButton();
		
	} 
	
	@Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
	{
		int TCID=100;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String actualUserID = home.getActualUserID();
		String expectedUserID = Utility.readDataFromExcel(0, 3);
		Assert.assertEquals(expectedUserID, actualUserID,"Actual and Expected not matching");
		Utility.takeScreenshot(driver, TCID);
		Reporter.log("Validated UserName", true);
	
	}
	
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
		home.logout();
		Reporter.log("Logging out", true);
		}
	
	@AfterClass
	
	public void closingBrowser()
	{
		closeBrowser();
	}
	
}
