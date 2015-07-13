package com.teksystems;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window_Handling {
	@Test
	public void windos() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://hdfcbank.com");
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Set<String>multiwindows=driver.getWindowHandles();
		System.out.println(multiwindows.size());
		Iterator<String>it=multiwindows.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/*String mainwin=it.next();
		String childwin=it.next();
		System.out.println(mainwin);
		System.out.println(childwin);
		driver.switchTo().window(childwin);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[6]/a/img")).click();
		*/
	
		
	}

}
