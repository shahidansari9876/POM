package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LgoutHomeFacebook {
	
	public LgoutHomeFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
 	}
	
	@FindBy(xpath = "//div[@class=\"x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z\"]")
	public WebElement logoutFrame;
	
	@FindBy(xpath = "//span[contains(text(),'Log Out')]")
	public WebElement logoutButton;
	
	public void logoutAction() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	logoutFrame.click();
	logoutButton.click();
	
	}

}
