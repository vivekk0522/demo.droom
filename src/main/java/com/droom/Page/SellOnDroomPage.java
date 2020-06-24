package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.droom.Base.BaseTest;

public class SellOnDroomPage extends BaseTest
{
	@FindBy(xpath="//h1[text()='Sell on Droom']")
	WebElement sellpage_text;
	
	@FindBy(xpath="//label[contains(text(),'Individual Account')]")
	WebElement  indaccount_text;
	
	@FindBy(xpath="//label[contains(text(),'Individual Account')]/ancestor::div[@class='accountList']")
	WebElement  indaccount;
	
	@FindBy(xpath="//a[contains(text(),'Create Listing')]")
	WebElement  createlisting_button;
	
	@FindBy(xpath="//h1[text()='Select a Selling Format']")
	WebElement  sellformat_page;
	
	public SellOnDroomPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String verifySellPg()
	{
		return sellpage_text.getText();
	}
	
	public String verifyAccType()
	{
		return indaccount_text.getText();
	}
	
	public void selectAcc()
	{
		indaccount.click();
	}
	
	public void clickOnCreateListing()
	{
		createlisting_button.click();
	}
	
	public String verifysellformatpage()
	{
		return sellformat_page.getText();
	}
}