package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.DashboardBookstoreData;
import pageFactory.DashboardHome;
import pageFactory.DashboardHome1;
import pageFactory.DashboardHome2;
import pageFactory.DashboardLogin;
import pageFactory.DashboardLogout;

public class DashboardSteps {
	
	WebDriver driver=null;
	DashboardHome home;
	DashboardHome1 home1;
	DashboardHome2 home2;
	DashboardLogin login;
	DashboardLogout logout;
	DashboardBookstoreData bookstore;
	
	
	@Given("I go to the login page")
	public void i_go_to_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/login");
	}

	@When("I type username and password")
	public void i_type_username_and_password() {
		login= new DashboardLogin(driver);
		login.enterUsername("aa");
		login.enterPassword("00000000Aa@");
	}

	@And("I click login button")
	public void i_click_login_button() {
		login.clickLogin();
		driver.manage().window().fullscreen();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		System.out.println("Estamos logeados");
	}

	@And("I verify successful login")
	public void i_verify_successful_login() {
		home = new DashboardHome(driver);
		home.IsTextBooksPresent();
	}


	@And("I click Bookstore data button")
	public void i_click_bookstore_data_button() {
		home2= new DashboardHome2(driver);
		home2.clicking_bookstore_button();
	}

	@Then("I visualize all books")
	public void i_visualize_all_books() {
		bookstore = new DashboardBookstoreData(driver);
		bookstore.IsTextImagePresent();
	}

}
