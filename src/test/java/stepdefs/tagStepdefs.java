package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class tagStepdefs {
WebDriver tag;
@Given("Amy launched chrome browser")
public void amy_launched_chrome_browser() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\bharg\\Downloads\\chromedriver.exe");
 WebDriver tag= new ChromeDriver();
System.out.println("Browser is launched");
}

@Given("provided valid URL")
public void provided_valid_URL() {
//tag.get("https://www.google.com/");
tag.get("http://demowebshop.tricentis.com/login");
tag.navigate().to("http://demowebshop.tricentis.com/login");
}

@When("Amy provides valid credentials")
public void amy_provides_valid_credentials() {
tag.findElement(By.name("Email")).sendKeys("sam@gmail.com");
tag.findElement(By.id("Password")).sendKeys("pass123");
}

@When("click on login")
public void click_on_login() {
tag.findElement(By.name("login")).click();
}

@Then("Amy shall see the home page")
public void amy_shall_see_the_home_page() {
System.out.println("homepage saw the home page");
}

@Given("Amy is on home page")
public void amy_is_on_home_page() {
System.out.println("she is in the home page");
}

@When("Amy searches for a product")
public void amy_searches_for_a_product() {
System.out.println("");
}

@Then("she shall see list of products displayed")
public void she_shall_see_list_of_products_displayed() {
System.out.println("she shall see list of products displayed");

}

@Given("Amy is on registration page")
public void amy_is_on_registration_page() {
System.out.println("Amy is on registration page");

}

@When("Amy provides all the details")
public void amy_provides_all_the_details() {
System.out.println("Amy provides all the details");
}

@Then("she shall be registered successfully")
public void she_shall_be_registered_successfully() {
System.out.println("she shall be registered successfully");

}
}