package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationAccount extends BasePage{
	//Constructor

	public RegistrationAccount(WebDriver driver) {
		super(driver);
	}
	//elements
	@FindBy(id="name")
	WebElement txt_fname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txt_email;
	
	@FindBy(id="password")
	WebElement txt_pasword;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement txt_mobile;
	
	/*@FindBy(css="div[class='focusable optionWrap selected '] h2[class='main-3']")
	WebElement click_exp_btn;*/
	
	@FindBy(css="button[type='submit']")
	WebElement click_regis;
	
	//actions
	public void firstname(String fname) {
		txt_fname.sendKeys(fname);
	}
	
	public void email(String email) {
		txt_email.sendKeys(email);
	}
	
	public void password(String pwd) {
		txt_pasword.sendKeys(pwd);
	}
	
	public void mobile(String mobileno) {
		txt_mobile.sendKeys(mobileno);
	}
	/*public void btn_expr() {
		click_exp_btn.click();
	}*/
	public void btn_reg() {
		click_regis.click();
	}
	

}
