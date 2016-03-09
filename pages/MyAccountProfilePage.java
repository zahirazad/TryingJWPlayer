package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountProfilePage {
	@FindBy(xpath = "//*[@id='usr_menu']/li[2]/a")
	public WebElement MyProfileLink;
	@FindBy(id="full_name")
	public WebElement EnterFullName;
	@FindBy(id="comp_name")
	public WebElement BizName;
	@FindBy(id="user_phn_num")
	public WebElement BizPhoneNumber;
	@FindBy(xpath = "//*[@id='account_settings_profile']/div/div[1]/div/button")
	public WebElement SaveButton;
	@FindBy(id = "button")
	public WebElement Acceptalert;
	

	/*
	 * public void AcceptingAlert() { Alert alert= driver.switchTo().alert();
	 * System.out.println(alert.getText()); alert.accept(); }
	 */

	public void MyAccount() {
		MyProfileLink.click();
		EnterFullName.clear();
		EnterFullName.sendKeys("AzadZahir");
		EnterFullName.clear();
		BizName.sendKeys("DreamingForBig");
		EnterFullName.clear();
		BizPhoneNumber.sendKeys("1234567890");
		SaveButton.click();
		//Acceptalert.click();

	}

}
