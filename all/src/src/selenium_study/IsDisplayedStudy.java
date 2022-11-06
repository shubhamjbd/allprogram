package src.selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		boolean result = TextBox.isDisplayed();
		System.out.println("text box state is "+result);
		Thread.sleep(2000);
		WebElement HideButton = driver.findElement(By.id("hide-textbox"));
		HideButton.click();
		boolean result1 = TextBox.isDisplayed();
		
		System.out.println("text box state is "+result1);

	}

}
