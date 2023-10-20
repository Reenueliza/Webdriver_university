package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		
		//drag and drop
		//driver.switchTo().frame(0);
		WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		ac.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		//double click
		WebElement link=driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		ac.doubleClick(link).perform();
		
		 
		//hover 1st 
	    WebElement hovefirst = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
	    ac.moveToElement(hovefirst).build().perform();
	    WebElement link1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
	    link1.click();
	    driver.switchTo().alert().accept();
	    
	    //hover 2nd
	    WebElement hovesecond = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
	    ac.moveToElement(hovesecond).build().perform();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement link2 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div/a"));
	    link2.click();
	    driver.switchTo().alert().accept();
	    
	    //hover 3rd
	    WebElement hovethird = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
	    ac.moveToElement(hovethird).build().perform();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement link3 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[1]"));
	    link3.click();
	    driver.switchTo().alert().accept(); 
	    
	    WebElement hove4 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
	    ac.moveToElement(hove4).build().perform();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    WebElement link4 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[2]"));
	    link4.click();
	    driver.switchTo().alert().accept();
	    
	    //click and hold
	    WebElement clickhold=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
	    ac.moveToElement(clickhold);
	    ac.clickAndHold().perform();
	    ac.moveToElement(clickhold).click().perform();
		
	}

}
