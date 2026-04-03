package day6;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class HandleCheckboxesTest {
	@Test
	public void checkBoxes() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox']"));
		
		for(int i=4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(Duration.ofSeconds(5));
		
		for(int i=0;i<checkboxes.size();i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}

	}

}
