package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar extends BasePagem {

	public Calendar(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="//h3[text()='Calendar']")
	WebElement txt_Calendar;
	
	@FindBy (xpath="//h2[text()='October 2024']")
	WebElement txt_year;
	@FindBy (xpath="")

}
