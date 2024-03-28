package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
//import PageFactory.Scenario_1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class StepDefinitionsDemo {
	WebDriver driver;
	@Given("user is on LinkedIn homepage")
	public void user_is_on_linked_in_homepage() {
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login/");
		driver.manage().window().maximize();
	}
	@When("user enters their email and password")
	public void user_enters_their_email_and_password() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gshriya1225@gmail.com"); 
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Shriya@123");
//		Scenario_1 demo1 = new Scenario_1(driver);
//		demo1.login_details();
	}
 
	@When("User clicks on th Sign-in button")
	public void user_clicks_on_th_sign_in_button() throws InterruptedException {
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement aboutMe;
		aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		aboutMe.click();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Then("user should be successfully logged into LinkedIn")
	public void user_should_be_successfully_logged_into_linked_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("I am on the Homepage and I will be able to see My Items")
	public void i_am_on_the_homepage_and_i_will_be_able_to_see_my_items() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I will click My Items")
	public void i_will_click_my_items() throws InterruptedException {
		Thread.sleep(10000);
		driver.get("https://www.linkedin.com/my-items/");
	}

 
	@Then("I will be re-directed to My Jobs and i will be able to see number of jobs i have applied so far")
	public void i_will_be_re_directed_to_my_jobs_and_i_will_be_able_to_see_number_of_jobs_i_have_applied_so_far() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

 
//	@Given("I am on homepage")
//	public void i_am_on_homepage() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i want to search a particular role")
//	public void i_want_to_search_a_particular_role() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I will search about analyst_role and click on enter")
//	public void i_will_search_about_analyst_role_and_click_on_enter() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		WebElement search_bar=driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		search_bar.sendKeys("#Analyst Hyderabad");
//		search_bar.sendKeys(Keys.RETURN);
//		Thread.sleep(10000);
//
//
//	}
//
//	@Given("I will click on profile hyperlink")
//	public void i_will_click_on_profile_hyperlink() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("(//a[@href='/in/g-shriya-9194581a2/']//div)[2]")).click();
//		Thread.sleep(10000);
//
//
//	}
//
//	@When("I will redirect to a page")
//	public void i_will_redirect_to_a_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I will click on the followers")
//	public void i_will_click_on_the_followers() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//li[contains(@class,'text-body-small t-black--light')]//a[1]")).click();
//		Thread.sleep(10000);
//
//	}
//
//	@Given("i have to click on sort by")
//	public void i_have_to_click_on_sort_by() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//div[@class='display-flex t-black']//span[1]")).click();
//		
//
//	}
//
//	@When("i click on Recent")
//	public void i_click_on_recent() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//div[text()='Recent']")).click();
//		Thread.sleep(10000);
//	}
//
//	@Then("i will be able to see the recent posts")
//	public void i_will_be_able_to_see_the_recent_posts() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("I have to search a connection")
//	public void i_have_to_search_a_connection() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
//
//	@When("i enter name on search bar")
//	public void i_enter_name_on_search_bar() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//		WebElement search_bar=driver.findElement(By.xpath("//div[@class='search-global-typeahead__typeahead']//input[1]"));
//		search_bar.sendKeys(".........");
//		search_bar.sendKeys(Keys.RETURN);
//		
//
//	}
//
//	@Then("i will be able to see all the connections with that name")
//	public void i_will_be_able_to_see_all_the_connections_with_that_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new io.cucumber.java.PendingException();
//	}
 
 
}