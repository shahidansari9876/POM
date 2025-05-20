package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageActime {
	public LogInPageActime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
 @FindBy(id="username")
 public WebElement userNameTextField;
 
 @FindBy(name="pwd")
 public WebElement passwordTextField;
 
 @FindBy(xpath="//div[text()='Login ']")
 public WebElement logIn;
 
 public void loginAction(String username, String passwordInput) {
	this.userNameTextField.sendKeys(username);
	this.passwordTextField.sendKeys(passwordInput);
	this.logIn.click();
}
 
 
 
}
