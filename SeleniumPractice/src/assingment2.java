import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executable/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.className("pwdfield")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.id("usersManagementBodyTagId")).click();
        //driver.findElement(By.id("\"usersManagementBodyTagId\"")).click();
	}

}
