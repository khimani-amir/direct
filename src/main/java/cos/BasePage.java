package cos;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {

	WebDriver driver;
	public String UL = "https://secure.tesco.com/direct/my/register.page";
	
	
	public void go() 
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(UL);
		System.out.println("Tesco Direct is online");
	}

	public void end() {
		driver.quit();
		System.out.println("Tesco Direct is Offline");
	}
	

		
}
