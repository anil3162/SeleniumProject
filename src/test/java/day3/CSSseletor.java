package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSseletor {
	@Test
	public void clickThroughSelector() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("t-shirt");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search store')]")).sendKeys("tshirt");
		driver .findElement(By.xpath("//a[text()='Register']")).click();
	}
	
}