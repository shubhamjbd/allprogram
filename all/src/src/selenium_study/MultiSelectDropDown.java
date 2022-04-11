package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//1.
		WebElement multiSelectBox = driver.findElement(By.name("cars"));
		
		//2.
		Select s= new Select(multiSelectBox);
		
		//3.
		boolean result = s.isMultiple();
		System.out.println("Multiple check is "+result);
		
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		s.selectByValue("saab");
		
		//deselect
		Thread.sleep(1000);
	//	s.deselectByVisibleText("Saab");
		s.deselectAll();
		
	}

}
