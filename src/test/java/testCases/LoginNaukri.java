package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;
import PageObjects.LoginHomePage;
import PageObjects.LoginPage;
public class LoginNaukri extends BaseClass{
	
	@Test
	void login() {
		try {
			LoginHomePage lhp=new LoginHomePage(driver);
			lhp.click_login_button();
			
			LoginPage lp=new LoginPage(driver);
			lp.username("dsvalli88@gmail.com");
			lp.password("Akhil@2015");
			lp.loginbutton();
			lp.validateprofile();
			lp.viewprofile();
		}catch(Exception e) {
			Assert.fail();
		}
	}

}
