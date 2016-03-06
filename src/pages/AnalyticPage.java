package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnalyticPage {
	@FindBy(id = "Analytics")
	public WebElement AnalyticsLink;
	@FindBy(xpath = "//*[@id='app_body']/div[5]/div/div/button")
	public WebElement ClosingthepopUpWindow;
	@FindBy(xpath="//*[@id='fouc']/div[5]/div[1]/div/div/div[2]/div/div[2]/div[1]/div/div[2]/ul/li[4]/button")
	public WebElement Exportingdata;
	@FindBy(xpath="	.//*[@id='app_body']/div[5]/div/div/div/div[1]/h3")
	public WebElement dataOverview;
	
}
