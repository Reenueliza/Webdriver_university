package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact_us {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		fname.sendKeys("Melissa");
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		lname.sendKeys("Thomas");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("melissa123@gmail.com");
		WebElement comments=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		comments.sendKeys("Helloo World");
		WebElement submit =driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		submit.click();
		//WebElement reset=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		//reset.click();
	}

}
