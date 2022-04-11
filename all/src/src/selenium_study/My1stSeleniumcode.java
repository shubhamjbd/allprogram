package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumcode {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/");//to enter url in browser or to open an application
		
		//driver.close();//to close the current tab of the browser opened by Selenium tool
	
		//driver.quit();
		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		//driver.get("https://kite.zerodha.com/");
		//driver.manage().window().minimize();
		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		//driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println("Title of web page is "+title);
		
		System.out.println(driver.getCurrentUrl());
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Url of webpage is --> "+url);
		
	
		
		
	}

}
