package Datadriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcasemedsys {
	public static WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://healthcare.w3testing.com/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    @Test
    
	public void Login() throws IOException {
		String file=System.getProperty("user.dir")+"/TestDatamedsys/MedsyData.xlsx";
		//get num of rows
		int rows=Utils.getRowCount(file,"");
		
		for(int r=0;r<=rows;r++) {
			//read
			String username=Utils.getCellData(file, "Sheet2", r, 0);
			String password=Utils.getCellData(file, "Sheet2", r, 1);
			//pass to webpage
			driver.findElement(By.xpath("//input[@class='form-username form-control']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@class='form-password form-control']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			//validation
			String exp="driver.getTitle";
			String act="Medsys";
			if(act.equals(exp)) {
				System.out.println("Test  is passed");
				Utils.setCellData(file, "Sheet2", r, 2, "Pass");
				Utils.fillGreenColour(file, "Sheet2", r, 2);
				//logout
				driver.findElement(By.className("//img[@class='topuser-image']")).click();
				driver.findElement(By.xpath("//a[@href='https://healthcare.w3testing.com/site/logout']")).click();
			}else {
				System.out.println("Test is failed");
				Utils.setCellData(file, "Sheet2", r, 2, "Fail");
				Utils.fillRedColour(file, "Sheet2", r, 2);
			}

	    }
	 }
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
