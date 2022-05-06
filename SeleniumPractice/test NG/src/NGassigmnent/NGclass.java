package NGassigmnent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NGclass {

	@Test
	public void testing() {
		System.setProperty("webdriver.chrome.driver", ".//Executable//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}

}
