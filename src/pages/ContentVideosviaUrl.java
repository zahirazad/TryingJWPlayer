package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentVideosviaUrl {
	@FindBy(id = "Content")
	public WebElement ContentLink;
	@FindBy (xpath=".//*[@id='fouc']/div[5]/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/a[2]")
	public WebElement DropDownMenu;		
	@FindBy (xpath=".//*[@id='fouc']/div[5]/div/div/div/div[2]/div/div/div[2]/div[1]/div[1]/ul/li[2]/a")
	public WebElement ChoseURL;
	@FindBy (id="new_action")
	public WebElement ADDUrl;
	@FindBy (name="currentUrl")
	public WebElement PasteUrl;
	@FindBy (id="add-button")
	public WebElement AddButton;
	@FindBy (xpath=".//*[@id='fouc']/div[2]/div/div[2]/div[1]/div/div/h3/span")
	public WebElement ClickingOnWatch;
	@FindBy(id="jw_home")
	public WebElement JWLogo;
	//@FindBy (xpath=".//*[@id='fouc']/div[5]/div/div/div/div[2]/div/jw-form/div/div[3]/div[1]/div[1]/div/div[2]/div/button")
	//public WebElement EmbedingVideo;
	@FindBy (id="full_preview_player")
	public WebElement PreviewVideo;
	
	  public void VideoSetupTwo() throws InterruptedException{
		  ContentLink.click();
		  DropDownMenu.click();
		  ChoseURL.click();
		  ADDUrl.click();
		  PasteUrl.sendKeys("https://www.youtube.com/watch?v=gKoQGBCYPSg");
		  AddButton.click();
		 
		 // ClickingOnWatch.click();
		 // EmbedingVideo.click();
		  //PreviewVideo.click();
		  
		  
		  
		  
		  
		  
		  
	  }

}
