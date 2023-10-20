package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class to_do_list {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		
		WebElement addnewtodo=driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		addnewtodo.sendKeys("daily exercise");
		WebElement plusopt=driver.findElement(By.xpath("//*[@id=\"plus-icon\"]"));
		plusopt.click();
		WebElement delete1=driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
		delete1.click();
	}

}
