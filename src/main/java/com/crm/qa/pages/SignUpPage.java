package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {

@FindBy(name= "first_name")
WebElement FirstName;

@FindBy(name= "surname")
WebElement LastName;

@FindBy(name= "email")
WebElement Email;

@FindBy(name= "email_confirm")
WebElement ConfirmEmail;

@FindBy(name= "username")
WebElement UserName;

@FindBy(name= "password")
WebElement Password;

@FindBy(name= "passwordconfirm")
WebElement ConfirmPassword;

public SignUpPage() {
	PageFactory.initElements(driver, this);
}



public void Signup(String Fname, String Lname, String Email, String CEmail, String Uname, String Pass, String ConfPass) {
	
// Will write a xls code
	
}

}