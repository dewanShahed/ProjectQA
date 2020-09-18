package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.SignInModel;

public class SignInPage extends SignInModel {
	public SignInPage(WebDriver d) {
		super(d);
	}
	public void enterSlackEmail(String mail) {
		WebElement enterMail=getSlackEmail();
		enterMail.sendKeys(mail);
	}
	public void enterSlackPass(String pass) {
		WebElement enterPass=getSlackPass();
		enterPass.sendKeys(pass);
	}
	public void SlackLogIn() {
		WebElement logIn=getLogIn();
		logIn.click();
	}	
	public void clickProfile() {
		WebElement returnI=clickTotheIcon();
		returnI.click();	
	}
	
}


