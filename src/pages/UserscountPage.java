package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.thoughtworks.selenium.Wait;

public class UserscountPage {
	@FindBy(xpath = "//*[@id='usr_menu']/li[2]/a")
	public WebElement AccountLink;

	@FindBy(xpath = "//*[@id='usr_menu']/li[2]/ul/li[3]/a")
	public WebElement UsersLink;
	@FindBy(xpath = "//*[@id='account_users_additional']/div/div[3]/div[4]/transclude/table/tbody/tr/td[3]/button[2]")
	public WebElement viewprofLink;
	@FindBy(id = ".//*[@id='userSettingsForm']/div/div[1]/div/label")
	public WebElement viewEmailLink;
	@FindBy(id = "chng_pass")
	public WebElement changePass;
	@FindBy(xpath = "//*[@id='app_body']/div[5]/div/div/div/form/div[3]/a")
	public WebElement ForgotpasswordLink;
	@FindBy(id = "comp_name")
	public WebElement NewNameLink;
	@FindBy(id = "chng_pass")
	public WebElement TryingAssert;
	@FindBy(xpath = "//*[@id='usr_menu']/li[2]/ul/li[4]/a")
	public WebElement UsageLink;
	@FindBy(xpath = "//*[@id='usage']/div/div[3]/div[4]")
	public WebElement TotalUsageLink;

	public void UserProf() {
		AccountLink.click();
		// changePass.click();
		// System.out.println(ForgotpasswordLink.getText());

		UsersLink.click();
		viewprofLink.click();
		NewNameLink.clear();
		NewNameLink.sendKeys("Azad Zahir");
		 System.out.println(TryingAssert.getText());
		//AccountLink.click();
		// TotalUsageLink.click();

	}

}
