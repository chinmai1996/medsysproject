package TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void Setup() {
		driver= new ChromeDriver();
		driver.get("https://healthcare.w3testing.com/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	public String captureScreenshot() throws IOException {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String destination= System.getProperty("user.dir")+"\\Screenshot\\"+timestamp+".png";
		Files.copy(source,new File(destination));
	
		return destination;
		
	}


}
