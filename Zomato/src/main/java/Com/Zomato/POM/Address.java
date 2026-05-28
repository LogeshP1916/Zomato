package Com.Zomato.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {

	public Address(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='sc-18n4g8v-0 gAhmYY sc-iIHjhz kaXDaN']")
	private WebElement addressBox;

	@FindBy(xpath = "//p[text()='Add address']")
	private WebElement addAddress;

	@FindBy(xpath = "(//div[@role='button'])[5]")
	private WebElement deliveryArea;

	@FindBy(xpath = "//input[@class='sc-gw20v4-4 gZfBjs']")
	private WebElement searchLocation;
	
	@FindBy(xpath = "(//div[@class='sc-gw20v4-3 PWbNo'])[1]")
	private WebElement selAdd;

	public WebElement getSelAdd() {
		return selAdd;
	}

	@FindBy(xpath = "//span[contains(text(),'Confirm')]")
	private WebElement confirmBtn;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement CompleteAddress;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement Area;

	@FindBy(xpath = "(//span[text()='Home'])[2]")
	private WebElement radiobtn;

	@FindBy(xpath = "//span[text()='Save and proceed']")
	private WebElement save;
	
	@FindBy(xpath = "(//div[@class='sc-bSbAYC iYTrBE'])[1]")
	private WebElement home;

	public WebElement getHome() {
		return home;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getDeliveryArea() {
		return deliveryArea;
	}

	public WebElement getSearchLocation() {
		return searchLocation;
	}

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getCompleteAddress() {
		return CompleteAddress;
	}

	public WebElement getArea() {
		return Area;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getAddressBox() {
		return addressBox;
	}

}
