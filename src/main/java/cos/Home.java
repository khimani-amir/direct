package cos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Home extends BasePage {

	public WebElement Username()
	{	
		return driver.findElement(By.id("signin-email"));
	}
	
	public WebElement Password()

	{
		return driver.findElement(By.id("signin-password"));
	}
	
	public WebElement Login()

	{
		return driver.findElement(By.id("signin-button"));
	}
}
