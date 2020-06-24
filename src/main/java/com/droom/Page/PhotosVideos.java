package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotosVideos 
{

	@FindBy(xpath="//span[text()='Photos/   Video']")
	WebElement page_title;
	
	@FindBy(xpath="//div[contains(@class,'kv-fileinput-caption')]")
	WebElement upload_img;
	
	@FindBy(xpath="//div[@id='photo']//div//input[@type='submit']")
	WebElement save_btn;
	
	@FindBy(xpath="//form[@id='my-dropzone']//input[contains(@name,'listing_id')]")
	WebElement upload_photos;
	
	@FindBy(xpath="//form[@id='my-dropzone']")
	WebElement upload_photos_form;
	
	
	
	
}
