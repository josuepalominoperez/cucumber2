package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null;
	
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
	    driver.findElement(By.id("userName")).sendKeys(username);
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(3000);
	}

	@And("I clic Login button")
	public void i_clic_login_button() {
	    driver.findElement(By.id("login")).click();
	}

	@Then("I verify the successful login")
	public void i_verify_the_successful_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
	}


}
