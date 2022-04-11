package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement userIDField = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userIDField.sendKeys("HD5857");
		password.sendKeys("Ajinkya@123");
		loginButton.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("969696");
		continueButton.click();
		
		Thread.sleep(1000);
		
		WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserID = userID.getText();
		String expectedUserID = "HD5857";
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID  matching TC passed");
		}
		else {
			System.out.println("User ID not matching TC failed");
		}
		
		userID.click();
		WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logOutButton.click();
		driver.close();

	}

}

//3 min---10usernames-->30 min
//8sec---10 usernames-->2 min



