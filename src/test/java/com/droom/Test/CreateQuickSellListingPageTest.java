package com.droom.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.droom.Base.BaseTest;
import com.droom.Page.CreateQuickSellListingPage;
import com.droom.Page.HomePage;
import com.droom.Page.KeyInformationPage;
import com.droom.Page.SellOnDroomPage;
import com.droom.Page.SellingFormatPage;

public class CreateQuickSellListingPageTest extends BaseTest
{
	static HomePage homepage;
	static SellOnDroomPage sellpage;
	static SellingFormatPage sellformatpage;
	static CreateQuickSellListingPage createquicksell;
	static KeyInformationPage keyinfopage;
	
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
    	sellformatpage = new SellingFormatPage();
    	createquicksell=new CreateQuickSellListingPage();
    	homepage.clickOnSell();
    	sellpage.selectAcc();
    	sellpage.clickOnCreateListing();
    	sellformatpage.selectQuickSell();
    	sellformatpage.clickOnCreateListing(); 


    }
    
    @Test
    public void createQuickSellListingTest() throws InterruptedException
    {
    	String createlstngpg_text = createquicksell.verfiycreatelisitngpage();
    	Assert.assertEquals(createlstngpg_text, "Create A Quicksell Listing Now");
    	
    	createquicksell.enterFirstName("Vivek");
        Assert.assertTrue(createquicksell.verifyEnteredFirstName().equals("Vivek"));
    	
        createquicksell.enterLastName("Kashyap");
        Assert.assertTrue(createquicksell.verifyEnteredLastName().equals("Kashyap"));
        
    	createquicksell.enterEmailId("test@drootestm.in");
    	Assert.assertTrue(createquicksell.verifyEnteredEmailId().equals("test@drootestm.in"));
    	
    	createquicksell.enterPhoneNumber("9876543210");
    	Assert.assertTrue(createquicksell.verifyEnteredPhoneNumber().equals("9876543210"));
    	
    	createquicksell.selectCategory("Car");
    	Assert.assertTrue(createquicksell.verifySelectedcategory().equals("Car"));
    	
    	createquicksell.selectProductManually();
    	createquicksell.selectmake();
    	createquicksell.selectModel();
    	createquicksell.selectYear();
    	createquicksell.selectTrim();
    	
    	
    	createquicksell.enterPinCode("226024");
    	Assert.assertTrue(createquicksell.verifyEnteredPinCode().equals("226024"));
    	
    	createquicksell.enterKMDriven("10000");
    	Assert.assertTrue(createquicksell.verifyEnteredKMDriven().equals("10000"));

    	createquicksell.enterRegistrationNumber("DL4CBC1010");
    	Assert.assertTrue(createquicksell.verifyEnteredRegistrationNumber().equals("DL4CBC1010"));
    	
    	createquicksell.clickOnCreateMyListing();
    	
    	createquicksell.clickONRegularMarketplace();
    	
    	Assert.assertTrue(createquicksell.verfiyRegCreateListingPage().equals("Key Information"));
    	
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
