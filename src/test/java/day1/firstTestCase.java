package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.switchTo().alert().accept();
		
		WebElement text = driver.findElement(By.xpath("//h4[@class = 'subheader']"));
		
		System.out.println(text.getText());
		
		
		
			
	}

}
