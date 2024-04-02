package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenarios {
	WebDriver driver;
	public Scenarios(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="username")
	WebElement username_text_box;
	
	@FindBy(id="password")
	WebElement password_text_box;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search_bar;
	
	@FindBy(xpath="(//a[@href='/in/g-shriya-9194581a2/']//div)[2]")
	WebElement hyper_link;
	
	@FindBy(xpath="//li[contains(@class,'text-body-small t-black--light')]//a[1]")
	WebElement followers;
	
	@FindBy(xpath="//div[@class='display-flex t-black']//span[1]")
	WebElement sort_by;
	
	@FindBy(xpath="(//div[@class='artdeco-dropdown__content-inner']//div)[2]")
    WebElement recent_posts;
	
	@FindBy(xpath="//div[@class='search-global-typeahead__typeahead']//input[1]")
	WebElement searchbar;
	
	public void name() {
		username_text_box.sendKeys("gshriya1225@gmail.com");
	}
	public void pass() {
		password_text_box.sendKeys("0217@shriya");
	}
	public void enter() {
		submit.click();
	}
	public void search() {
		search_bar.click();
		search_bar.sendKeys("#Analyst Hyderabad");
		search_bar.sendKeys(Keys.RETURN);
	}
	public void profile_click() {
		hyper_link.click();
	}
	public void followers_enter() {
		followers.click();
	}
	public void sort() {
		sort_by.click();
	}
	public void recent() {
		recent_posts.click();
	}
	public void search1() {
		search_bar.click();
		search_bar.sendKeys(".........");
		search_bar.sendKeys(Keys.RETURN);	
		
	}
	
	
	

}
