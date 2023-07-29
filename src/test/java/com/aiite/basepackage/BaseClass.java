package com.aiite.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static WebElement findElementById(String id){
		return driver.findElement(By.id(id));
		
	}

	public static WebElement findElementByXpath(String xpath){
		return driver.findElement(By.xpath(xpath));          //anonymous call
	}
	
	public static String readProperty(String key) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\MayProjectPOM\\src\\test\\resources\\Details\\Credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
		return value;
	}

}
