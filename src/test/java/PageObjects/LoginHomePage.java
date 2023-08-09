package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LoginHomePage extends BasePage {
	
	public LoginHomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@title='Jobseeker Login']")
	WebElement click_login;
	
	public void click_login_button() {
		click_login.click();
	}

}
