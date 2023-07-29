package com.aiite.pageexecution;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

public class LoginPageExecution {
	
	@Test
	public void testLoginFunction() {
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl("https://www.facebook.com/");
		LoginPage lp = new LoginPage();
		lp.userName.sendKeys("azharudeen@gmail.com");
		lp.passWord.sendKeys("Welcome@123");
		System.out.println("Login Function");
		lp.loginBtn.click();
		//validation.
//		BaseClass.closeBrowser();
	}
	
	@Ignore
	@Test
	public void checkSignUpLink() {
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl("https://www.facebook.com/");
		LoginPage lp1 = new LoginPage();
		lp1.signupLink.click();
		System.out.println("Singup Link Check");
		//validation.
//		BaseClass.closeBrowser();
	}
	
	@Before
	public void beforeMethod() {
		BaseClass.browserLaunch();
		BaseClass.loadUrl("https://www.facebook.com/");
		System.out.println("Before Method");
	}
	
	@After
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("After Method");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class - DB Connection Open");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class - DB Connection Close");
	}
	
//	public static void main(String[] args) {
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl("https://www.facebook.com/");
//		LoginPage lp = new LoginPage();
//		lp.userName.sendKeys("azharudeen@gmail.com");
//		lp.passWord.sendKeys("Welcome@123");
//		System.out.println(4/0);
//		lp.loginBtn.click();
		//validation.
//		BaseClass.closeBrowser();
		
//		BaseClass.browserLaunch();
//		BaseClass.loadUrl("https://www.facebook.com/");
//		LoginPage lp1 = new LoginPage();
//		lp1.signupLink.click();
		//validation.
//		BaseClass.closeBrowser();
//	}

}
