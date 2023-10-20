package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		//javascript alert
		WebElement jsalert=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		jsalert.click();
		driver.switchTo().alert().accept();
		
		/*//modal popup
		WebElement modal=driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		modal.click();
		driver.switchTo().alert().dismiss();
		
		//Ajax Loader
		WebElement ajloader=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		ajloader.click();*/
		
		//JavaScript Confirm Box
		WebElement jsconfirm=driver.findElement(By.xpath("//*[@id=\"button4\"]/p"));
		jsconfirm.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();	
	}

}
