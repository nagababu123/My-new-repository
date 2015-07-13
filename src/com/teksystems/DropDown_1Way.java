package com.teksystems;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;

public class DropDown_1Way {
	@Test
	public void drop(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.apsrtconline.in");
		WebElement dropdown=driver.findElement(By.xpath("//*[@id='concessionId']"));
		//dropdown.sendKeys("CAT CARD");
		List<WebElement>alldropdown=dropdown.findElements(By.tagName("option"));
		
		alldropdown.get(4).click();
		System.out.println("total dropdown values :"+alldropdown.size());
		for(int i=0;i<alldropdown.size();i++){
			System.out.println(alldropdown.get(i).getText()+"------------"+alldropdown.get(i).getAttribute("selected"));
			/*File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile, new File("E:\\impage.jpg"));*/
		}
	}

}
