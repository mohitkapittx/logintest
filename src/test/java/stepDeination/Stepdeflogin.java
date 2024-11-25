package stepDeination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObject.LoingPage;

public class Stepdeflogin {
	
	WebDriver driver;
	LoingPage loginP;
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginP = new LoingPage(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String string) {
	    
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String emailid, String pswd) {
		loginP.enterUsername(emailid);
		loginP.enterPassword(pswd);
	    
	}

	@When("click on log in")
	public void click_on_log_in() {
		loginP.enterlogbtn();
	 
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
	    String actualtitle = driver.getTitle();
	    if(actualtitle.equals(expectedtitle)) {
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.assertTrue(false);
	    }
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}

	public static void main(String[] args) {
		

	}

}
