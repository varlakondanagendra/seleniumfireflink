package patientModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import repoElements.BookAppointmentElementPage;
import repoElements.HomePageElements;
import repoElements.PatientAppointmentHistory;
import repoElements.PatientLogInPage;
import repoElements.PatientUserDashBoxPage;
import repoElements.UserEditProfilePage;

public class TC_003_PatientModule {
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
		HomePageEl.getPatientModuleHomePage().click();
		String login = driver.getTitle();
		sa.assertEquals(login, "User-Login", "User Login Page is not Displayed ");
		Reporter.log("User Login Page is Displayed", true);

		PatientLogInPage loginPage = new PatientLogInPage(driver);
		loginPage.getUserNameTextFeild().sendKeys("test@gmail.com");
		loginPage.getPasswordTextFeild().sendKeys("Test@123");
		loginPage.getLogINButton().click();
		String dasBoard = driver.getTitle();
		sa.assertEquals(dasBoard, "User | Dashboard", "User Dashboard Page is not Displayed ");
		Reporter.log("User DashBoard Page is Displayed", true);

		PatientUserDashBoxPage HomeDashBoard = new PatientUserDashBoxPage(driver);
		HomeDashBoard.getMyAppointment().click();
		String MyAppointmentPage = driver.getTitle();
		sa.assertEquals(MyAppointmentPage, "User | Appointment History",
				"User Appointment history Page is not Displayed ");
		Reporter.log("User Appointment History Page is Displayed", true);

		PatientAppointmentHistory Appointhistory = new PatientAppointmentHistory(driver);
		Appointhistory.getCancleButton().click();
		String DeleteMessage = "Your appointment canceled !!";
		Alert ActualMessage = driver.switchTo().alert();
		ActualMessage.accept();
		String YourAppointCancledMessage = Appointhistory.getYourAppointCancleMessgae().getText();
		sa.assertEquals(DeleteMessage, YourAppointCancledMessage, "Appointment cancel message is not displayed");
		Reporter.log("Appointment canceled", true);

		UserEditProfilePage Editpage = new UserEditProfilePage(driver);
		Editpage.getProfileButton().click();
		Editpage.getLogoutButton().click();
		sa.assertEquals(welcomePage, "Hospital Management System", "Welcome page is not displayed");
		Reporter.log("Welcome Page is Displayed", true);
		driver.quit();
		sa.assertAll();
	}
}