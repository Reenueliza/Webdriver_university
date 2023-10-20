package Webdriver_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_click {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		WebElement webelementclick=driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		webelementclick.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		/*WebElement javascriptclick=driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		javascriptclick.click();
		alert.dismiss();
		WebElement action_move_click=driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		action_move_click.click();
		alert.dismiss();*/	
	}

}
