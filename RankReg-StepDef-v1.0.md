package com.rankcucumber.MavenCucumberPrototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	
	WebDriver driver;
	
	@Given("^Open chrome and start application$")
	public void Chrome() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rank-apollo.ui.uat.brilliantbasics.com/themes/dark/markup/templates/global/logged-out.shtml");
		
		}
	
	/*
	@Given("^User navigates to staging environment$")
	public void user_navigates_to_staging_environment() throws Throwable {
	   
	    
	}

	@When("^User inserts username \"([^\"]*)\"$")
	public void user_inserts_username(String username) throws Throwable {
		
		
	    
	}

	@When("^User inserts passwords \"([^\"]*)\"$")
	public void user_inserts_passwords(String password) throws Throwable {
		
		
	}

	@Then("^User is signed into staging gateway$")
	public void user_is_signed_into_staging_gateway() throws Throwable {
	   
	    
	}
*/
	
	
	@Given("^User is on stepone registration page$")
	public void user_is_on_stepone_registration_page() throws Throwable {
	   
	    
	}

	@When("^User selects radio button \"([^\"]*)\"$")
	public void user_selects_radio_button(String Yes) throws Throwable {
	   
		driver.findElement(By.xpath("//*[@id='component_join-now']")).click();
	    
	}

	@When("^User inserts email address \"([^\"]*)\"$")
	public void emailaddress(String email) throws Throwable {
	   
		driver.findElement(By.id("joinnow-email")).sendKeys("test1@test1.com");
	
	    
	}
	@When("^\"([^\"]*)\" checkbox is selected$")
	public void checkbox(String tandc) throws Throwable {
		
		driver.findElement(By.id("joinnow-agree")).click();
	}
	
	
	@When("^User clicks cta \"([^\"]*)\"$")
	public void nextcta(String next) throws Throwable {
	   
		driver.findElement(By.xpath("//*[@id='component_join-now']")).click();
		
		
	}


	@Then("^User is taken to steptwo registration process$")
	public void user_is_taken_to_steptwo_registration_process() throws Throwable {
	   
	    
	}

	@Given("^user fills \"([^\"]*)\"  with \"([^\"]*)\"$")
	public void user_fills_with(String arg1, String arg2) throws Throwable {
	   
	    
	}

	@When("^user clicks \"([^\"]*)\" from radio buttons$")
	public void user_clicks_from_radio_buttons(String arg1) throws Throwable {
	   
	    
	}

	@Then("^user successfully registers$")
	public void user_successfully_registers() throws Throwable {
	   
	    
	}

	@Given("^user clicks \"([^\"]*)\" to set up a deposit$")
	public void user_clicks_to_set_up_a_deposit(String arg1) throws Throwable {
	   
	    
	}

	@When("^user \"([^\"]*)\" optIn checkboxs$")
	public void user_optIn_checkboxs(String arg1) throws Throwable {
	   
	    
	}

	@When("^user clicks Register cta$")
	public void user_clicks_Register_cta() throws Throwable {
	   
	    
	}

	@Then("^user is taken to stepthree registration process$")
	public void user_is_taken_to_stepthree_registration_process() throws Throwable {
	   
	    
	}
}
