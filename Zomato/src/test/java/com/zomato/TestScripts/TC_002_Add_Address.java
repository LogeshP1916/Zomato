package com.zomato.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.Zomato_GenericUtility.BaseTest;

public class TC_002_Add_Address extends BaseTest {

	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
//		address = new Address(driver);
//
//		address.getAddressBox().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));

		System.out.println(fileUtility.readDataFromExcelFile("Sheet1", 0, 0));

	}

}
