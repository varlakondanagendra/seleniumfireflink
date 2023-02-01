package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientUserDashBoxPage {
	public PatientUserDashBoxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	private WebElement UpdateProfile;

	@FindBy(xpath = "//a[contains(text(),'View Appointment History')]")
	private WebElement MyAppointment;

	@FindBy(xpath = "//a[contains(text(),'Book Appointment')]")
	private WebElement BookMyAppointment;

	@FindBy(xpath = "//span[contains(text(),'Medical History')]")
	private WebElement MedicalHistoryTab;

	public WebElement getMedicalHistoryTab() {
		return MedicalHistoryTab;
	}

	public WebElement getUpdateProfile() {
		return UpdateProfile;
	}

	public WebElement getMyAppointment() {
		return MyAppointment;
	}

	public WebElement getBookMyAppointment() {
		return BookMyAppointment;
	}

}
