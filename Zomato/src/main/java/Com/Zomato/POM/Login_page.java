package Com.Zomato.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Log in")
	private WebElement Login_Btn;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement phNum;
	
	
	@FindBy(xpath = "//span[contains(text(),'Send')]")
	private WebElement sendOTP;


	public WebElement getLogin_Btn() {
		return Login_Btn;
	}


	public WebElement getPhNum() {
		return phNum;
	}


	public WebElement getSendOTP() {
		return sendOTP;
	}
	
	
	

}
