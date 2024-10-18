package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestBase.BaseClass;

public class Login extends BasePagem {

	public Login(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath="//input[@name='username'] ")
	WebElement txt_username;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement btn_singin;
	
	public void setUsername(String username){
		txt_username.sendKeys("username");
		
		}
	public void setPassword(String password) {
		txt_password.sendKeys("password");
	}
	public void singin() {
		 btn_singin.click();
	}
	

	}


