package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.Base;

public class AssertionsTest extends Base {
	@Test
	public void VarifyingTenPlayersEachPageTest() {
		
		driver.findElement(By.id("Players")).click();
		List<WebElement> myList = driver.findElements(By.xpath("//a[@class='name ng-binding ng-scope']"));
		System.out.println(myList.size());
		Assert.assertEquals(myList.size(), 10);

		
		 /* for(int i = 0; i < myList.size(); i++){
			  if(myList.get(i).getText() =="saifulBhai"){
				  String actual = myList.get(i).getText();
		  System.out.println(myList.get(i).getText());
		  Assert.assertEquals(actual,"saifulBhai"); } }
		 
*/
	}

}
