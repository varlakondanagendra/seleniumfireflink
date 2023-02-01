package simplecode;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenEmptyChromeBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com");
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://portal.zinghr.com/");
		driver.switchTo().window(parentWindow);
		driver.get("https://github.com/SeleniumHQ/selenium/blob/trunk/java/CHANGELOG");
		driver.manage().window().minimize();
		driver.manage().window().maximize();

	}

}
