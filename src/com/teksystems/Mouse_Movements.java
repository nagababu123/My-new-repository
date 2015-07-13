package com.teksystems;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Movements {
	@Test
	public void mouse() throws Exception{
		FirefoxProfile fp=new FirefoxProfile();
		fp.setEnableNativeEvents(true);
		WebDriver driver=new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://timesofindia.indiatimes.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//*[@id='nav-city']/a"));
		a.moveToElement(menu).build().perform();
		Thread.sleep(9000);
		//driver.findElement(By.xpath("//*[@id='nav-city']/div/div/div/div[1]/ul/li[4]/a")).click();
		WebElement extract=driver.findElement(By.xpath("//*[@id='nav-city']/div/div"));
		List<WebElement>links=extract.findElements(By.tagName("a"));
		System.out.println(links.size());
		int total=links.size();
		Random r=new Random();
		links.get(r.nextInt(total)).click();
		System.out.println("page title is :"+driver.getTitle());
	}

}
