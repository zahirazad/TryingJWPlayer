package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class headerPage {
	@FindBy(id = "jw_home")
	public WebElement LogopageLink;
	@FindBy(xpath = "//*[@id='fouc']/div[1]/div[3]/div/div/div[1]/a[2]")
	public WebElement PlayerUpgradeButtonLink;
	@FindBy(id = "Players")
	public WebElement PlayerLink;
	@FindBy(id = "Content")
	public WebElement ContentLink;
	@FindBy(id = "Analytics")
	public WebElement PlayerPage;
	@FindBy(xpath = ".//*[@id='fouc']/div[2]/div/div[2]/div[1]/div/div/h3/span")
	public WebElement EmbedingCode;

	public void HeaderPageSetUp() {
		LogopageLink.click();
		PlayerUpgradeButtonLink.click();
		PlayerLink.click();
		ContentLink.click();
		PlayerPage.click();
		EmbedingCode.click();

	}

}
