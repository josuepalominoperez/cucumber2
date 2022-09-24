package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeLogin_PF {
	
	@FindBy(id="submit")
	WebElement btn_logout;
	
	WebDriver driver;
	public homeLogin_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkLogoutisDisplayed() {
	btn_logout.isDisplayed();
	}
	
	

}
