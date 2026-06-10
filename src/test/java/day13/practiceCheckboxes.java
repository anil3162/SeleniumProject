package day13;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceCheckboxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String checkText = "Two";
		
		driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
		
		driver.findElement(By.xpath("//label[normalize-space()='"+checkText+"']/preceding-sibling::input")).click();
		

	}

}
