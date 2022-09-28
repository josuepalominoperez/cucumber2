package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardHome2 {

	@FindBy(id="gotoStore")
	WebElement btn_bookstore;
	
	WebDriver driver;
	
	public DashboardHome2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicking_bookstore_button() {
		btn_bookstore.click();
	}
}
