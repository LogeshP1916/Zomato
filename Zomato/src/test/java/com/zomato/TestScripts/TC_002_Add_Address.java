package com.zomato.TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.Zomato.POM.Address;
import Com.Zomato_GenericUtility.BaseTest;

public class TC_002_Add_Address extends TC_001_Login {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		address = new Address(driver);

		address.getAddressBox().click();

		address.getAddAddress().click();

		address.getDeliveryArea().click();

		address.getSearchLocation().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 0, 0) + Keys.ENTER);

		address.getSelAdd().click();

		address.getConfirmBtn().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//		webDriverUtility.javaScriptClick(driver, address.getCompleteAddress());

		wait.until(ExpectedConditions.elementToBeClickable(address.getCompleteAddress()))
				.sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 0, 1));

//		webDriverUtility.javaScriptClick(driver, address.getArea());

		wait.until(ExpectedConditions.elementToBeClickable(address.getArea()))
				.sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 0, 2));

		address.getRadiobtn().click();

		address.getSave().click();

//		address.getHome().click();

	}

}
