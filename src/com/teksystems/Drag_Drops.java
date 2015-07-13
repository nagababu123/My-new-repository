package com.teksystems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drops {
	@Test
	public void drag(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.snapdeal.com/products/mobiles-mobile-phones");
		WebElement drops=driver.findElement(By.xpath("//*[@id='slider-Price-id']/a[2]"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(drops, -100, 0);
		
	}

}
