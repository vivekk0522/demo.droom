package com.droom.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.droom.Base.BaseTest;
import com.droom.Page.HomePage;
import com.droom.Page.SellOnDroomPage;
import com.droom.Page.SellingFormatPage;

public class SellingFormatPageTest extends BaseTest
{
	
	static HomePage homepage;
	static SellOnDroomPage sellpage;
	static SellingFormatPage sellformatpage;
	
	
	@BeforeTest
    public void beforeTest()
    {
    	BaseTest.launchBrowser();
    }
    
    @BeforeMethod
    public void beforeMethod()
    {
    	homepage= new HomePage();
    	sellpage=new SellOnDroomPage();
    	homepage.clickOnSell();
    	sellpage.selectAcc();
    	sellpage.clickOnCreateListing();
    }
    
    @Test
    public void verifySellFormatPage()
    {
    	sellformatpage = new SellingFormatPage();
    	
    	String sellformatpage_text= sellformatpage.verifySellFormatPage();
    	Assert.assertEquals(sellformatpage_text, "Select A Selling Format");
    	
    	String sellformat_text=sellformatpage.verifySellFormat();
    	Assert.assertEquals(sellformat_text, "QuickSell");
    	
    	sellformatpage.selectQuickSell();
    	
    	sellformatpage.clickOnCreateListing();
    	
    	String createlstngpg_text = sellformatpage.verfiycreatelisitngpage();
    	Assert.assertEquals(createlstngpg_text, "Create A Quicksell Listing Now");
    }
    
    @AfterMethod
    public void AfterMethod()
    {
    	BaseTest.dltcookies();
    }
    
    @AfterTest
    public void afterTest()
    {
    	BaseTest.closeBrowser();
    }

}
