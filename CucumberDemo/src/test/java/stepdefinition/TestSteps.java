package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps 
{
	WebDriver driver;
	String titleExpected = "Adactin.com - Search Hotel";
    String usName = "";
	
@Given("The user is on the login page")
public void the_user_is_on_the_login_page() 
{
	//Set the Chrome driver path
			System.setProperty
			("webdriver.chrome.driver", 
					"C:\\Drivers_New\\BrowserDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
	        
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Open browser URL
			String url = "http://adactinhotelapp.com";
			driver.get(url);
			System.out.println("In login page");
}

@When("User enters valid user name and password")
public void user_enters_valid_user_name_and_password() {
	//Find the user name element
	WebElement uName = driver.findElement(By.id("username"));  
	//Enter user name
	uName.sendKeys("TPillai567");
	usName = "TPillai567";	
	//find the password element and enter the password directly
	driver.findElement(By.id("password")).sendKeys("P1L618");	
	System.out.println("Entered info");
}

@When("User enters \"(.*)\", \"(.*)\"$") 
public void user_enters_valid_user_name_and_password(String user_name, String passWord) {
	WebElement uName = driver.findElement(By.id("username"));  
	uName.sendKeys(user_name);
	usName = user_name;	

	WebElement pWd = driver.findElement(By.id("password"));  
	pWd.sendKeys(passWord);
	System.out.println("Second method for params");
    }



@When("User clicks on the login button")
public void user_clicks_on_the_login_button() {
	//Click on the login button link by tag and class and 'value' attribute
	driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();	
	System.out.println("Am in clicking the login button?");
}

@Then("Login is successful")
public void login_is_successful() 
{
	String msgActual = driver.findElement(By.id("username_show")).getAttribute("value");
	String msgExpected = "Hello "+usName+"!";

	Assert.assertEquals(msgExpected,msgActual);	
}

@Then("Search page is displayed")
public void search_page_is_displayed() {
 
	String titleActual = driver.getTitle();
	Assert.assertEquals(titleExpected,titleActual);	
}

@When("User selects \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
public void user_selects(String location, String roomno, String chekin, String chekout, String adults) {

	//Drop down  to select LOCATION
			new Select(driver.findElement(By.className("search_combobox"))).selectByValue(location);
			
		
			//Drop down to select Number of Rooms
			 new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText(roomno);
			 
			 //Date picker-Enter check in date
			 WebElement checkinDate = driver.findElement(By.id("datepick_in"));
			 checkinDate.clear();
			 checkinDate.sendKeys(chekin);
			 
			 //Date picker-Enter checkout date
			 WebElement checkoutDate = driver.findElement(By.id("datepick_out"));
			 checkoutDate.clear();
			 checkoutDate.sendKeys(chekout);
	         
			 //Select Adults per room
			 new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText(adults);
			 
}

@When("User clicks on search button")
public void user_clicks_on_search_button() {
	//Click on Search
	driver.findElement(By.id("Submit")).click();
}

@Then("Search results should be displayed")
public void search_results_should_be_displayed() {
System.out.println("Successful search page");
}

@Given("This is a blank test")
public void this_is_a_blank_test() {
	System.out.println("Check blank test");

}

}
