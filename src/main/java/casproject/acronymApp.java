package casproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.util.*;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import miniProjectFiles.DriverSetup;


public class acronymApp {
	
	static WebDriver driver;
	
	public WebDriver browserSetup() {
		
		
		driver=DriverSetup.webDriver();
		return driver;
		
	}
		
	//open url in browser
	
	public static void openurl(WebDriver driver) throws Exception {
		
		driver.get("https://be.cognizant.com");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
	}
	//Get the user information
	
	public static void getUserInfo(WebDriver driver) throws Exception{
		
		Thread.sleep(5000);
		WebElement user=driver.findElement(By.xpath("//div[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']"));
		user.click();
	//	Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath("//div[@class='mectrl_accountDetails']/div[1]"));
		System.out.println(name.getText());
	//	Thread.sleep(3000);
		WebElement mail=driver.findElement(By.xpath("//div[@class='mectrl_accountDetails']/div[2]"));
		System.out.println(mail.getText());
	}
		
		
	//Under Company Header Click on Acronyms.
		
	public static void clickAcronym(WebDriver driver) throws Exception {

		WebElement cmpy=driver.findElement(By.xpath("//button[@name='Company']"));
		
		cmpy.click();
		
		Thread.sleep(2000);
		
		WebElement ar=driver.findElement(By.xpath("//a[@name='Acronyms']"));
		
		ar.click();
		
		}
		
	//Verify Acronyms is displayed and Get Tool Tip.
		
	public static void verifyAcronym(WebDriver driver) {
			
		WebElement display=driver.findElement(By.xpath("//h3[text()='Cognizant Acronyms']"));
		System.out.println(display.isDisplayed());
			
		WebElement tooltip=driver.findElement(By.xpath("//div[@id='title_text']"));
		System.out.println(tooltip.getAttribute("title"));
			
		}
		
		//Print the count of Acronyms data
		//Get all data of Acronyms present in Acronym App.
		
		public static void getAcronym(WebDriver driver) throws Exception {
		
		Thread.sleep(2000);
		
		List<WebElement> arlist=driver.findElements(By.xpath("//tbody/tr"));
		
		System.out.println("Acronym count : "+arlist.size());
		
		System.out.println();
		
		for(WebElement al:arlist) {
			
			WebElement name=al.findElement(By.xpath("./td[1]"));
			WebElement fullForm=al.findElement(By.xpath("./td[2]"));
			System.out.println("Acronym :"+name.getText());
			System.out.println("FullForm :"+fullForm.getText());
			System.out.println("===========================================");
		}
		
		}
		
	//Click on be.Cognizant and Verify it got redirected to Be. Cognizant Home Page.
		
	public static void navigate(WebDriver driver) {
		
		driver.navigate().back();
		
	}
		
	public static void getStockPrice(WebDriver driver) throws Exception{
			
		Thread.sleep(5000);

		JavascriptExecutor jse =(JavascriptExecutor)driver;
	//	WebElement nasdaqscroll=driver.findElement(By.xpath("(//*[@data-automation-id='CanvasSection'])[4]"));
		WebElement nasdaqscroll=driver.findElement(By.xpath("(//*[@data-automation-id='CanvasSection'])[6]"));

		jse.executeScript("arguments[0].scrollIntoView();",nasdaqscroll);
		Thread.sleep(5000);		
		WebElement stockPrice=driver.findElement(By.xpath("(//*[@data-automation-id='CanvasSection'])[7]/div/div/div/div/div/div/div/div[1]/div[1]"));
		
		System.out.println(stockPrice.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(5000);
		
//		String stockPrice=driver.findElement(By.xpath("//div[@class='stockValue_60e60a8c']")).getText();
//		
//		System.out.println(stockPrice);
//		
//		String stockCurrency=driver.findElement(By.xpath("//div[@class='stockCurrency_60e60a8c']")).getText();
//		
//		System.out.println(stockCurrency);
		
//		Thread.sleep(5000);
//		
//		driver.get("https://www.google.com/");
//		
//		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("cognizant stock price");
//		
//		WebElement gdata=driver.findElement(By.xpath("//span[@class='IsqQVc NprOob wT3VGc']"));
//		
//		System.out.println(gdata.getText());
//		
//		if(stockPrice.equals(gdata)) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("Not equal");
//		}
		
	
		
		
		
		
		
	

}
