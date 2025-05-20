package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInInstagram {
	public LogInInstagram(WebDriver driver)
	{
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "username")
	public WebElement usernameTextField;
	
	@FindBy(name = "password")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//div[contains(text(),'Log in')]")
	public WebElement loginButton;

	public void LogInInstagramAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
	}
	

}
