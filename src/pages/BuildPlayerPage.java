package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildPlayerPage {
	@FindBy (xpath= ".//*[@id='fouc']/div[5]/div/div/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[1]/a")
	public  WebElement JWPlayerbuildLInk;
	@FindBy(id="player-title")
	public  WebElement TitleOfThePlayer;
	@FindBy(xpath=".//*[@id='accordion_design']/div[1]/h4/a/span")
	public  WebElement DesignOfThePlayer;
	@FindBy(xpath=".//*[@id='skin_bekle']/img")
	public  WebElement PlayerDesigncustoms;
	@FindBy (id="save_plyr")
	public  WebElement submitButton;
	
	
	public void BuildPlayer(){
		JWPlayerbuildLInk.click();
		TitleOfThePlayer.sendKeys("ZahirsPlayer");
		DesignOfThePlayer.click();
		PlayerDesigncustoms.click();
		submitButton.click();
		
		
		
		
	}
	
	
	

}
