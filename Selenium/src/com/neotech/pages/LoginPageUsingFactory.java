package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LoginPageUsingFactory {

	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginBtn;
	
	
	public LoginPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
