package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContectsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utility.TestUtil;

public class ContactsPageTest extends TestBase{
	TestUtil testUtil; 
	LoginPage loginPage;
	ContectsPage contectsPage;
	HomePage homePage;
	
public ContactsPageTest() {
	super();
	}


@BeforeMethod()
public void setup() {
	initialization();
	testUtil = new TestUtil();
	loginPage = new LoginPage();
	contectsPage = new ContectsPage();
	homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	testUtil.SwithToFrame();
	contectsPage= homePage.ClikonContactLink();
	
	
}


@Test(priority=1)

public void VerifyContactPageLevel() {
	Assert.assertTrue(contectsPage.verifyContactLabel(), "Contact page lavel is missing");
			
}

public void SelectContactsTest() {
	contectsPage.selectContactsByName("test2 test2");
	contectsPage.selectContactsByName("ui ui");
}

@DataProvider
public Object[][] GetCrmTestData() {
	Object data[][]=testUtil.getDataFromSheet("Contacts", 2, 1);
	return data;
	
}





@AfterMethod
public void teardown() {
	driver.quit();
}
	
}
