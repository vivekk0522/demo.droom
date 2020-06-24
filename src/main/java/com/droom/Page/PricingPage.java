package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PricingPage 
{
	
	@FindBy(xpath="//button[contains(text(),'Choose OBV Price')]")
	WebElement choose_obv_price;
	
	@FindBy(xpath="//input[@id='selling_price']")
	WebElement sell_price;
	
	@FindBy(xpath="//input[@id='auto_accept_offer_no']")
	WebElement accept_offer_no;
	
	@FindBy(xpath="//input[@id='auto_reject_offer_no']")
	WebElement reject_offer_no;
	
	@FindBy(xpath="//input[@id='auction']")
	WebElement auction_chkbx;
	
	@FindBy(xpath="//form[@id='frm-price']//input[@type='submit']")
	WebElement save_btn;
	
	
}
