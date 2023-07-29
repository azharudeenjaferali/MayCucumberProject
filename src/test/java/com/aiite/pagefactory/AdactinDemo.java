package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class AdactinDemo extends BaseClass {
	
	public AdactinDemo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement passWord;
	
	@FindBy(id="login")
	public WebElement loginBtn;
	
	@FindBy(id="username_show")
	public WebElement userShow;
	
	@FindBy(xpath="//*[text()='Click here']")
	public WebElement errorMsg;

}
