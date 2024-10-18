package TestCase;

import org.testng.annotations.Test;

import Pageobjects.Searchfrontoffice;
import TestBase.BaseClass;

public class Search extends BaseClass {
	@Test
	public void setSearch() {
		Searchfrontoffice sf = new Searchfrontoffice(driver);
		sf.FrontOffice();
		sf.Search("	APPNO86");
	}

}
