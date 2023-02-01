package AdminModule;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import repoElements.Admin_Home_Page;
import repoElements.Admin_Home_PageElements;
import repoElements.HomePageElements;

public class TC_009_Admin {
	@Test

	public void PatientprofileUpdate() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait expliciteWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://elftestingserver/domain/Hospital_Management_System/");
		String welcomePage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(welcomePage, "Hospital Management System", "Welcome page is not displayed");
		Reporter.log("welcomePage id Displayed", true);

		HomePageElements HomePageEl = new HomePageElements(driver);
		HomePageEl.getAdminModuleHomePage().click();
		HomePageEl.getUserNameElement().sendKeys("admin");
		HomePageEl.getPassWordEelement().sendKeys("Test@12345");
		HomePageEl.getLoginButton().click();
		sa.assertEquals(driver.getTitle(), "Admin-Login", "Admin Login Page is not Displayed ");
		Reporter.log("Admin Login Page is Displayed", true);
		
		HomePageEl.getTotaluserButton().clear();
		HomePageEl.getRemoveButton().clear();
		HomePageEl.getRemoveButton().click();
		Alert ActualMessage = driver.switchTo().alert();
		ActualMessage.accept();
		

		
//		AdminHomePage.getPassWordEelement().sendKeys("Test@12345");
//		AdminHomePage.getPassWordEelement().click();

	}
}