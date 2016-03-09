package test;

import org.testng.annotations.Test;

import testBase.Base;

public class MyAccountProfTest extends Base {
	@Test
	public void DesignProfile() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		myProfilePage.MyAccount();

	}
}