package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropDowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement DrpcountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select countryele = new Select(DrpcountryEle);
		
		countryele.selectByVisibleText("Japan");
		
		List<WebElement> countryOptions = countryele.getOptions();
		
		for(int i = 0;i<countryOptions.size();i++) {
			System.out.println(countryOptions.get(i).getText());
		}
		
		
		
		

	}

}
