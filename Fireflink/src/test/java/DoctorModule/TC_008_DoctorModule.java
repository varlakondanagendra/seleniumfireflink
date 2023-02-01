package DoctorModule;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import repoElements.Doctors_Home_Page;
import repoElements.HomePageElements;
import repoElements.UserEditProfilePage;

public class TC_008_DoctorModule {
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
		HomePageEl.getDoctorModuleHomePage().click();
		sa.assertEquals(driver.getTitle(), "Doctor Login", "Doctor Login Page is not Displayed ");
		Reporter.log("Doctor Login Page is Displayed", true);

		Doctors_Home_Page DoctorHomePag = new Doctors_Home_Page(driver);
		DoctorHomePag.getUserNameElement().sendKeys("test@demo.com");
		DoctorHomePag.getPassWordEelement().sendKeys("Test@123");
		DoctorHomePag.getLoginButton().click();
		sa.assertEquals(driver.getTitle(), "Doctor | Dashboard", "Doctor dashboard Page is not Displayed ");
		Reporter.log("Doctor dashboard Page is Displayed", true);

		DoctorHomePag.getSearchPatient().click();
		DoctorHomePag.getSearchByEnteringName().sendKeys("Nagendra",Keys.ENTER);
		sa.assertEquals(driver.getTitle(), "Doctor | Manage Patients", "Manage Patient Page is not Displayed ");
		Reporter.log("Manage Patient Page is Displayed", true);

		DoctorHomePag.getViewDetailsbutton().click();
		sa.assertEquals(driver.getTitle(), "Doctor | Manage Patients", "Manage Patient Page is not Displayed ");
		Reporter.log("Manage Patient Page is Displayed", true);
			
		UserEditProfilePage Editpage = new UserEditProfilePage(driver);
		Editpage.getProfileButton().click();
		Editpage.getLogoutButton().click();
		sa.assertEquals(welcomePage, "Hospital Management System", "Welcome page is not displayed");
		Reporter.log("Welcome Page is Displayed", true);
		driver.quit();
		sa.assertAll();

	}
}
