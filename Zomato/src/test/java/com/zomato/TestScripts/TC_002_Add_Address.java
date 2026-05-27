package com.zomato.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.Zomato.POM.Address;

public class TC_002_Add_Address extends TC_001_Login {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException {

		address = new Address(driver);
		address.getAddressBox().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 0, 0));

		System.out.println(fileUtility.readDataFromExcelFile("Sheet1", 0, 0));

	}

}
