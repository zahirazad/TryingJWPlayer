package test;

import org.testng.annotations.Test;

import testBase.Base;

public class ContentVideoVIaYUrlTest extends Base{
	@Test
	public void ContentVideoTwo() throws InterruptedException{
		logInPage.signIN("azadzahir@yahoo.com", "Sojib8989");
		contentvideoPageUrlTwo.VideoSetupTwo();
		driver.navigate().refresh();
		contentvideoPageUrlTwo.JWLogo.click();
		
	}

}
