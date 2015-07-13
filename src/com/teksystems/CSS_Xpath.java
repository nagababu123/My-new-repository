package com.teksystems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CSS_Xpath {
	@Test
	public void m1(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		//driver.findElement(By.xpath("//*[@id='signIn' and @name='signIn']")).click();
		driver.findElement(By.xpath("//*[@id='UHSearchBox']")).sendKeys("yahoo");
		
		driver.findElement(By.cssSelector("a[text$='mes']")).click();
		System.out.println("pass");
		
	}

}
