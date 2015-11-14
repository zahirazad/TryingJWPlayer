package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.BuildPlayerPage;
import pages.ContentPage;
import pages.ContentVideosviaUrl;
import pages.LogInPage;
import pages.MakingPlayerPage;
import pages.headerPage;

public class Base {
	public static WebDriver driver;
	public LogInPage logInPage;
	public BuildPlayerPage buildPlayerPage;
	public MakingPlayerPage makingPlayerPage1;
	public ContentPage contentvideoPage;
	public ContentVideosviaUrl contentvideoPageUrlTwo;
	public headerPage HeaderPage;

	@BeforeTest
	public void testSetup() {
		// System.setProperty("webdriver.chrome.driver",
		// "/path/to/chromedriver");

		// WebDriver driver = new ChromeDriver();

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.jwplayer.com/");
		logInPage = PageFactory.initElements(driver, LogInPage.class);
		buildPlayerPage = PageFactory.initElements(driver,
				BuildPlayerPage.class);
		makingPlayerPage1 = PageFactory.initElements(driver,
				MakingPlayerPage.class);
		contentvideoPage = PageFactory.initElements(driver, ContentPage.class);
		contentvideoPageUrlTwo = PageFactory.initElements(driver,
				ContentVideosviaUrl.class);
		HeaderPage = PageFactory.initElements(driver, headerPage.class);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
