package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContectsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utility.TestUtil;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContectsPage contactsPage;

	public HomePageTest() {
		super();
	}


	@BeforeMethod()
	public void setup() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactsPage = new ContectsPage();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void verifyHomePageTitelTest() {
		String homePageTitle =homePage.varifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO", "Home Page tile not matched");

	}

	@Test(priority=2)
	public void verifyUsernameTest() {
		testUtil.SwithToFrame();
		Assert.assertTrue(homePage.varifyCorrectUserName());
	}

	@Test(priority=3)
	public void verifyContactLinkTest() {
		testUtil.SwithToFrame();
		contactsPage= homePage.ClikonContactLink();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}





}
