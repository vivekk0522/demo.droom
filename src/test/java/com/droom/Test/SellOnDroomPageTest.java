package com.droom.Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.droom.Base.BaseTest;
import com.droom.Page.HomePage;
import com.droom.Page.SellOnDroomPage;

public class SellOnDroomPageTest extends BaseTest
{
	static HomePage homepage;
	static SellOnDroomPage sellpage;
	
	
	@BeforeTest
    public void beforeTest()
    {
    	BaseTest.launchBrowser();
    }
    
    @BeforeMethod
    public void beforeMethod()
    {
    	homepage= new HomePage();
    	homepage.clickOnSell();
    	
    }
    
    @Test
    public void verfiySellPage()
    {
    	sellpage=new SellOnDroomPage();
    	
    	String pagetitle=sellpage.verifySellPg();
    	Assert.assertEquals(pagetitle, "Sell On Droom");
    	
    	String acctype = sellpage.verifyAccType();
    	Assert.assertEquals(acctype, "Individual Account");
    	
    	sellpage.selectAcc();
    	sellpage.clickOnCreateListing();
    	
    	String sellformatpage= sellpage.verifysellformatpage();
    	Assert.assertEquals(sellformatpage, "Select A Selling Format");
    	
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
