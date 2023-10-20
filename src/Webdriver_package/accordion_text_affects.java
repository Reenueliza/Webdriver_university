package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accordion_text_affects {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		
		WebElement manual_testing=driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		manual_testing.click();
		WebElement manual_testing1=driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		manual_testing1.click();
		
		WebElement cucumber=driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
		cucumber.click();
		WebElement cucumber1=driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
		cucumber1.click();
		
		WebElement automation_testing=driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
		automation_testing.click();
		WebElement automation_testing1=driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
		automation_testing1.click();
		
		WebElement keep_clicking=driver.findElement(By.xpath("//*[@id=\"click-accordion\"]"));
		keep_clicking.click();
		WebElement keep_clicking1=driver.findElement(By.xpath("//*[@id=\"click-accordion\"]"));
		keep_clicking1.click();
		
	}

}
