package com.teksystems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void drop(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.apsrtconline.in");
		WebElement dropvalues=driver.findElement(By.xpath("//*[@id='concessionId']"));
		/*List<WebElement>alldroplist=dropvalues.findElements(By.tagName("option"));
		System.out.println("Total links :"+alldroplist.size());
		alldroplist.get(1).click();
		for(int i=0;i<alldroplist.size();i++){
			System.out.println(alldroplist.get(i).getText()+"---------------->"+alldroplist.get(i).getAttribute("selected"));
		}*/
		Select s=new Select(dropvalues);
		s.selectByIndex(3);
		
		
	}

}
