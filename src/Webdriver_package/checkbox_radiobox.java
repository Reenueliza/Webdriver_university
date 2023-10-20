package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox_radiobox {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		//dropdown
		Select menu_code=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		menu_code.selectByVisibleText("JAVA");
		Select menu_lang=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
		menu_lang.selectByVisibleText("TestNG");
		Select menu_type=new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		menu_type.selectByVisibleText("CSS");
		
		//checkbox
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		checkbox.click();
		
		//radiobox
		WebElement radiobox1=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
		radiobox1.click();
		WebElement Selected_Disabled=driver.findElement(By.linkText("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]"));
		Selected_Disabled.click();
		Select select1=new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
		select1.selectByVisibleText("Grape");
	}

}
