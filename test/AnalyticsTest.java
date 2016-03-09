package test;

import org.testng.annotations.Test;

import testBase.Base;

public class AnalyticsTest extends Base {
	@Test
	public void tesingAnalyticalPgae() {
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		analyticsPage.AnalyticsLink.click();

	}
}