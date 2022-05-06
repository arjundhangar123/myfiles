import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programselenium {

	

	public static void main(String[] args) {
		String Driverpath1="C:\\Users\\HP\\eclipse-workspace\\SeleniumPractice\\Executable\\Chromedriver";
		String Driverpath2=".\\Executable\\Chromedriver.exe";
		String Driverpath3=
				System.getProperty("user.dir"+"Executable\\ChromeDriver.exe");
		//step1: set driver executable path by using System.setProperty(String key, String value)
		
		//System.setProperty("WebDriver.Chrome.Driver", "Driverpath3");
		System.setProperty("WebDriver.gecko.Driver", "Driverpath3");
		//step2: create instance of chrome browser
		
		//ChromeDriver  driver=new ChromeDriver();
		FirefoxDriver ref=new FirefoxDriver();
	}

}
