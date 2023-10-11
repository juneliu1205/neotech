package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class Hw15Login2 {
	@FindBy(xpath="//div[@class='orangehrm-logo']/following-sibling::form/div[1]/input")
	public WebElement username;
	
	@FindBy(xpath="//div[@class='orangehrm-logo']/following-sibling::form/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath="//div[@class='orangehrm-logo']/following-sibling::form/div[3]/button")
	public WebElement loginBtn;
	
	public Hw15Login2()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}