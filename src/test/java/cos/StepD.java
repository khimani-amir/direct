package cos;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepD {
	
	WebDriver driver;
	Home H = new Home();
	

	@Before 
	public void start()
	{
		H.go();
	}
	
	@After
	public void stop()
	{
		H.end();
	}
	
	@Given("^User is on Tesco Direct Home Page$")
	public void user_is_on_Tesco_Direct_Home_Page() throws Throwable {
	    
		
	}

	@When("^User tries to login with Username \"(.*?)\" and Password \"(.*?)\"$")
	public void user_tries_to_login_with_Username_and_Password(String arg1, String arg2) throws Throwable {
	    
		H.Username().sendKeys(arg1);
		System.out.println("Type Email - "+ arg1);
		H.Password().sendKeys(arg2);
		System.out.println("Type Pass - "+ arg2);
		H.Login().click();
		System.out.println("Select Login Button");
		System.out.println("User Profile Online");
	}

	@Then("^User can see the profile page with sign out option$")
	public void user_can_see_the_profile_page_with_sign_out_option() throws Throwable {
	  
	}
	
}
