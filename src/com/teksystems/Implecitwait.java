package com.teksystems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Implecitwait {

	@Test
	public void imp() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		//Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='rso']/div[2]/li[1]/div/h3/a")).isDisplayed();
	}
	
}
