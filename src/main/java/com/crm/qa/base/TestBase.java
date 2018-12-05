package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.utility.TestUtil;
import com.crm.qa.utility.WebEventListner;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_Driver;
	public static WebEventListner eventListener;
	
	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\anshul\\eclipsworkspace\\Automation\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {

		String browserName= prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver",prop.getProperty("chromeBrowserPath"));
			//System.setProperty("WebDriver.chrome.driver","D:\\anshul\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			//System.setProperty("WebDriver.geco.driver","D:\\anshul\\Drivers\\geckodriver.exe");
			System.setProperty("WebDriver.geco.driver",prop.getProperty("gecoDriverPath"));
			driver = new FirefoxDriver();

		}

		e_Driver =new EventFiringWebDriver(driver);
		eventListener = new WebEventListner();
		e_Driver.register(eventListener);
		driver =e_Driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implisit_WAIT,TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}