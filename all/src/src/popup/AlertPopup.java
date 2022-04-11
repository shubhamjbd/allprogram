package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement clickMeButton = driver.findElement(By.id("confirmButton"));
		clickMeButton.click();
		Alert alt = driver.switchTo().alert();// switched selenium focus to alert popup
		
		String textonalertpopup = alt.getText();//getting text from alert popup
		System.out.println("text on alert pop up is "+textonalertpopup);
		
		alt.accept();// accepting alert-->clicking on ok button
		
	
		

	}

}
