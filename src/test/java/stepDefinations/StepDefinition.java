package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public  class StepDefinition {
	
	@Given("^User is on landing page$")
	public void User_is_on_landing_page()
	{
		System.out.println("helloo");
		//throw new cucumber.api.PendingException();
	}
		
	@When("^User login to applicaton with username and password$")
	public void User_login_to_applicaton_with_username_and_password()
	{
		System.out.println("hello");
		//throw new cucumber.api.PendingException();
	}
	@Then("^Home page is populated$")
	public void Home_page_is_populated()
	{
		System.out.println("helloo");
		//throw new cucumber.api.PendingException();
	}
	@And("^Homepage displayed$")
	public void Homepage_displayed()
	{
		System.out.println("helloo");
		//throw new cucumber.api.PendingException();
	} 
	

}
