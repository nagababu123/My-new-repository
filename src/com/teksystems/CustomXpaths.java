package com.teksystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CustomXpaths {
	@Test
	public void cust(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email' an name='Email']")).sendKeys("hello");
	}

}
