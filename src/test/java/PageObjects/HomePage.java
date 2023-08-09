package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//elements
	@FindBy(id="register_Layer")
	WebElement clickregister;
	
	//action
	public void click_register() {
		clickregister.click();
	}

}
