package test;

import org.testng.annotations.Test;

import testBase.Base;

public class LogInTest extends Base {
	@Test
	public void testLogin() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

	}

}
