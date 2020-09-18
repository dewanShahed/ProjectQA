package steps;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SignInSteps extends TestBase {

@Given("^I am in slack login page$")
public void i_am_in_slack_login_page() throws Throwable {
	
	TestBase.initialization();
 }

@When("^I want enter \"([^\"]*)\" and \"([^\"]*)\" and click signin button$")
public void i_want_enter_and_and_click_signin_button(String arg1, String arg2) throws Throwable {
	getSignInPage();
	sip.enterSlackEmail(arg1);
	sip.enterSlackPass(arg2);
	
	}

@When("^click the iconProfile$")
public void click_the_iconProfile() throws Throwable {
	sip.SlackLogIn();
	sip.clickProfile();
}

@Then("^I verify the \"([^\"]*)\" in step$")
public void i_verify_the_in_step(String arg1) throws Throwable {
	
	getHomePage();	
	String actual=hp.userValidation();
	Assert.assertEquals(arg1, actual);
}}


