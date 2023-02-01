package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLogInPage {

	public PatientLogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement UserNameTextFeild;

	@FindBy(name = "password")
	private WebElement PasswordTextFeild;

	@FindBy(name = "submit")
	private WebElement LogINButton;

	public WebElement getUserNameTextFeild() {
		return UserNameTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return PasswordTextFeild;
	}

	public WebElement getLogINButton() {
		return LogINButton;
	}

}
