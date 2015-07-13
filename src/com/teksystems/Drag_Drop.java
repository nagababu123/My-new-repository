package com.teksystems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop {
	@Test
	public void drag(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com/products/mobiles-mobile-phones");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		WebElement drop=driver.findElement(By.xpath("//*[@id='slider-Price-id']/a[2]"));
		a.dragAndDropBy(drop, +200, 0).build().perform();
		
	}

}
