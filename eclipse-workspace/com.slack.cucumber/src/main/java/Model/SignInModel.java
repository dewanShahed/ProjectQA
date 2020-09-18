package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInModel extends ModelBase{
	public SignInModel(WebDriver d) {
		super(d);
	}
	public WebElement getSlackEmail() {
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		return mail;
	}
	public WebElement getSlackPass() {
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		return pass;
	}
	public WebElement getLogIn() {
		WebElement clickIn=driver.findElement(By.xpath("//*[@id='signin_btn']"));
		return clickIn;
	}
	
	public WebElement clickTotheIcon() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='p-top_nav__right']/button/div/span")));
		WebElement back=driver.findElement(By.xpath("//*[@class='p-top_nav__right']/button/div/span"));
		return back;
	}
	
	
}



