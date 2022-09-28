package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardHome1 {

	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement btn_logout;
	
	WebDriver driver;
	
	public DashboardHome1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clicking_logout_button() {
		btn_logout.click();
	}
}
