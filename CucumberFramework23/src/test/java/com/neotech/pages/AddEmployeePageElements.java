package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods {

	

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(xpath ="//span[normalize-space()='PIM']")
	public WebElement pmi;
	
	@FindBy(xpath = "//span[normalize-space()='Add Employee']")
	public WebElement addemployee;
	
	@FindBy(id = "first-name-box")
	public WebElement fName;
	
	@FindBy(id = "middle-name-box")
	public WebElement middleName;
	
	@FindBy(id = "last-name-box")
	public WebElement lName;
	
	@FindBy(id = "employeeId")
	public WebElement eid;
	
	@FindBy(id = "location")
	public WebElement location;
	
	@FindBy(xpath = "//div[@class='custom-control custom-switch']")
	public WebElement switchbutton;
	
	@FindBy(id = "username")
	public WebElement uName;
	
	@FindBy(id = "password")
	public WebElement pw;
	
	@FindBy(id = "confirmPassword")
	public WebElement confirmpassWord;
	
	@FindBy(id = "modal-save-button")
	public WebElement save;
	
	@FindBy(id = "pim.navbar.employeeName")
	public WebElement waitvisibility;
	
	
	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

}