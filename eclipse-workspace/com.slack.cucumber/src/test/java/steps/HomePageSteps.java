package steps;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {

@Given("^I want validate existing channel$")
public void i_want_validate_existing_channel() throws Throwable {
	getHomePage();
	
}

@When("^create a channel \"([^\"]*)\" in homePage$")
public void create_a_channel_in_homePage(String arg1) throws Throwable {
	  hp.goToChannels();
		
		
		 //Channel Validation	
		
	hp.allChannels(arg1);
	hp.isPresent(arg1);
   
}

@Then("^I verify the \"([^\"]*)\" in channels$")
public void i_verify_the_in_channels(String arg1) throws Throwable {
	String orginal=hp.userValidation();
	Assert.assertEquals(orginal,"dewan_shahed");
	 boolean existingChannel=hp.isPresent(arg1); 
	 Assert.assertFalse(existingChannel);
  }


}
