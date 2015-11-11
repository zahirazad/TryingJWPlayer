package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ContentPage {
	@FindBy(id = "Content")
	public WebElement ContentLink;
	@FindBy(id = "new_action")
	public WebElement uploadingVideos;
	@FindBy(id = "content-upload")
	public WebElement video_upload_input;

	public void uploadVideo() {
		video_upload_input
				.sendKeys("C:\\Users\\sojib\\workspace\\JWPLAYER\\lib\\Wildlife.wmv");
	}
	public void VideoContentSetup(){
		ContentLink.click();
		uploadingVideos.click();
		uploadingVideos.sendKeys("C:\\Users\\sojib\\workspace\\JWPLAYER\\lib\\Wildlife.wmv");
		
		
		
		
		
	}
}