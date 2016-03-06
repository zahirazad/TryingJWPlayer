
package test;

import org.testng.annotations.Test;

import testBase.Base;

public class SupportTest extends Base{
	@Test
	public void SupportingTestLink(){
		logInPage.signIN("Azadzahir@yahoo.com", "Sojib8989");
		supportPage.SupportLink.click();
	}

}
