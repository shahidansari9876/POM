package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToVerifyInstagramHomePage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		
		driver.get("https://www.instagram.com/");
		
		LogInInstagram loginAction = new LogInInstagram(driver);
		loginAction.LogInInstagramAction("shahid ansari", "passwordIn");
		driver.navigate().refresh();
		
		loginAction.LogInInstagramAction("gospiderman go", "heyiampassword");
		 driver.navigate().refresh();
		 
		 loginAction.LogInInstagramAction("yesIamInstagram", "yesIamPassword");
		 
		  driver.close();
		 
	}

}
