package com.teksystems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllLinks {
	@Test
	public void links(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		WebElement box=driver.findElement(By.xpath("//*[@id='travelwidget']/div[2]/div/ul"));
		List<WebElement> linkss=box.findElements(By.tagName("a"));
		System.out.println(linkss.size());
		for(int i=0;i<linkss.size();i++){
			System.out.println(linkss.get(i).getText());
			linkss.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://timesofindia.indiatimes.com/");
			//cache
			box=driver.findElement(By.xpath("//*[@id='travelwidget']/div[2]/div/ul"));
			linkss=box.findElements(By.tagName("a"));
			System.out.println("***************************************************************");
			
		}
		
	}

}
