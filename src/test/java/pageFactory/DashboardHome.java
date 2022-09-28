package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardHome {

	@FindBy(id="userName-label")
	WebElement txt_books;
	
	WebDriver driver;
	
	public DashboardHome(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void IsTextBooksPresent() {
		txt_books.isDisplayed();
	}
}
