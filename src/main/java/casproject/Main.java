package casproject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class Main {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws Exception
	{
		acronymApp method=new acronymApp();
		
		driver=method.browserSetup();
		
		//method.browserSetup();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		method.openurl(driver);
		
		method.getUserInfo(driver);
		
		method.clickAcronym(driver);
		
		method.verifyAcronym(driver);
		
		method.getAcronym(driver);
		
		method.navigate(driver);
		
		method.getStockPrice(driver);
	}

}
