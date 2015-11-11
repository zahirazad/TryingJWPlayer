package test;

import org.testng.annotations.Test;

import pages.BuildPlayerPage;
import pages.LogInPage;
import testBase.Base;

public class BuildPlayerTest extends Base {
	@Test
	public void testDesignPlayer() {
		logInPage.signIN("azadzahir@yahoo.com", "Sojib8989");
		buildPlayerPage.BuildPlayer();

	}

}
