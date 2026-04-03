package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframesTest {
	@Test
	public void handleIframes() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"));
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//a[@href = 'https://a9t9.com']")).click();
		
		//driver.switchTo().defaultContent();
		
		//WebElement iframe1 = driver.findElement(By.xpath("//frame[@src = 'frame_5.html']"))
		
		
		//driver.switchTo().frame(0);
		
		boolean displayedStatus = driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		
		System.out.println(displayedStatus);
		

	}

}
