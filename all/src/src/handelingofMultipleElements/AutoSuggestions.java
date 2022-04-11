package handelingofMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		
		System.out.println(alloptions.size());
		for(WebElement w:alloptions)//0,1,...7..8..10.

		{
			String actualResult = w.getText();
			
			String expectedResult="honda amaze";
			
			if(actualResult.equals(expectedResult))
			{
				w.click();
				break;
			}
			}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
	}

}
