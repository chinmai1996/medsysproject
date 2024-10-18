package TestCase;

import org.testng.annotations.Test;

import Pageobjects.FrontOffice;
import TestBase.BaseClass;

public class TC_02_FrontOffice extends BaseClass{
	@Test(priority=2)
	public void setFrontoffice() {
	FrontOffice f =new FrontOffice(driver);
	f.Frontoffice();
	f.Addappointments();
	f.setDate("08/10/2024");
	f.setPatientname("rahana");
	f.setPhnnum("8970954455");
	f.setEmail("rahanal1234@gmail.com");
	f.gender();
	f.doctor();
	f.Status();
	f.save();
	

}
}