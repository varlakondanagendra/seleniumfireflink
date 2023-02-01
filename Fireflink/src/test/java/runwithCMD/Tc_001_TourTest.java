package runwithCMD;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Tc_001_TourTest {
	
	
	@Parameters
	@Test
	public void readTheDataFromXML(@Optional("opera")String bName)
	{
		WebDriver driver = null;
		if (bName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			Reporter.log("please pass a valid browser name", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.kstdc.co/");
	}

}
