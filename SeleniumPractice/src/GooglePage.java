//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./Executable/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Executable/geckodriver.exe");
		//first step write path
	//	ChromeDriver bd=new ChromeDriver();
		FirefoxDriver nm=new FirefoxDriver();
     	//	to create the obj class for opening the url
		
		//bd.get("https//www.google.com");
		nm.get("https//www.google.com");
		
		
}
}