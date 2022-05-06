import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//executable//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//identify the required element from the UI
				WebElement userNameInputField=driver.findElement(By.id("username"));
				//perform appropriate action the identified element
				userNameInputField.sendKeys("admin");
				//remove existing text from the input field
				userNameInputField.clear();
				userNameInputField.sendKeys("admin");
				
				//identify the required element from the UI
				WebElement passwordInputField=driver.findElement(By.name("pwd"));
				//perform appropriate action the identified element
				passwordInputField.sendKeys("manager");
				
				//identify the required element from the UI
				WebElement loginButton=driver.findElement(By.id("loginButton"));
				//perform appropriate action the identified element
				loginButton.click();	
			//	WebElement userbutton=driver.findElement(By.className("content selected users"));
			//	userbutton.click();
				driver.close();
	}

}
