package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		String mainPagewindoID = driver.getWindowHandle();//will give windowID in string form
//		System.out.println("Window id is "+mainPagewindoID);
		
		driver.findElement(By.name("NewWindow")).click();// opening child browser popup
		// we got multiple windows
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("All ids are "+allWindowIds);
		
		Iterator<String> it=allWindowIds.iterator();//pointing to -1
		String mainPageID = it.next();// pointing to 0th location
		String childPageID1 = it.next();//pointing to 1st location
		
		//switch selenium focus to child page
		Thread.sleep(2000);
		driver.switchTo().window(childPageID1);//focused switched form main page to child page
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.close();
		
		//switch selenium focus to main page
		driver.switchTo().window(mainPageID);
		Thread.sleep(2000);
		driver.findElement(By.name("home")).click();
		driver.close();
		
		}

}
