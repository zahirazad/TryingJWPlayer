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
import pages.MyAccountProfilePage;
import pages.TitleAndTagPage;
import pages.UserscountPage;
import pages.headerPage;

public class Base {
	public static WebDriver driver;
	public LogInPage logInPage;
	public BuildPlayerPage buildPlayerPage;
	public MakingPlayerPage makingPlayerPage1;
	public ContentPage contentvideoPage;
	public ContentVideosviaUrl contentvideoPageUrlTwo;
	public headerPage HeaderPage;
	public TitleAndTagPage titleAndtagPage;
	public MyAccountProfilePage myProfilePage;
	public UserscountPage totalUserpage;

	@BeforeTest
	public void testSetup() {

		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+ "\\lib\\chromedriver.exe");
		// driver = new ChromeDriver();
		// System.out.println("its chromeDriver");
		// System.setProperty("webdriver.chrome.driver",
		// "/path/to/chromedriver");

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
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
		titleAndtagPage = PageFactory.initElements(driver,
				TitleAndTagPage.class);
		myProfilePage = PageFactory.initElements(driver,
				MyAccountProfilePage.class);
		totalUserpage = PageFactory.initElements(driver, UserscountPage.class);

	}

	@AfterTest
	public void tearDown() {
		//driver.close();
		// driver.quit();
	}
}
