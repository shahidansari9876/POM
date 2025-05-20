package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInFacebook {
	
	public LogInFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	public WebElement usernameTextField;
	
	@FindBy(id="pass")
	public WebElement passwordTextField;
	
	@FindBy(xpath ="//button[@name=\"login\"]")
	public WebElement loginButton;
	
	public void loginAction(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
	}
	
	

}
