package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class Hw15Login {
	
	@FindBy(xpath="//form[@class='form-body']//div[1]//input")
	public WebElement username;
	
	@FindBy(xpath="//form[@class='form-body']//div[2]//input")
	public WebElement password;
	
	@FindBy(xpath="//form[@class='form-body']//div[3]//button")
	public WebElement loginBtn;
	
	public Hw15Login()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
} 


