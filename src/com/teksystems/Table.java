package com.teksystems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Table {
	@Test
	public void webtable(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total rows :"+rows.size());
		/*for(int i=0;i<rows.size();i++){
			System.out.println(rows.get(i).getText());
		}*/
		List<WebElement>columns=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		
		List<WebElement>currency=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total columns:"+columns.size());
		String S= "Andhra Bank";
		for(int i=0;i<columns.size();i++){
			if(columns.get(i).getText().equals(S)){
			System.out.println(columns.get(i).getText()+"-------------->"+currency.get(i).getText());
			columns.get(i).findElement(By.tagName("a")).click();
			break;
		}
		
	}
	}
}


