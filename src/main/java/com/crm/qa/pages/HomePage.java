package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

//
	@FindBy(xpath="//td[contains(text(),'User: Anshul Agrawal')]")
	WebElement UserNameLabel;

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactLink;

	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;

	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;

	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String varifyHomePageTitle() {
		return driver.getTitle();	
	}

	public boolean varifyCorrectUserName() {
		return UserNameLabel.isDisplayed();
	}
	
	 
	public ContectsPage ClikonContactLink() {
		ContactLink.click();
		return new ContectsPage(); 
	}

	public DealsPage ClikonDealsLink() {
		DealsLink.click();
		return new DealsPage(); 
	}

	public TaskPage ClikonTaskLink() {
		TasksLink.click();
		return new TaskPage(); 
	}

	public void clickOnNewcontactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(ContactLink).build().perform();
		newContactLink.click();	
		
	}
	
}
