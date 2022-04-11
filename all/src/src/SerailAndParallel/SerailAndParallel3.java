package SerailAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerailAndParallel3 {
	@Test
	  public void MyMethod1() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.close();
	  }
}
