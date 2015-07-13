package com.teksystems;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Google {
	@Test
	public void goog() throws Exception{
		//WebDriver driver=new FirefoxDriver();
		Properties pro=new Properties();
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties");
		pro.load(fi);
		String browser=pro.getProperty("browser");
		WebDriver driver=null;
		try{
		if(browser.equals("firefox"))
			driver=new FirefoxDriver();
			
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe" );
			driver=new ChromeDriver();
			//Thread.sleep(1000);
		}
		else if(browser.equals("chrome")) 
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\IEDriverServer.exe" );
			driver=new InternetExplorerDriver(); 
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.err.println("Got error  :"+e);
		}	
		finally{
			driver.manage().window().maximize();
			driver.get("http://seleniumhq.org");
			driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='menu_download']/a")).click();
			Thread.sleep(4000);
			driver.findElement( By.xpath("//*[@id='menu_documentation']/a")).click();
			Thread.sleep(1000);
			driver.close();
		}
		
	}
		
}


