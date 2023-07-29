package com.aiite.pageexecution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.AdactinDemo;


public class AdactinDemoExecution {
	
	@Test
	public void adactinLogin() {
//		String expectedUrl = "https://adactinhotelapp.com/SearchHotel.php";
		String expectedString="Hello anandhakrishnan!";
		BaseClass.browserLaunch();
		BaseClass.loadUrl("https://adactinhotelapp.com/");
		AdactinDemo ad = new AdactinDemo();
		ad.userName.sendKeys("anandhakrishnan");
		ad.passWord.sendKeys("Test@2023");
		ad.loginBtn.click();
//		String actualUrl = BaseClass.getCurrentUrl();
//		Assert.assertEquals(expectedUrl, actualUrl);
//		BaseClass.closeBrowser();
		String actualString = ad.userShow.getAttribute("value");
		Assert.assertEquals(expectedString, actualString);
		Assert.assertTrue(expectedString.equals(actualString));
		System.out.println(actualString);
		Assert.assertNotNull(actualString);
		
	}

}
