package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InterviewTest {
	@Test
	public void loginTest1() {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		WebElement text = driver.findElement(By.xpath("//h4[@class = 'subheader']"));
		
		System.out.println(text.getAttribute("value"));
	}

}
