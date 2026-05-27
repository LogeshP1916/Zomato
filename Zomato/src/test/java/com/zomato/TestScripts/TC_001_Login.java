package com.zomato.TestScripts;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.Zomato.POM.Login_page;
import Com.Zomato_GenericUtility.BaseTest;

public class TC_001_Login extends BaseTest {

	@Test
	public void login() throws IOException, InterruptedException {
		login = new Login_page(driver);

		login.getLogin_Btn().click();

		Thread.sleep(2000);

		driver.switchTo().frame(1);
		login.getPhNum().sendKeys(fileUtility.readDataFromPropertyFile("phoneNumber"));

		login.getSendOTP().click();

		Scanner scn = new Scanner(System.in);

		String otp = scn.next();

		driver.findElement(By.xpath("(//input[@inputmode='text'])[1]")).sendKeys(otp);

		String otp1 = scn.next();
		driver.findElement(By.xpath("(//input[@inputmode='text'])[2]")).sendKeys(otp1);
		String otp2 = scn.next();
		driver.findElement(By.xpath("(//input[@inputmode='text'])[3]")).sendKeys(otp2);
		String otp3 = scn.next();
		driver.findElement(By.xpath("(//input[@inputmode='text'])[4]")).sendKeys(otp3);
		String otp4 = scn.next();
		driver.findElement(By.xpath("(//input[@inputmode='text'])[5]")).sendKeys(otp4);

		String otp5 = scn.next();
		driver.findElement(By.xpath("(//input[@inputmode='text'])[6]")).sendKeys(otp5);

		Thread.sleep(5000);

		scn.close();

	}

}
