package com.teksystems;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandels {
	@Test
	public void win(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.monsterindia.com/");
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> mul=windows.iterator();
		while(mul.hasNext()){
			System.out.println(mul.next());
		}
		
		
	}
}
