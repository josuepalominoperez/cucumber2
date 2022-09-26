package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFacebookLogin_PF {
	
	@FindBy(partialLinkText = "Facebook - Inicia sesión o regístrate")
	WebElement txt_Facebook;
	
	WebDriver driver;
	
	public HomeFacebookLogin_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void mostrar_texto_facebook() {
		txt_Facebook.isDisplayed();
	}

}
