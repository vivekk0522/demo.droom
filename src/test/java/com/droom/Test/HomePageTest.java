package com.droom.Test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.droom.Base.BaseTest;
import com.droom.Page.HomePage;

public class HomePageTest extends BaseTest
    

{
	
	static HomePage homepage;
	
    @BeforeTest
    public void beforeTest()
    {
    	BaseTest.launchBrowser(); 
    }
	
    
    
    @Test
    public void homePageTest()
    {
    	homepage= new HomePage();
    	
    	String title=homepage.verifyTitle();
    	Assert.assertEquals(title, "India's Most Trusted Motorplace to Buy & Sell Used Cars, Bikes, Scooters Online | Droom");
    	
    	String shopbyctgry = homepage.verifyHomePage();
    	Assert.assertEquals(shopbyctgry, "Shop by Category");
    	
    	homepage.clickOnSell();
    	String sellpg_title=homepage.verifySellPg();
    	Assert.assertEquals(sellpg_title, "Sell On Droom");
    	
    }
    
    @AfterTest
    public void afterTest()
    {
    	BaseTest.closeBrowser();
    }
	
}
