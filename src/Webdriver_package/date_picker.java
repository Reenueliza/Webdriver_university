package Webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reema\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		
		String month="March 1999";
		String day="3";
		WebElement datepickerinput=driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
		datepickerinput.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true)
			{
				String monthyeartext=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
				if(monthyeartext.equals(month))
				{
				break;
				}
				else
				{
				WebElement leftarrow=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
				leftarrow.click();	
				}
			}
		WebElement day1=driver.findElement(By.xpath("//td[text()='3']"));
		day1.click();	
	}

}
