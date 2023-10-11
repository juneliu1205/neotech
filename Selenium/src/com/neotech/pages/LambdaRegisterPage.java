package com.neotech.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LambdaRegisterPage {

	
	@FindBy(xpath="//form[@class='form reg-custom']/div[2]/div/input")
	public WebElement passwordBox;
	
	@FindBy(xpath="//input[@id='userpassword']/following-sibling::div/span")
	public WebElement show;
	
	@FindBy(xpath="//input[@id='userpassword']/../../preceding-sibling::div/input")
	public WebElement businessEmail;
	
	public LambdaRegisterPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}