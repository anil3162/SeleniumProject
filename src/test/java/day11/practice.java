package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement tableText = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
		
		js.executeScript("arguments[0].scrollIntoView();", tableText);
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println(rows);
		
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println(cols);
		
		for(int r=2;r<=rows;r++ ) 
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		
			//System.out.println(value);
			
			if(author.equals("Amod")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				String Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]")).getText();
				String Price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				System.out.println(bookName +"\t"+author+"\t"+Subject+"\t"+Price);
			}
			
		}
		
		
		
		
		
		driver.quit();
		

	}

}
