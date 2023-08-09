package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.BaseClass;
import PageObjects.RegistrationAccount;

public class AccountRegistration extends BaseClass{
	@Test
	void Account_registration() {
		//logger.info("***Started AccountRegistration*** ");
		try {

		HomePage hp=new HomePage(driver);
		//logger.info("*** Clikcked on My Account ***");
		hp.click_register();
		
		RegistrationAccount ra=new RegistrationAccount(driver);
		//logger.info("Providing customer data");
		ra.firstname(randomString());
		ra.email(randomAlphaNumeric()+"gmial.com");
		ra.password(randomString());
		ra.mobile(randomNumbers());
		//ra.btn_expr();
		ra.btn_reg();
		//ra.captureScreen()
	    }catch(Exception e) {
	    	Assert.fail();
	    }
		
	}

}
