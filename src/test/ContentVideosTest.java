package test;

import org.testng.annotations.Test;

import testBase.Base;

public class ContentVideosTest extends Base {
	@Test
	public void uploadingVideos() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		contentvideoPage.VideoContentSetup(driver);
		/*Actions actions = new Actions(driver);
		actions.moveToElement(contentvideoPage.uploadingVideos);
		actions.click();
		actions.sendKeys("C:\\Users\\sojib\\workspace\\JWPLAYER\\lib\\Wildlife.wmv");
		actions.build().perform();*/

	}

}
