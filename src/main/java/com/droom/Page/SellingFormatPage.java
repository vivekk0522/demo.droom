package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.droom.Base.BaseTest;

public class SellingFormatPage extends BaseTest
{
	
	@FindBy(xpath="//label[contains(text(),'QuickSell')]")
	WebElement  quicksell_text;
	
	@FindBy(xpath="//li[@id='quicksell']")
	WebElement  quicksell;
	
	@FindBy(xpath="//a[contains(text(),'Create Quicksell Listing')]")
	WebElement  createlisting_button;
	
	@FindBy(xpath="//h1[text()='Select a Selling Format']")
	WebElement  sellformat_page;
	
	@FindBy(xpath ="//h3[contains(text(),'Create a quicksell listing now')]")
	WebElement  createlistingpage_text;
	
	public SellingFormatPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifySellFormatPage()
	{
		return sellformat_page.getText();
	}
	
	public String verifySellFormat()
	{
		return quicksell_text.getText();
	}
	
	public void selectQuickSell()
	{
		quicksell.click();
	}
	
	public void clickOnCreateListing()
	{
		createlisting_button.click();
	}
	
	public String verfiycreatelisitngpage()
	{
		return createlistingpage_text.getText();
	}

}
