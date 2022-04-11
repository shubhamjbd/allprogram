package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//swith to frame
		driver.switchTo().frame("iframeResult");
		
		WebElement clickMeButton = driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]"));
		
		clickMeButton.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();

	}

}
