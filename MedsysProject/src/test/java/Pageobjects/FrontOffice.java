package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FrontOffice extends BasePagem {

	public FrontOffice(WebDriver driver) {
		super(driver);
	
	}
	@FindBy (xpath="//span[text()='Front Office']")
	WebElement btn_FrontOffice;
	
	@FindBy (xpath ="//a[@class='btn btn-primary btn-sm'][1]")
	WebElement btn_Addpatient;
	
	@FindBy (xpath="//input[@class='form-control datetime'][1]")
	WebElement txt_Date;

	@FindBy(id="input#patient_name")
	WebElement txt_Patientname;
	
	@FindBy(id ="input#phone")
	WebElement txt_phnnum;
	
	@FindBy(id="input#email")
	WebElement txt_mail;
	@FindBy(xpath="//select[@id='gender']")
	WebElement select_gender;
	
	@FindBy(xpath="//span[@id='select2-doctor-4e-container']")
	WebElement select_doctor;
	
	@FindBy(xpath="select#appointment_status")
	WebElement select_status;
	@FindBy(xpath="button#formaddbtn")
	WebElement btn_save;
	
	public void Frontoffice() {
		btn_FrontOffice.click();
		
	}
	public void Addappointments() {
		btn_Addpatient.click();
	}
	public void setDate(String date) {
		txt_Date.sendKeys("date");
	}
	public void setPatientname(String name) {
		txt_Patientname.sendKeys("name");
	}
	public void setPhnnum(String phnnum) {
		txt_phnnum.sendKeys("phnnum");
	}
	public void setEmail(String email) {
		txt_mail.sendKeys("email");
	}
	public void gender() {
		Select option =new Select(select_gender);
		option.selectByValue("Female");
	}
	public void doctor() {
		Select option = new Select(select_doctor);
		option.selectByIndex(2);
	}
	public void Status() {
		Select option = new Select(select_status);
		option.selectByValue("select_status");
				
	}
	public void save() {
		btn_save.click();
	}

	
	
	

}
