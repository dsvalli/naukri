package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement txt_password;
	@FindBy(css="button[type='submit']")
	WebElement btn_login;
	@FindBy(xpath="//div[@title='Dama Srivalli']")
	WebElement profile_name;
	@FindBy(xpath="//a[normalize-space()='View profile']")
	WebElement View_Profile;
	public void username(String uname) {
		txt_username.clear();
		txt_username.sendKeys(uname);
	}
	public void password(String pwd) {
		txt_password.clear();
		txt_password.sendKeys(pwd);
	}
	public void loginbutton() {
		btn_login.click();
	}
	public void validateprofile() {
		String name=profile_name.getText();
		Assert.assertEquals(name, "Dama Srivalli");
	}
	public void viewprofile() {
		View_Profile.click();
	}

}
