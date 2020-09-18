package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;
import Page.SignInPage;


public class TestBase {
	
	static WebDriver driver;
	static SignInPage sip;
	static HomePage hp;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qabird.slack.com");
	}
	
	public SignInPage getSignInPage() {
		sip=new SignInPage(driver);
		
		return sip;
	}
	
	public HomePage getHomePage() {
		hp=new HomePage(driver);
		
		return hp;
		
	}
	
	
	
}
