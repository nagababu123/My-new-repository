package com.teksystems;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Movement {
	@Test
	public void mouse() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement city=driver.findElement(By.xpath("//*[@id='nav-city']/a"));
		Actions a=new Actions(driver);
		a.moveToElement(city).build().perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='nav-city']/div/div/div/div[1]/ul/li[4]/a")).click();
		System.out.println("page titel-1"+driver.getTitle());
		WebElement link=driver.findElement(By.xpath("//*[@id='nav-city']/div/div"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		
		System.out.println("Total links :"+links.size());
		int size=links.size();
		Random r=new Random();
		
		links.get(r.nextInt(size)).click();
		System.out.println("page titel-2"+driver.getTitle());
		
	}

}
