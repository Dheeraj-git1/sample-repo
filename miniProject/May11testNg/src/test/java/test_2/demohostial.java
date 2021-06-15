package test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demohostial {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./chromeDrivers/chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.practo.com");
		WebElement s= driver.findElement(By.xpath("//input[@placeholder='Search location']"));
		s.click();
		s.sendKeys("Bangalore");
		WebElement h = driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']"));
		h.click();
		h.sendKeys("hospital");
		h.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();

		
	}

}
