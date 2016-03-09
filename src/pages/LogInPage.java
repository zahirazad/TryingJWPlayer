package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogInPage {
	@FindBy(linkText = "Sign In")
	public WebElement signInlink;
	@FindBy(id = "email")
	public WebElement userIdButton;
	@FindBy(name = "password")
	public WebElement userPassButton;
	@FindBy(id = "submit_login")
	public WebElement submitButton;
	@FindBy(id = "welcome-username")
	public WebElement AssertingProfileName;
	@FindBy(id = "hmpg_header")
	public WebElement welcomeMassege;

	public void signIN(String username, String password) {
		signInlink.click();
		userIdButton.sendKeys(username);
		userPassButton.sendKeys(password);
		submitButton.click();
	//	System.out.println(welcomeMassege.getText());
		//Assert.assertEquals(AssertingProfileName.getText(),
			//	"Welcome, AZADZAHIR@YAHOO.COM");// assertion is not working here

		// Assert.assertEquals(AssertingProfileName,
		// "WelcomeAZADZAHIR@YAHOO.COM");

	}
}