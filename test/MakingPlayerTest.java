package test;

import org.testng.annotations.Test;

import testBase.Base;

public class MakingPlayerTest extends Base {
	@Test
	public void MakingPlayer() {
		logInPage.signIN("azadzahir@yahoo.com", "Sojib8989");
		makingPlayerPage1.makingPlayerSetup();
	}

}
