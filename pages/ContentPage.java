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

	public void VideoContentSetup( WebDriver driver) {
		driver.get("https://dashboard.jwplayer.com/#/content/list?property=9cd1df76-7b33-11e5-8339-128293859c83");
		

		uploadingVideos.click();
		uploadingVideos
				.sendKeys("C:\\Users\\sojib\\workspace\\JWPLAYER\\lib\\Wildlife.wmv");

	}
}