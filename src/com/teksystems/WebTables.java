package com.teksystems;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTables {
	@Test
	public void table() throws Exception{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		//this xpath represents the all the rows in the table //table[@class='dataTable']/tbody/tr
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		//Total rows in the table
		System.out.println("Total rows in the table  :"+rows.size());
		//Extracting the table rows text
		/*for(int i=1;i<rows.size();i++){
			System.out.println(rows.get(i).getText());
		}*/
		List<WebElement>column=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		//Total columns in the table
		System.out.println("Total columns in the table:"+column.size());
		//get the 20th row data
		WebElement rowss=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[20]"));
		
		System.out.println(rowss.getText());
		//get complete column data for particular column
		List<WebElement> comp=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> price=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		List<WebElement> completetable=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		//get the particular company name and price
		String companyname="Andhra Bank";
		for (int i=0;i<comp.size();i++){
			if(comp.get(i).getText().equals(companyname)){
			System.out.println(comp.get(i).getText()+"------------->"+price.get(i).getText());
			WebElement link=comp.get(i);
			link.findElement(By.tagName("a")).click();
			break;
			}
		}
		
		//complete table data extracting
		for(int i=0;i<completetable.size();i++){
			System.out.println(completetable.get(i).getText());
		}
		
		
	}

}

