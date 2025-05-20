package POM;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageFacebook {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
	
		LogInFacebook login = new LogInFacebook(driver);
		login.loginAction("9528050389", "SP@1234567sp");
		System.out.println("yeah the facebook is open");
	
		Thread.sleep(2000);
		
		LgoutHomeFacebook logout = new LgoutHomeFacebook(driver);
		logout.logoutAction();
		System.out.println("End to End process");
		driver.quit();
	}

}
