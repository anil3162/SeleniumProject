package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class LocatorsTest {
	@Test
	public void getStatus() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		boolean status = driver.findElement(By.id("reg_pages_msg")).isDisplayed();
		System.out.println(status);

	}

}
