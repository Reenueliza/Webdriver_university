package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class university_front_page {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		WebElement cucumber=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[1]/a"));
		cucumber.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
		WebElement cypress=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[2]/a"));
		cypress.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
		WebElement complete=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[3]/a"));
		complete.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		
		WebElement selenium4=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[4]/a"));
		selenium4.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		WebElement master=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[5]/a"));
		master.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		WebElement bdd=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[6]/a"));
		bdd.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
		WebElement java=driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[7]/a"));
		java.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
		
	}

}
