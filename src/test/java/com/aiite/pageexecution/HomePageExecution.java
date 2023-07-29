package com.aiite.pageexecution;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.HomePage;

public class HomePageExecution {
	
	@Test
	public void laptopSearch() {
		HomePage hp = new HomePage();
		hp.searchBox.sendKeys("Laptop");
		hp.searchBtn.click();
		System.out.println("Laptop Search Function");
	}
	
	@Before
	public void beforeMethod() {
		BaseClass.browserLaunch();
		BaseClass.loadUrl("https://www.amazon.in/");
		System.out.println("Before Method");
	}
	
	@After
	public void afterMethod() {
		BaseClass.closeBrowser();
		System.out.println("After Method");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class - VPN Connection Open");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class - VPN Connection Close");
	}

}
