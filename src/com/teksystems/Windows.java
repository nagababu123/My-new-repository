package com.teksystems;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windows {
	@Test
	public void win() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.hdfcbank.com/");
		System.out.println("main windos:"+driver.getWindowHandle());
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		Set<String> windos =driver.getWindowHandles();
		windos.size();
		Iterator<String>count=windos.iterator();
		/*while(count.hasNext()){
			System.out.println(count.next());
		}*/
		
		String mainwindow=count.next();
		String childwindow=count.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[6]/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("55555545456");
		
			
		
	}

}
