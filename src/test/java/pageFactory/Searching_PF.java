package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searching_PF {
	
	@FindBy(name="q")
	WebElement txt_input_busqueda;
	
	@FindBy(name="q")
	WebElement enter_pressing;
	
	WebDriver driver;
	
	public Searching_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_word() {
		txt_input_busqueda.sendKeys("Facebook");
	}
	
	public void pressing_enter() {
		enter_pressing.sendKeys(Keys.ENTER);
	}

}
