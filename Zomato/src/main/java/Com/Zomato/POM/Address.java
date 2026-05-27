package Com.Zomato.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {

	public Address(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@class='sc-jHZirH hAtUrG']")
	private WebElement addressBox;

	public WebElement getAddressBox() {
		return addressBox;
	}
	
}
