package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityUsingPropertyFile 
{

	public static void takeScreenshot(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\Screenshot\\TC"+TCID+"Screenshot.png");
		FileHandler.copy(src, dest);
		Reporter.log("screenshot taken for TC " +TCID,true);
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException
	
	{
		Properties p= new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\yogendra\\eclipse-workspace\\11th_Dec_B\\MyFile.properties");
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
}
