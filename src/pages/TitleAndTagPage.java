package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class TitleAndTagPage{
	@FindBy(id="Content")
	public WebElement ContentLink;
	@FindBy(xpath = "//*[@id='video_lst_table']/tbody/tr[1]/td[2]/a")
	public WebElement VideoLink;
	@FindBy(id = "video-title")
	public WebElement TitleLink;
	@FindBy(id = "content-tag-query")
	public WebElement AddTag;
	@FindBy(xpath = ".//*[@id='fouc']/div[5]/div/div/div/div[2]/div/jw-form/div/div[3]/div[2]/div/div/div[1]/div/ng-include/div/div/div[2]/div[1]/div/a")
	public WebElement TagButton;
	@FindBy(xpath = ".//*[@id='fouc']/div[5]/div/div/div/div[2]/div/jw-form/div/div[2]/div[2]/button")
	public WebElement SaveButton;
	@FindBy(xpath="//*[@id='fouc']/div[5]/div/div/div/div[2]/div/div/div[2]/div[1]/a")
	public WebElement ManageTag;
	@FindBy (id="new-asset")
	public WebElement NewTag;
	@FindBy(xpath="//*[@id='tbl']/tbody/tr/td[2]/div/jw-click-to-edit/div/input")// cant locate this xpath
	public WebElement TagName;
	@FindBy(xpath="//*[@id='tbl']/tbody/tr/td[2]/div/jw-click-to-edit/div/button")
	public WebElement saveButton;

	
	public void TitleandTag(){
		
		VideoLink.click();
		TitleLink.clear();
		TitleLink.sendKeys("dec 9th");
		AddTag.click();
		TagButton.sendKeys("adele");
		SaveButton.click();
		ContentLink.click();
		ManageTag.click();
		NewTag.click();
		TagName.sendKeys("Mohammed");
		saveButton.click();
		ContentLink.click();
		ManageTag.click();
		NewTag.click();
		TagName.clear();
		TagName.sendKeys("MohammedOne");
		saveButton.click();
		ContentLink.click();
		ManageTag.click();
		NewTag.click();
		TagName.clear();
		TagName.sendKeys("MohammedTwo");
		saveButton.click();
		
	}
	public void goToTitlePage( WebDriver driver){
		driver.get("https://dashboard.jwplayer.com/#/content/list?property=9cd1df76-7b33-11e5-8339-128293859c83");
	}
}
