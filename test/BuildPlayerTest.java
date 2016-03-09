package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.Base;

@SuppressWarnings("unused")
public class BuildPlayerTest extends Base {
	@Test
	public void testDesignPlayer() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		buildPlayerPage.BuildPlayer();

		System.out.println(driver.getTitle());

		//Assert.assertEquals(driver.findElement(By.id("player-title")),"ZahirssssPlayer");
		 

	}

}
