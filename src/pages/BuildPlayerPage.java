package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildPlayerPage {
	@FindBy(id = "Players")
	public WebElement PlayerLink;
	@FindBy(id="new_plyr_btn")
	public WebElement NewPlyer;
	@FindBy(id = "player-title")
	public WebElement TitleOfThePlayer;
	@FindBy(xpath = ".//*[@id='accordion_design']/div[1]/h4/a/span")
	public WebElement DesignOfThePlayer;
	@FindBy(xpath = ".//*[@id='skin_bekle']/img")
	public WebElement PlayerDesigncustoms;
	@FindBy(id = "save_plyr")
	public WebElement submitButton;
	

	public void BuildPlayer() {
		PlayerLink.click();
		NewPlyer.click();
		TitleOfThePlayer.sendKeys("ZahirssssPlayer");
		DesignOfThePlayer.click();
		PlayerDesigncustoms.click();
		submitButton.click();
		

	}

	public void PlayerLink(WebDriver driver) {
		driver.get("https://dashboard.jwplayer.com/#/players/");

	}

}
