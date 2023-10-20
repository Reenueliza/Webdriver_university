package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_object_model {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
		driver.manage().window().maximize();
		WebElement nextopt=driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/a[2]/span"));
		nextopt.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement nextopt1=driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/a[2]/span"));
		nextopt1.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement prevopt=driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/a[1]/span"));
		prevopt.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement home=driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a"));
		home.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement product=driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
		product.click();
		//WebElement pro=driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
		//pro.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement contact=driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[3]/a"));
		contact.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.navigate().back();
		driver.navigate().back();
		
		WebElement find=driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]/b"));
		find.click();
		driver.switchTo().alert().accept();
	}

}
