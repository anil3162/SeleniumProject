package day9;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");
		 
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Actions act = new Actions(driver);
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//h2[normalize-space()='Double Click']"));
		
		js.executeScript("arguments[0].scrollIntoView();",doubleClickButton);	
		
		WebElement copytextButton = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		act.doubleClick(copytextButton).perform();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		
		WebElement Source1 = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		
		WebElement target1 = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		
		act.dragAndDrop(Source1, target1).perform();
		
		WebElement inputField = driver.findElement(By.xpath("//input[@id = 'field2']"));
		
		String Value = inputField.getAttribute("value");
		
		System.out.println(Value);
		
		WebElement sliderText = driver.findElement(By.xpath("//h2[normalize-space()='Slider']"));
		
		js.executeScript("arguments[0].scrollIntoView();", sliderText);
		
		//WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-active ui-state-focus']"));
		
		//System.out.println(sliderText.getLocation());
		
		Thread.sleep(Duration.ofSeconds(5));
		
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);	
		
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullPage.png");
		
		sourcefile.renameTo(targetfile);
		
		

	}

}
