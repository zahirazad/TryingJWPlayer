package test;

import org.testng.annotations.Test;

import testBase.Base;

public class ContentVideosTest extends Base{
	@Test
	public void uploadingVideos() {
		logInPage.signIN("azadzahir@yahoo.com", "Sojib8989");
		contentvideoPage.VideoContentSetup();
		

	}

}
