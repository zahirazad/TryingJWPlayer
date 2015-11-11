package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakingPlayerPage {
	@FindBy(id = "Players")
	public WebElement ClickingOnPlayer;
	@FindBy(id = "new_plyr_btn")
	public WebElement NewPlayerButton;
	@FindBy(id = "player-title")
	public WebElement NmaeOfMyPlayer;
	@FindBy(xpath = ".//*[@id='accordion_basic_setup']/div[1]/h4/a/span")
	public WebElement ChoseBasicSetup;
	@FindBy(id = "autostrt")
	public WebElement CLickingAutoStart;
	@FindBy(xpath = ".//*[@id='save_plyr']")
	public WebElement SavingPlayer;

	public void makingPlayerSetup() {
		ClickingOnPlayer.click();
		NewPlayerButton.click();
		NmaeOfMyPlayer.sendKeys("Azad's");
		// ChoseBasicSetup.click();
		// CLickingAutoStart.click();
		SavingPlayer.click();

	}

}
