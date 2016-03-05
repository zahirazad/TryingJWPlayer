package test;

import org.testng.annotations.Test;

import testBase.Base;

public class BuildPlayerTest extends Base {
	@Test
	public void testDesignPlayer() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		buildPlayerPage.PlayerLink(driver);
		buildPlayerPage.BuildPlayer();
		buildPlayerPage.PlayerLink(driver);

		//System.out.println(driver.getTitle());

		// Assert.assertEquals(driver.findElement(By.id("player-title")),
		// "ZahirssssPlayer");

	}

}
