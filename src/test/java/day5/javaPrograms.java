package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

public class javaPrograms {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Upgrade']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String> windowList = new ArrayList(windowIds);
		
		String first = windowList.get(0);
		String second = windowList.get(1);
		
		driver.switchTo().window(second);
		
		System.out.println(driver.getWindowHandle());
		
		

	}

}
