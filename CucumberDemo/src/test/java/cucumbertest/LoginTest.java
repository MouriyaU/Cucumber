package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	WebDriver driver;

	
	public static void main(String[] args)
	{
		//Set the chrome driver path
		System.setProperty
		("webdriver.chrome.driver", 
				"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Open browser URL
		String url = "http://adactinhotelapp.com";
		driver.get(url);
		
		//Find the user name element
				WebElement uName = driver.findElement(By.id("username"));  
				//Enter user name
				uName.sendKeys("TPillai567");
						
				//find the password element and enter the password directly
				driver.findElement(By.id("password")).sendKeys("P1L618");
				
				//Click on the login button link by tag and class and 'value' attribute
				driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();
	
		
	}

}
