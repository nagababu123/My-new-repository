package com.teksystems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExtractingAll_Links {
	@Test
	public void links(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/");
		WebElement link=driver.findElement(By.xpath("//*[@id='nav']/div[2]/ul"));
		List<WebElement> alllinks=link.findElements(By.tagName("a"));
		System.out.println("total links ------>:"+alllinks.size());
		for(int i=0;i<alllinks.size();i++){
			System.out.println(alllinks.get(i).getText());
		}
	}

}
