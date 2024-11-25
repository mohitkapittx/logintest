package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoingPage {
WebDriver ldriver ;




public LoingPage(WebDriver rDriver) {
	ldriver = rDriver;
	PageFactory.initElements(rDriver, this);
}



@FindBy(id="email")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(id="btnSignIn")
WebElement loinbtn;


public void enterUsername(String emailid) {
	username.sendKeys(emailid);
}

public void enterPassword(String pswrd) {
	username.sendKeys(pswrd);
}

public void enterlogbtn() {
	loinbtn.click();
}






}