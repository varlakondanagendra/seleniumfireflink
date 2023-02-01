package repoElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMedicalHistory {
	public ViewMedicalHistory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[contains(@class,'fa fa-eye')]")
	private WebElement ViewMedicalReportButton;

	public WebElement getViewMedicalReportButton() {
		return ViewMedicalReportButton;
	}

}
