package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		
		WebElement fileinput=driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
		fileinput.sendKeys("C:\\Users\\reema\\Pictures\\Camera Roll\\photo_2023-09-06_12-40-19.jpg");
	
		//wait for a few seconds to ensure the file is uploaded
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		
		}
		
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		submit.click();
		driver.switchTo().alert().accept();
	}

}