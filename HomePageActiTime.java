

package POM;  


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageActiTime {
	
	public HomePageActiTime(WebDriver  driver) {
		PageFactory.initElements(driver, this);
 	}
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement logout;
	
	public void logoutAction()
	{
		logout.click();
	}

 system.out.println('shahid')
}
// my name is shahid ansari i m automation engineer in deops. 