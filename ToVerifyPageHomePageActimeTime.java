 package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToVerifyPageHomePageActimeTime {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
	
		LogInPageActime login= new LogInPageActime(driver);
	
		login.loginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		String actualTitle = driver.getTitle();
		if(actualTitle.contains("Enter"))
		{
			System.out.println("pass : title verified");
		}
		else 
			System.out.println("fail :  title failed");
		HomePageActiTime home = new HomePageActiTime(driver);
		home.logoutAction();
		driver.quit();
	}

}
