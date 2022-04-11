package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement rightClickHereButton = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act= new Actions(driver);
		
	//	act.contextClick(rightClickHereButton).perform();
		
		act.moveToElement(rightClickHereButton).contextClick().build().perform();
		
		
		
		
		
		
	}

}
