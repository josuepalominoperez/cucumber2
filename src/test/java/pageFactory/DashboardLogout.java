package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardLogout {
	
	@FindBy(id="login")		
	WebElement btn_login;
	
	WebDriver driver;
	
	public DashboardLogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void IsbtnLoginPresent() {
		btn_login.isEnabled();
	}

}
