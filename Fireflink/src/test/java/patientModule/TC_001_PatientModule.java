package patientModule;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import repoElements.HomePageElements;
import repoElements.PatientLogInPage;
import repoElements.PatientUserDashBoxPage;
import repoElements.UserEditProfilePage;
import repoElements.WelcomePageElements;

public class TC_001_PatientModule {
	@Test

	public void PatientprofileUpdate() {
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
		HomeDashBoard.getUpdateProfile().click();
		String userEditPage = driver.getTitle();
		sa.assertEquals(userEditPage, "User | Edit Profile", "User Edit Profile Page is not Displayed ");
		Reporter.log("User Edit Profile Page is Displayed", true);

		UserEditProfilePage Editpage = new UserEditProfilePage(driver);
		Editpage.getEditUserName().clear();
		Editpage.getEditUserName().sendKeys("Nagendra");
		Editpage.getEditAddress().clear();
		Editpage.getEditAddress().sendKeys("Bangalore");
		Editpage.getEditCity().clear();
		Editpage.getEditCity().sendKeys("GopalanCoworks");
		Editpage.getEditGenderDropDown().click();
		Editpage.getEditSubmitButton().click();
		String SuccessMess = Editpage.getScussesMessage().getText();
		sa.assertEquals(SuccessMess, "Your Profile updated Successfully", "Success Message is not Displayed ");
		Editpage.getProfileButton().click();
		Editpage.getLogoutButton().click();
		sa.assertEquals(welcomePage, "Hospital Management System", "Welcome page is not displayed");
		Reporter.log("Welcome Page is Displayed", true);
		driver.quit();
		sa.assertAll();

	}
}
