package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Home_PageElements {

	public Admin_Home_PageElements(WebDriver driver) {
		PageFactory.initElements(driver, null);
	}

	@FindBy(xpath = "//a[text()='Click Here' and contains(@href,'admin')]")
	private WebElement adminElement;
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userNameElement;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passWordEelement;
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Total Users')]")
	private WebElement TotaluserButton;

	@FindBy(xpath = "(//a[contains(@tooltip,'Remove')])[2]")
	private WebElement removeButton;

	public WebElement getTotaluserButton() {
		return TotaluserButton;
	}

	public WebElement getRemoveButton() {
		return removeButton;
	}

	public WebElement getAdminElement() {
		return adminElement;
	}

	public WebElement getUserNameElement() {
		return userNameElement;
	}

	public WebElement getPassWordEelement() {
		return passWordEelement;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "//span[(text()=' Doctors ')]")
	private WebElement doctorsElement;
	@FindBy(xpath = "//span[(text()=' Doctor Specialization ')]")
	private WebElement docSpecialization;
	@FindBy(xpath = "//input[@name='doctorspecilization']")
	private WebElement enterSpecialization;
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getDoctorsElement() {
		return doctorsElement;
	}

	public WebElement getDocSpecialization() {
		return docSpecialization;
	}

	public WebElement getEnterSpecialization() {
		return enterSpecialization;
	}

	@FindBy(xpath = "//span[text()=' Add Doctor']")
	private WebElement addDoctorElement;
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement selectDropdown;

	public WebElement getAddDoctorElement() {
		return addDoctorElement;
	}

	public WebElement getSelectDropdown() {
		return selectDropdown;
	}

	@FindBy(xpath = "//input[@name='docname']")
	private WebElement docNameElement;
	@FindBy(xpath = "//textarea[@name='clinicaddress']")
	private WebElement docAddressElement;
	@FindBy(xpath = "//input[@name='docfees']")
	private WebElement docFeesElement;
	@FindBy(xpath = "//input[@name='doccontact']")
	private WebElement docContactElement;
	@FindBy(xpath = "//input[@name='docemail']")
	private WebElement docEmailElement;
	@FindBy(xpath = "//input[@name='npass']")
	private WebElement docPasswordElement;
	@FindBy(xpath = "//input[@name='cfpass']")
	private WebElement docConfirmPassword;
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement docSubmiButton;

	public WebElement getDocNameElement() {
		return docNameElement;
	}

	public WebElement getDocAddressElement() {
		return docAddressElement;
	}

	public WebElement getDocFeesElement() {
		return docFeesElement;
	}

	public WebElement getDocContactElement() {
		return docContactElement;
	}

	public WebElement getDocEmailElement() {
		return docEmailElement;
	}

	public WebElement getDocPasswordElement() {
		return docPasswordElement;
	}

	public WebElement getDocConfirmPassword() {
		return docConfirmPassword;
	}

	public WebElement getDocSubmiButton() {
		return docSubmiButton;
	}

}
