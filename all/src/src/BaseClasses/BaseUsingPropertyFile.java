package BaseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utilityPackage.UtilityUsingPropertyFile;

public class BaseUsingPropertyFile {

	
	
		protected WebDriver driver;
		public void launchBrowser() throws IOException
		 {
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions opt= new ChromeOptions();
		 opt.addArguments("--disable-notifications");
		 driver= new ChromeDriver(opt);	 
		 driver.get(UtilityUsingPropertyFile.getDataFromPropertyFile("URL"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 driver.manage().window().maximize();
		 Reporter.log("Browserlaunched sussess",true);
		 
		 }
		
		public void closeBrowser()
		{
			driver.close(); 
			Reporter.log("Browser closed sussess",true);
		}

}
