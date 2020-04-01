package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class webshopStepdefs {
	WebDriver driver ;
	@Given("user navigates to demo web shop")
	public void user_navigates_to_demo_web_shop() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bharg\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); 
	      driver.navigate().to("http://demowebshop.tricentis.com/login");
	    
	}

	@When("I enter Email as {string} and Password as {string}")
	public void i_enter_Email_as_and_Password_as(String string, String string2) {
		driver.findElement(By.name("Email")).sendKeys("karthik456@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("karthik456");
	}

	@Then("user shall able to view homepage")
	public void user_shall_able_to_view_homepage() {
		driver.findElement(By.cssSelector("input.button-1.login-button")).click();
	    System.out.println("homepage displayed");
	}



}
