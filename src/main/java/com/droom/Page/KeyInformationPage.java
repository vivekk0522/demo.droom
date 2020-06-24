package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.droom.Base.BaseTest;

public class KeyInformationPage extends BaseTest
{

	@FindBy(xpath="//label[text()='Black']/..//input")
	WebElement black_color;
	
	@FindBy(xpath="//span[@id='select2-location-container']")
	WebElement select_location;
	
	@FindBy(xpath="//input[@id='vehicle_registration_number']")
	WebElement reg_number;
	
	@FindBy(xpath="//label[contains(text(),'Show Registration Number to Buyer')]/..//input")
	WebElement shwregnumber_chkbx;
	
	@FindBy(xpath="//span[@id='select2-registration_state-container']")
	WebElement reg_state;
	
	@FindBy(xpath="//input[@id='kilometers_driven']")
	WebElement km_driven;
	
	@FindBy(xpath="//select[@id='number_of_owners']")
	WebElement num_of_owner;
	
	@FindBy(xpath="//select[@id='condition_grading']")
	WebElement cond_grad;
	
	@FindBy(xpath="//input[@id='Key_Information']")
	WebElement save_btn;
	
	public KeyInformationPage()
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void chooseColor()
	{
		black_color.click();
	}
	
}
