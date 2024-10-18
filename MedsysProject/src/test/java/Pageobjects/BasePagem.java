package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePagem {
	public static WebDriver driver;
	 
	public BasePagem(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

}
