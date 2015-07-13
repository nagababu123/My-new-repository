package com.teksystems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllLinks2Way {
	 WebDriver driver;
	@Test
	public void links() throws Exception{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://timesofindia.indiatimes.com/");
	Thread.sleep(10000);
	String path1="//*[@id='real estatewidget']/ul[1]/li[";
	String path2="]/a";
	int i=2;
	while(isElementpresent(path1+i+path2)){
		String text=driver.findElement(By.xpath(path1+i+path2)).getText();
		System.out.println(text);
		driver.findElement(By.xpath(path1+i+path2)).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.get("http://timesofindia.indiatimes.com/");
		i ++;
		
	}
	//driver.quit();
	
	

	}
	public boolean isElementpresent(String element_xpath){
		int count=driver.findElements(By.xpath(element_xpath)).size();
		if(count == 0)
			return false;
		else
			return true;
}
}