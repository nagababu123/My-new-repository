package com.teksystems;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Upload {
	@Test
	public void screen() throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://angular-file-upload.appspot.com/");
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(""));*/
		//cmdLine[1]
		Process process=new ProcessBuilder(System.getProperty("user.dir")+"\\src\\com\\teksystems\\upload1.exe","","Open").start();
	}

}


