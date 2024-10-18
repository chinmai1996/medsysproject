package TestCase;

import org.testng.annotations.Test;

import Pageobjects.Reports;
import TestBase.BaseClass;


public class TC_04_Reports extends BaseClass {
	@Test
	public void setReports() {
		Reports r = new Reports(driver);
		r.Reports();
		r.AppointmentReports();
		r.SearchType();
		r.Doctordrpdwn();
	}

}
