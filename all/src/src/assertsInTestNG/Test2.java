package assertsInTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	 @Test
	 public void testing()
  {
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			WebElement UserID = driver.findElement(By.id("userid"));
			
			if(false)
			{
				UserID.sendKeys("HD5857");
				System.out.println("TC is passed");
			}
			
			else {
				System.out.println("Element is not displayed");
				System.out.println("failed");
			}
}
}
