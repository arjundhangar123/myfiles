import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//Executable//Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement
		userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("9689021515");
		WebElement
		passwordInputfield=driver.findElement(By.id("pwd"));
		passwordInputfield.sendKeys("9921714392");
		WebElement
		loginButton=driver.findElement(By.id("loginbutton"));
		loginButton.click();
	}

}
