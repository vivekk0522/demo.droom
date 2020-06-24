package com.droom.Page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.droom.Base.BaseTest;

public class CreateQuickSellListingPage extends BaseTest
{
	static int i;
	
	@FindBy(xpath ="//h3[contains(text(),'Create a quicksell listing now')]")
	WebElement  createlistingpage_text;
	
	@FindBy(id ="first_name")
	WebElement  firstname;
	
	@FindBy(id="last_name")
	WebElement  lastname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement  email;
	
	@FindBy(id="mobile_phone")
	WebElement  phone_no;
	
	@FindBy(xpath="//select[@id='category_id']")
	WebElement  category_id;
	
	@FindBy(xpath="//input[@id='product_title']")
	WebElement  product;
	
	@FindBy(id="entermanually")
	WebElement  enterproductmanually;
	
	@FindBy(xpath="//select[@id='make']")
	WebElement  select_productmake;
	
	@FindBy(xpath="//select[@id='model']")
	WebElement  select_productmodel;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement  select_productyear;
	
	@FindBy(xpath="//select[@id='trim']")
	WebElement  select_producttrim;
	
	@FindBy(id="product_search_results")
	List<WebElement>  searchresult;
	
	@FindBy(xpath="//input[@id='pincode']")
	WebElement  pincode;
	
	@FindBy(id="kms_driven")
	WebElement  km_driven;
	
	@FindBy(id="vehicle_registration_number")
	WebElement  reg_number;
	
	@FindBy(xpath="//button[text()='Create My Listing']")
	WebElement  createlisting_button;
	
	@FindBy(id="takemetoregularmarketplace")
	WebElement  regmrktplace_button;
	
	@FindBy(xpath="//span[contains(text(),'Key Information')]")
	WebElement  regcreatelistingpage;
	
	
	
	public CreateQuickSellListingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verfiycreatelisitngpage()
	{
		return createlistingpage_text.getText();
	}
	
	public void enterFirstName(String frstname)
	{
		firstname.sendKeys(frstname);
	}
	
	public String verifyEnteredFirstName()
	{
		return firstname.getAttribute("value");
	}
	
	public void enterLastName(String lstname)
	{
		lastname.sendKeys(lstname);
	}
	
	public String verifyEnteredLastName()
	{
		return lastname.getAttribute("value");
	}
	
	public void enterEmailId(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public String verifyEnteredEmailId()
	{
		return email.getAttribute("value");
	}
	
	public void enterPhoneNumber(String phnumber)
	{
		phone_no.sendKeys(phnumber);
	}
	
	public String verifyEnteredPhoneNumber()
	{
		return phone_no.getAttribute("value");
	}
	
	public void selectProductManually()
	{
		enterproductmanually.click();
	}
	
	
	public void selectmake()
	{
		BaseTest.clickable(select_productmake, 20);
		select_productmake.click();
		Select select=new Select(select_productmake);
		select.selectByIndex(i=1);
		
	}
	
	public void selectModel()
	{
		BaseTest.clickable(select_productmodel, 20);
		select_productmodel.click();
		Select select=new Select(select_productmodel);
		select.selectByIndex(i=1);
		
	}
	
	public void selectYear()
	{
		BaseTest.clickable(select_productyear, 20);
		select_productyear.click();
		Select select=new Select(select_productyear);
		select.selectByIndex(i=1);
		
	}
	
	public void selectTrim()
	{
		BaseTest.clickable(select_producttrim, 20);
		select_producttrim.click();
		Select select=new Select(select_producttrim);
		select.selectByIndex(i=1);
		
	}
	
	public void selectCategory(String category)
	{
		BaseTest.clickable(category_id, 20);
		category_id.click();
		Select select=new Select(category_id);
		select.selectByVisibleText(category);
		
	}
	
	public String verifySelectedcategory()
	{
		Select select=new Select(category_id);
		return select.getFirstSelectedOption().getText();
	}
	
	public  void enterProductName(String name) throws InterruptedException
	{
		product.sendKeys(name);
		Thread.sleep(10);
		for(int i=0; i<searchresult.size(); i++)
		{
			if(searchresult.get(i).getText().contains(name));
			{
				
				String productxpath = "//li[contains(text(),'"+name+"')]";
				driver.findElement(By.xpath(productxpath)).click();
			}
		}
		
	}
	

	public void enterPinCode(String pin)
	{
		pincode.sendKeys(pin);
	}
	
	public String verifyEnteredPinCode()
	{
		return pincode.getAttribute("value");
	}
	
	public void enterKMDriven(String km)
	{
		km_driven.sendKeys(km);
	}
	
	public String verifyEnteredKMDriven()
	{
		return km_driven.getAttribute("value");
	}
	
	public void enterRegistrationNumber(String rgnumber)
	{
		reg_number.sendKeys(rgnumber);
	}
	
	public String verifyEnteredRegistrationNumber()
	{
		return reg_number.getAttribute("value");
	}
	
	public void clickOnCreateMyListing()
	{
		BaseTest.clickable(createlisting_button, 10);
		createlisting_button.click();
	}
	
	
	public void clickONRegularMarketplace() throws InterruptedException
	{
			BaseTest.clickable(regmrktplace_button, 20);
			regmrktplace_button.click();
		
	}
	
	public String verfiyRegCreateListingPage()
	{
		
		return regcreatelistingpage.getText();
	}
	
	
	
	
	
	
	
	
	
	
	

}
