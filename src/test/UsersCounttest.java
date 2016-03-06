package test;

import org.testng.annotations.Test;

import testBase.Base;

public class UsersCounttest extends Base {
	@Test
	public void CountingUsers() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		totalUserpage.UserProf();
		

	}
}