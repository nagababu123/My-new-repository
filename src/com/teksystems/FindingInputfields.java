package com.teksystems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindingInputfields {
	@Test
	public void inputfields(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		List<WebElement> inputfields=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(inputfields.size());
		inputfields.get(0).sendKeys("1");
		inputfields.get(1).sendKeys("2");
		inputfields.get(2).sendKeys("3");
		inputfields.get(3).sendKeys("4");
		inputfields.get(4).sendKeys("5");
		inputfields.get(5).sendKeys("6");
		inputfields.get(6).sendKeys("7");
		inputfields.get(7).sendKeys("8");
		
	}

}
