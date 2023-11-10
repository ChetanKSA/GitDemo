package stepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {

	@Given("setup entries in DB")
	public void setup_entries_in_db() {
	    System.out.println("setup db data");
	}
	@When("user wnat to launch browser from config variables")
	public void user_wnat_to_launch_browser_from_config_variables() {
	  System.out.println("set config variables");
	}
	@Then("enter url of the website")
	public void enter_url_of_the_website() {
	   System.out.println("website url is hit");
	   System.out.println("****************************************************");
	}
	
	
	@Given("User is on NetBank Landing page")
	public void user_is_on_net_bank_landing_page() {
	    System.out.println("user landed on home page");
	}
	
	@Given("User is on SignUp Landing page")
	public void user_is_on_sign_up_landing_page() {
	   System.out.println("user lands on signup page=========================================");
	}
	
	@When("User enter details to sign up application")
	public void user_enter_details_to_sign_up_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		//System.out.println(data.get(3));
	    System.out.println(" all fields entered");
	}
	
	
	@When("User login to application with username {string} and password {string}")
	public void user_login_to_application_with_username_and_password(String username, String password) 
	{
	 System.out.println("logged into application with admin or user access =" + username+"  " + password); 
	}
	
	@When("^User login to application with username (.+) and password (.+) combination$")
	public void user_login_to_application_with_username_and_password_combination(String uname, String pword) {
	    System.out.println("username used ="+uname+"   anfd password used is ="+pword);
	}
	
	
	@Then("click on Signup")
	public void click_on_signup() {
	   System.out.println("clicked on signup");
	}
	
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println(" home page displayed");
	}
	@Then("Cards info are displayed")
	public void cards_info_are_displayed() 
	{
		System.out.println("cards info displayed");
	}
}
