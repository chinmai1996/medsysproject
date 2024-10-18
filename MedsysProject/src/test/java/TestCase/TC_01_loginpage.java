package TestCase;

import org.testng.annotations.Test;

import Pageobjects.Login;
import TestBase.BaseClass;

public class TC_01_loginpage extends BaseClass {
	@Test(priority=1)
	public void setLogin() {
		Login l = new Login(driver);
		l.setUsername("shahajadalam@gmail.com");
		l.setPassword("w3s@1234");
		l.singin();
		
	}

}
