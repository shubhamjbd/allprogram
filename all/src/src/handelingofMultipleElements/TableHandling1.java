package handelingofMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='product']//th"));
	
		for(WebElement w:tableHeader)
		{
			System.out.print("|| "+w.getText()+" ||");
		}
		
	for(int i=1;i<=11;i++)//1,2,3.....11
	{
		System.out.println();
		List<WebElement> tableRow = driver.findElements(By.xpath("(//table[@id='product']//tr)["+i+"]"));
		for(WebElement w:tableRow)
		{
			System.out.print("|| "+w.getText()+" ||");
		}
	}
	}

}
