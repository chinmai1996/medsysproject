package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Reports extends BasePagem{

	public Reports(WebDriver driver) {
		super(driver);
	}
@FindBy (xpath="//span[text()='Reports']")
WebElement txt_reports;

@FindBy (xpath="//a[text()=' Appointment Report']")
WebElement navi_Appointments;

@FindBy (xpath="//select[@name='search_type']")
WebElement SearchType;

@FindBy (xpath="//span[@id='select2-doctor-wp-container']")
WebElement Doctordrpdwn;

public void Reports() {
	txt_reports.click();
}
public void AppointmentReports() {
	navi_Appointments.click();
}
public  void SearchType() {
	Select s = new Select(SearchType);

}
public void Doctordrpdwn() {
Select s = new Select(Doctordrpdwn);
}




	}
	
	


