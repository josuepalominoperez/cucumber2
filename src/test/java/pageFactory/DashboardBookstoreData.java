package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardBookstoreData {
	
	@FindBy(partialLinkText = "image")
	WebElement txt_image;
	
	WebDriver driver;
	
	public DashboardBookstoreData(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void IsTextImagePresent() {
		txt_image.isDisplayed();
	}

}
