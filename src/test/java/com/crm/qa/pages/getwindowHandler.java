package com.crm.qa.pages;

import java.util.Iterator;
import java.util.Set;


import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class getwindowHandler extends TestBase{

	public getwindowHandler() {
		super();
		}
	
	@Test
	public void getWindow(){

		initialization();

		Set<String> obj = driver.getWindowHandles();
		Iterator<String> itr = obj.iterator();
	
		while (itr.hasNext()){
			//itr.next();
			
			driver.switchTo().window((String) itr.next()).close();
			System.out.println("closed all windows");
			
			//driver.quit();
		}

	}

}
