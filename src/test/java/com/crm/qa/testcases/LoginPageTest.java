package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	
	
	public LoginPageTest() {
		super(); //initialization of testbase properties
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

	@Test(priority=1)
	public void logintitlepage() {
	String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest() {
		boolean flag =loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
		
		
	
	
}
