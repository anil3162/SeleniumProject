package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigtionMethods {
	@Test
	public void getWindowID() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline']")).click();
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println(driver.getWindowHandle());
		
	}
	}