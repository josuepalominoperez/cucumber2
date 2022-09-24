package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginSteps_POM {
	
/*	WebDriver driver = null;
	loginPage login;
	
	@Given("I open the browser")
	public void i_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/Drivers/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@When("I got to DemoQAWebLoginPage")
	public void i_got_to_demo_qa_web_login_page() {
		
		driver.get("https://demoqa.com/login");
	    
	}

	@And("^I enter (.*) and (.*)$")
	public void i_enter_username_and_password(String username , String password) throws InterruptedException {
		login = new loginPage(driver);
		login.enterUsername(username);
		Thread.sleep(3000);
		login.enterPassword(password);
		Thread.sleep(3000);
		
	}

	@And("I clic Login button")
	public void i_clic_login_button() {
	    login.clickLogin();
	}

	@Then("I verify the successful login")
	public void i_verify_the_successful_login() throws InterruptedException {
		Thread.sleep(3000);
		login.checkLogoutIsDisplayed();
		driver.quit();
	}
*/

}
