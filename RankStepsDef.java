import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RankStepsDef {

	WebDriver driver;
	int browserRep;

	@Given("^User is prompted to enter a corresponding number for browser$")
	public void userChoosesBrowser() throws Throwable {

		System.out.println("1. Firefox Browser");
		System.out.println("2. Chrome Browser");
		System.out.println("3. IE Browser");
		System.out.println("4. Opera Browser");
		System.out.print("Which browser would you like to run? Choose 1 to 4: ");
		Scanner browserNo = new Scanner(System.in);
		browserRep = browserNo.nextInt();
		browserNo.close();

	}

	@Then("^The WebDriver is set for the chosen browser for test to run on$")
	public void browserAssigned() throws Throwable {

		try {
			switch (browserRep) {
			case 1:
				if (browserRep == 1) {
					System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\geckodriver.exe");
					ProfilesIni profiles = new ProfilesIni();
					System.setProperty("webdriver.firefox.profile", "seleniumFF");
					String browser_profile = System.getProperty("webdriver.firefox.profile");
					FirefoxProfile profile = profiles.getProfile(browser_profile);
					profile.setAcceptUntrustedCertificates(true);
					driver = new FirefoxDriver(profile);
					System.out.print("Browser chosen is: Firefox");
					break;
				}
			case 2:
				if (browserRep == 2) {
					System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\chromedriver.exe");
					driver = new ChromeDriver();
					System.out.print("Browser chosen is: Chrome");
					break;
				}

			case 3:
				if (browserRep == 3) {
					System.setProperty("webdriver.ie.driver", "D:\\Automation Testing\\MicrosoftWebDriver.exe");
					driver = new InternetExplorerDriver();
					System.out.print("Browser chosen is: Internet Explorer");
					break;
				}

			case 4:
				if (browserRep == 4) {
					System.setProperty("webdriver.opera.driver", "D:\\Automation Testing\\chromedriver.exe");
					driver = new OperaDriver();
					System.out.print("Browser chosen is: Opera");
					break;
				}

			default:
				System.setProperty("webdriver.gecko.driver", "D:\\Automation Testing\\geckodriver.exe");
				ProfilesIni profiles = new ProfilesIni();
				System.setProperty("webdriver.firefox.profile", "seleniumFF");
				String browser_profile = System.getProperty("webdriver.firefox.profile");
				FirefoxProfile profile = profiles.getProfile(browser_profile);
				profile.setAcceptUntrustedCertificates(true);
				driver = new FirefoxDriver(profile);
				break;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Please insert a valid number.");
		}

	}

	@Given("^I navigate to login page of staging environment$")
	public void getStagingPageOpen() throws Throwable {
		Thread.sleep(2000);
		driver.navigate().to("http://qa02-gros-cms.rankgrouptech.net/register");
	}

	@When("^User given loginChoice YES or NO$")
	public void loginChoiceYesNo() throws Throwable {
		driver.findElement(By.linkText("No")).click();
	}

	@When("^If YES or NO User fills in their email address \"([^\"]*)\"$")
	public void userEmailEntered(String email) throws Throwable {
		driver.findElement(By.id("joinnow-email")).sendKeys(email);
	}

	@Then("^If YES User clicks Next button and is taken to StepOne of registration page$")
	public void if_YES_User_clicks_Next_button_and_is_taken_to_StepOne_of_registration_page() throws Throwable {
		if (driver.findElement(By.id("joinnow-agree")).isSelected()) {
			driver.findElement(By.className("btn-login")).click();
		}
	}

	@Then("^If NO user fills in password to login$")
	public void if_NO_user_fills_in_password_to_login() throws Throwable {

	}

	@Given("^User populates relevant textbox \"([^\"]*)\" with their personal data \"([^\"]*)\"$")
	public void populateAllTextFields(String textbox_name, String personal_data) throws Throwable {
		driver.findElement(By.id(textbox_name)).sendKeys(personal_data);
	}

	@Then("^User can proceed to Membership Options$")
	public void user_can_proceed_to_Membership_Options() throws Throwable {

	}
	

}