package src.selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
		
		WebElement WebEle = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		String Actualtext = WebEle.getText();
		System.out.println("text is "+Actualtext);
		String Expectedtext="Welcome To Practice Page";
		
		if(Actualtext.equals(Expectedtext))
		{
			System.out.println("text is matching, TC is passed");
		}
		
		else {
		System.out.println("text is not matching, TC is failed");
	}
	}

}
