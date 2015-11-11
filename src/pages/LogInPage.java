package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogInPage {
	@FindBy(linkText = "Sign In")
	public  WebElement signInlink;
	@FindBy(id = "email")
	public  WebElement userIdButton;
	@FindBy(name = "password")
	public  WebElement userPassButton;
	@FindBy(id = "submit_login")
	public  WebElement submitButton;


	public void signIN(String username, String password) {
		signInlink.click();
		userIdButton.sendKeys(username);
		userPassButton.sendKeys(password);
		submitButton.click();

	}
}