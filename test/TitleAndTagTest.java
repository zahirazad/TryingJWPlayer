package test;

import org.testng.annotations.Test;

import testBase.Base;

public class TitleAndTagTest extends Base {
	@Test
	public void TitleTag() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		titleAndtagPage.goToTitlePage(driver);
		titleAndtagPage.TitleandTag();

	}
}
