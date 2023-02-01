package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientAppointmentHistory {
	public PatientAppointmentHistory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'2023-01-25 11:51:58')]/..//a[contains(text(),'Cancel')]")
	private WebElement cancleButton;

	@FindBy(xpath = "//p[contains(text(),'Your appointment canceled !!')]")
	private WebElement YourAppointCancleMessgae;
	
	
	public WebElement getCancleButton() {
		return cancleButton;
	}


	public WebElement getYourAppointCancleMessgae() {
		return YourAppointCancleMessgae;
	}

}
