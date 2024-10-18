package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchfrontoffice extends BasePagem {

	public Searchfrontoffice(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath="//span[text()='Front Office']")
	WebElement txt_FrontOffice;
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Serach;
	
	public void FrontOffice() {
		txt_FrontOffice.click();
	}
	
	public void Search( String Appointmentno) {
		Serach.sendKeys("Appointmentno");
	}
	

}
