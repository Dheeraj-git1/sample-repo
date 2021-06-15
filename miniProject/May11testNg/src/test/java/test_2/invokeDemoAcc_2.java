package test_2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class invokeDemoAcc_2 {
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@title='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//*[@name='email']")
	WebElement emailField;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//*[@value='Login']")
	WebElement loginButton;
	
	public invokeDemoAcc_2() {
		PageFactory.initElements(driver, this);
	}

	
	@BeforeMethod
	public void invokeChrome() {
		System.setProperty("webdriver.chrome.driver", "./chromeDrivers/chromedriver91.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	@Parameters({"URL","Email","Password"})
	public void openDemocart(String website,String email,String pass) {
		
		driver.get(website);
		myAccount.click();
		login.click();
		emailField.sendKeys(email);
		passwordField.sendKeys(pass);
		loginButton.click();
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
