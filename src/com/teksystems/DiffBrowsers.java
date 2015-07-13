package com.teksystems;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DiffBrowsers {
	@Test
	public void diffbr() throws Exception{
		
		Properties pro=new Properties();
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\teksystems\\OR.properties");
		pro.load(fi);
		WebDriver driver=null;
		String browser=pro.getProperty("browser");
		
		if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","F:\\Selenium_Workspace\\SampleProject\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		driver.get("http://seleniumhq.org");
		driver.findElement(By.xpath("//*[@id='menu_projects']/a")).click();
		driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
		driver.close();
	}

}
