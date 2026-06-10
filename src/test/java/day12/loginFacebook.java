package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String brandName = "Google";
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement BrandText = driver.findElement(By.xpath("//span[text()='Brands']"));
		
		js.executeScript("arguments[0].scrollIntoView();", BrandText);
		
		driver.findElement(By.xpath("//span[text()='"+brandName+"']/ancestor::a//label")).click();
		
		//driver.quit();

	}

}
