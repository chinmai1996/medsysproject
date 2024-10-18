package TestCase;

import org.testng.annotations.Test;

import Pageobjects.Searchfrontoffice;
import TestBase.BaseClass;

public class TC_03_Search extends BaseClass {
	@Test
	public void Search() {
		Searchfrontoffice sf = new Searchfrontoffice(driver);
		sf.FrontOffice();
		sf.Search("APPNO96");
		
		
	}

}
