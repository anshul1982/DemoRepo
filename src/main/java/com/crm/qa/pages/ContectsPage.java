package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContectsPage extends TestBase{


	@FindBy(xpath="//td[contains(text(),'Contacts']")
	WebElement ContactsLabel;



	public ContectsPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactLabel() {
		return ContactsLabel.isDisplayed();		
	}
	// checkbox name select
	public void selectContactsByName(String name) {
		driver.findElement(By.xpath("")).click();

	}

	public void createNewContact(String title) {
   Select select = new Select(driver.findElement(By.name("title")));
   select.selectByVisibleText(title);
	}

}
