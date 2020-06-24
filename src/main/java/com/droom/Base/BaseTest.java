package com.droom.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.droom.utility.Util;
import com.droom.utility.WebEventListener;

public class BaseTest 
{
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver event_driver;
	public static WebEventListener eventListener;
	
	public BaseTest()
	{
		try 
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\USQA-Eclipse\\droom\\src\\main\\java\\com\\droom\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		 
	}
	
	public static void launchBrowser()
	{
		System.setProperty(prop.getProperty("chrome_driver"), prop.getProperty("chrome_driver_path"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		//Util.disableGeoLocation();
		
		event_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		event_driver.register(eventListener);
		driver = event_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.pageload_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("open_cart_url"));
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}

	
	public static void waitForElement() throws InterruptedException
	{
		Thread.sleep(Util.sleep);
	}
	
	public static void clickable(WebElement element, int timeout)		
	
	{
		new WebDriverWait(driver , timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));

	}
	
	public static void dltcookies()
	{
		driver.manage().deleteAllCookies();
	}

}
