package test_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class invokeDemoAcc {
	public static WebDriver driver;

	@BeforeMethod
	public void invokeChrome() {
		System.setProperty("webdriver.chrome.driver", "./chromeDrivers/chromedriver91.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	@Parameters({"URL","Email","Password"})
	public void openDemocart(String website,String ename,String pass) {
		driver.get(website);
		String actTitle = driver.getTitle();
		String expTitle = "Your Store";
		Assert.assertEquals(actTitle, expTitle,"Home page title is not correct");
		System.out.println("Home page title is correct");
		
		driver.findElement(By.xpath("//*[@title='My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		String actual = driver.getTitle();
		String expect = "Account Login";
		Assert.assertEquals(actual, expect,"Login page title is not correct");
		System.out.println("Login page title is correct");
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@name='email']")).isDisplayed(), "email textbox is not displayed");
		WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
		email.sendKeys(ename);
		WebElement password =driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys(pass);
		Assert.assertEquals(email.isDisplayed(), true);
		Assert.assertEquals(password.isDisplayed(), true);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		boolean b = driver.getPageSource().contains("Warning");
		Assert.assertTrue(b,"no meassage");
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
