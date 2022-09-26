package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomeFacebookLogin_PF;
import pageFactory.Searching_PF;

public class SearchSteps {
	
	WebDriver driver=null;
	Searching_PF search;
	HomeFacebookLogin_PF home;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/Drivers/chromedriver");
		driver= new ChromeDriver();
		
		
	}
	
	@Given("I open the browser")
	public void i_open_the_browser() {
		driver.manage().window().maximize();
	}

	
	@When("I go to Google")
	public void i_go_to_google() {
		driver.get("https://www.google.com/");
	}

	
	@And("I type Facebook")
	public void i_type_facebook() {
		search= new Searching_PF(driver);
		search.enter_word();
	}
	
	@And("I hits Enter")
	public void i_hits_enter() {
		search.pressing_enter();
	}

	@Then("I verify the login page")
	public void i_verify_the_login_page() {
		home = new HomeFacebookLogin_PF(driver);
		home.mostrar_texto_facebook();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}
