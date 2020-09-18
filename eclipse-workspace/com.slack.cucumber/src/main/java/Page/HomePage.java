package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver d) {
		super(d);	
	}
	//User Name Validation
		public String userValidation() {
			WebElement  mail= getUserValidation();
			String email=mail.getText();
			System.out.println(email);
			return email;		
	}
		//creating channel
	public void goToChannels() {
		WebElement anywere=clickOnChannels();
		act.moveToElement(anywere).click().build().perform();
	}
	//creating channel
	public void allChannels(String Channel) {
	if(!isPresent(Channel)) {
		WebElement Channelall=goGetChannels();	
		Channelall.click();
		WebElement addOn=goAddChannels();
		addOn.click();
		WebElement create=goCreateChannel();
		create.click();
	}}
	// channel V
	public boolean isPresent(String channel) {
		boolean result=false;
		List<WebElement>all=getAllchannel();
		for(WebElement e:all) {
			String c=e.getText();
			if(c.equals(channel)) {
				System.out.println("There is no channel");
				result=true;

				break;	
			}
		}
		return result;
	}
	public void rightClick() {
	    WebElement getClick=contextClickButton();
	    act.moveToElement(getClick).build().perform();
		act.contextClick(getClick).build().perform();
	}}




