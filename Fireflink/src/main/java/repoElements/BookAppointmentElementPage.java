package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointmentElementPage {
	public BookAppointmentElementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "Doctorspecialization")
	private WebElement DoctorSpeciali;

	@FindBy(id = "doctor")
	private WebElement DoctorSelect;

	@FindBy(name = "appdate")
	private WebElement dateCalender;

	@FindBy(id = "timepicker1")
	private WebElement TimePicker;

	@FindBy(id = "submit")
	private WebElement Submitebutton;

	public WebElement getDoctorSpeciali() {
		return DoctorSpeciali;
	}

	public WebElement getDoctorSelect() {
		return DoctorSelect;
	}

	public WebElement getDateCalender() {
		return dateCalender;
	}

	public WebElement getTimePicker() {
		return TimePicker;
	}

	public WebElement getSubmitebutton() {
		return Submitebutton;
	}

}
