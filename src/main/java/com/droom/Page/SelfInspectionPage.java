package com.droom.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelfInspectionPage 
{
	@FindBy(xpath="//input[@id='front_tire_condition_and_air_pressure_rl']")
	WebElement fr_tyre_cond;
	
	@FindBy(xpath="//input[@id='rear_tire_condition_and_air_pressure_rl']")
	WebElement rr_tyre_cond;
	
	@FindBy(xpath="//input[@id='front_brake_condition_rl']")
	WebElement fr_brake_cond;
	
	@FindBy(xpath="//input[@id='rear_brake_condition_rl']")
	WebElement rr_brake_cond;
	
	@FindBy(xpath="//input[@id='battery_condition_rl']")
	WebElement btry_cond;
	
	@FindBy(xpath="//input[@id='headlamp_condition_rl']")
	WebElement hd_lamp;
	
	@FindBy(xpath="//input[@id='tail_lamp_condition_rl']")
	WebElement tl_lamp;
	
	@FindBy(xpath="//input[@id='switches_operation_rl']")
	WebElement swch_opr;
	
	@FindBy(xpath="//input[@id='mirrors_condition_rl']")
	WebElement mirror_cond;
	
	@FindBy(xpath="//input[@id='throttle_operation_rl']")
	WebElement thrtl_cond;

	@FindBy(xpath="//input[@id='suspension_front_forks_left_rl']")
	WebElement suspnsn_fr;
	
	@FindBy(xpath="//input[@id='suspension_rear_shocks_right_rl']")
	WebElement suspnsn_rr;
	
	@FindBy(xpath="//input[@id='transmission_rl']")
	WebElement transmission;
	
	@FindBy(xpath="//input[@id='centre_stand_condition_rl']")
	WebElement cntr_stnd_cond;
	
	@FindBy(xpath="//input[@id='side_stand_condition_rl']")
	WebElement side_stnd_cond;
	
	@FindBy(xpath="//form[@name='frm-Self_inspection_tab']//div[@class='checkbox']//input")
	WebElement declr_chkbx;
	
	@FindBy(xpath="//form[@name='frm-Self_inspection_tab']//div[@class='form-group']//input")
	WebElement save_btn;
	
	
	
	

}
