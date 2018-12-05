package com.crm.qa.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

/**
 * @author aagrawal
 *
 */
public class WebEventListner extends TestBase implements WebDriverEventListener{
	
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		  
		 
		 System.out.println("inside method afterChangeValueOf on " + element.toString());
		 }
		 
		 public void afterClickOn(WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("inside method afterClickOn on " + element.toString());
		 }
		 
		 public void afterFindBy(By by, WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Find happened on " + by.toString() 
		 + " Using method " + by.toString());
		 }
		 
		 public void afterNavigateBack(WebDriver driver) {
		 // TODO Auto-generated method stub
		 
		 System.out.println("Inside the after navigateback to " + driver.getCurrentUrl());
		 }
		 
		 public void afterNavigateForward(WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Inside the afterNavigateForward to " + driver.getCurrentUrl());
		 }
		 
		 public void afterNavigateTo(String url, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Inside the afterNavigateTo to " + url);
		 }
		 
		 public void afterScript(String url, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Inside the afterScript to, Script is " + url);
		 }
		 
		 public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 
		 System.out.println("Inside the beforeChangeValueOf method");
		 }
		 
		 public void beforeClickOn(WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("About to click on the " + element.toString());
		 
		 }
		 
		 public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Just before finding element " + by.toString());
		 
		 }
		 
		 public void beforeNavigateBack(WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Just before beforeNavigateBack " + driver.getCurrentUrl());
		 
		 }
		 
		 public void beforeNavigateForward(WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Just before beforeNavigateForward " + driver.getCurrentUrl());
		 
		 }
		 
		 public void beforeNavigateTo(String url, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Just before beforeNavigateTo: '" + url + "'");
		 }
		 
		 public void beforeScript(String url, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Just before beforeScript " + url);
		 }
		 
		 public void onException(Throwable error, WebDriver driver) {
		 System.out.println("Exception occured : " + error);
		 
		 try {
			  TestUtil.takeScreenshotAtEndOfTest();
		 } catch(IOException e) {
			 e.printStackTrace();
		 }
		 
		 }

		public void beforeAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		public void beforeSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public <X> void beforeGetScreenshotAs(OutputType<X> target) {
			// TODO Auto-generated method stub
			
		}

		public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
			// TODO Auto-generated method stub
			
		}

		public void beforeGetText(WebElement element, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		public void afterGetText(WebElement element, WebDriver driver, String text) {
			// TODO Auto-generated method stub
			
		}

}
