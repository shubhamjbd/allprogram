package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
	 @Test
	  public void MyMethod1()
	  {
		  System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\geckodriver.exe");

			WebDriver driver= new FirefoxDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
	  }
}
