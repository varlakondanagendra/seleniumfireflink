package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditProfilePage {
	
	public UserEditProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "fname")
	private WebElement EditUserName;
	
	@FindBy(name =  "address")
	private WebElement EditAddress;
	
	@FindBy(name ="city")
	private WebElement EditCity;
	
	@FindBy(xpath = "//option[text()='male']")
	private WebElement EditGenderDropDown;
	
	@FindBy(name = "submit")
	private WebElement EditSubmitButton;
	
	@FindBy(xpath =  "//h5[contains(text(),'Your Profile updated Successfully')]")
	private WebElement scussesMessage;
	
	@FindBy(xpath = "//a[contains(@data-toggle,'dropdown')]")
	private WebElement profileButton;
	
	public WebElement getProfileButton() {
		return profileButton;
	}

	@FindBy(xpath =  "//a[contains(text(),'Log')]")
	private WebElement LogoutButton;

	public WebElement getEditUserName() {
		return EditUserName;
	}

	public WebElement getEditAddress() {
		return EditAddress;
	}

	public WebElement getEditCity() {
		return EditCity;
	}

	public WebElement getEditGenderDropDown() {
		return EditGenderDropDown;
	}

	public WebElement getEditSubmitButton() {
		return EditSubmitButton;
	}

	public WebElement getScussesMessage() {
		return scussesMessage;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
	
	
	
	
	
	
	

}
