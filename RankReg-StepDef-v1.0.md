package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RANKautotest 
{
	
	WebDriver driver;
	
@Given("^Open chrome and start application$")
public void chrome() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rank-apollo.ui.uat.brilliantbasics.com/themes/dark/markup/templates/pages/join-now.shtml");
	
	
	}

@Given("^User is on stepone registration page$")
public void user_is_on_stepone_registration_page() throws Throwable {
    
   
}

@When("^User selects radio button \"([^\"]*)\"$")
public void user_selects_radio_button(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id='component_join-now']/div/form/p[2]/button[1]")).click();
	
   
}

@When("^User inserts email address \"([^\"]*)\"$")
public void user_inserts_email_address(String arg1) throws Throwable {
	driver.findElement(By.id("joinnow-email")).sendKeys("test1@test1.com");
   
}

@When("^\"([^\"]*)\" checkbox is selected$")
public void checkbox_is_selected(String arg1) throws Throwable {
	driver.findElement(By.id("joinnow-agree")).click(); 
	
}

@When("^User clicks cta \"([^\"]*)\"$")
public void user_clicks_cta(String arg1) throws Throwable {
	driver.findElement(By.xpath("//*[@id='component_join-now']/div/form/fieldset[2]/div/button")).click();
 

}

@Then("^User is taken to steptwo registration process$")
public void user_is_taken_to_steptwo_registration_process() throws Throwable {
    
   
}

@Given("^user fills \"([^\"]*)\"  with \"([^\"]*)\"$")
public void user_fills_with(String field, String input) throws Throwable {
	 
    driver.findElement(By.id(field)).sendKeys(input);

}

@When("^user clicks title \"([^\"]*)\" from radio buttons$")
public void user_clicks_title_from_radio_buttons(String Mr) throws Throwable {
    driver.findElement(By.xpath("//*[@id='component_join-now']/div/form/fieldset[2]/div/label[1]")).click();
   
}

@When("^user clicks on manual entry \"([^\"]*)\"$")
public void user_clicks_on_manual_entry(String manual) throws Throwable {

	driver.findElement(By.id("joinnow-title-miss"));
	
	
}

@Then("^user successfully registers$")
public void user_successfully_registers() throws Throwable {
    
   
}
}
