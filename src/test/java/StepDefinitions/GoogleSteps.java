package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	
	WebDriver driver = null;
	
	@Given("I have opened the browser")
	public void i_have_opened_the_browser() {
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/Drivers/chromedriver");
		driver= new ChromeDriver();
		
	    
	}

	@And("go to google")
	public void go_to_google() {
		driver.get("https://google.com");
	    
	}

	@When("I type Facebook")
	public void i_type_facebook() {
		driver.findElement(By.name("q")).sendKeys("Facebook");
	    
	}

	@And("hits Enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	}

	@Then("I click in Facebook page")
	public void i_click_in_facebook_page() {
	    driver.findElement(By.partialLinkText("Facebook - Inicia sesión o regístrate")).click();
	}

}
