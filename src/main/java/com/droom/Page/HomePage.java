package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.droom.Base.BaseTest;
import com.droom.utility.Util;

public class HomePage extends BaseTest
{
	
	@FindBy(xpath="//span[contains(text(),'Shop by Category')]")
	WebElement homepage_shopbycatgry;
	
	@FindBy(xpath="//span[text()='Sell']/ancestor::a")
	WebElement sell_btn;
	
	@FindBy(xpath="//h1[text()='Sell on Droom']")
	WebElement sell_page_title;
	 
	
	public HomePage()
	{
		PageFactory.initElements(driver, this); 
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	
	public String verifyHomePage()
	{
		return homepage_shopbycatgry.getText();
		
	}
	
	public void clickOnSell()
	{
		clickable(sell_btn, Util.wait);
		sell_btn.click();
	}
	
	public String verifySellPg()
	{
		return sell_page_title.getText();
	}

}
