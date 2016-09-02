package com.selenium.project.SeleniumDemo;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RodanFieldTest {


	@Test
	public void t1() throws Exception{

		//launch the firefox
		WebDriver driver= new FirefoxDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// setting timeout for implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//call URL in get method
		driver.get("https://www.rodanandfields.com/ca/");
		
		//verifying URL
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.rodanandfields.com/ca/");
	    
	    driver.findElement(By.xpath("//*[contains(text(),'SHOP SKINCARE')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[contains(text(),'All Products')]")).click();
	    
	   // Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.rodanandfields.com/ca/quick-shop/quickShop"),"we have not navigated to the desired site!!");

	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/main/section/div[1]/div/div[2]/div[2]/div[1]/input")).click();


	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/main/section/div[1]/div/div[2]/div[2]/div[1]/ul/li[1]/form/div/div[1]/div[2]/div")).click();
	   
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/main/section/div[1]/div/div[2]/div[2]/div[1]/input")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/main/section/div[1]/div/div[2]/div[2]/div[1]/ul/li[2]/form/div/div[1]/div[2]/div")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/main/section/div[1]/div/div[2]/div[2]/div[2]/input")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/main/section/div[1]/div/div[2]/div[2]/div[2]/ul/li[2]/form/div/div[1]/div[2]/div")).click();
	    
	    File sFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(sFile, new File("E:/Selenium_Shubham/screenshot1.jpg"));
	    
	    driver.quit();
	    
	    
	}
	
	
	@Test(priority=1)
	
	public void t2() throws Exception{
		
		        //launch the firefox
				WebDriver driver= new FirefoxDriver();

				// maximize the browser
				driver.manage().window().maximize();

				// setting timeout for implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				//call URL in get method
				driver.get("https://www.rodanandfields.com/ca/");
				
				//verifying URL
			    Assert.assertEquals(driver.getCurrentUrl(), "https://www.rodanandfields.com/ca/");
			    
			    driver.findElement(By.xpath("//*[contains(text(),'BECOME A CONSULTANT')]")).click();
			    
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();
			    Thread.sleep(2000);
			 
			    //focus another window
				String parentwin = driver.getWindowHandle();
				Set<String> allwin = driver.getWindowHandles();
				for (String s : allwin) {
					if (s.equals(parentwin) == false) {
						driver.switchTo().window(s);

					}
				}
			 
			    driver.findElement(By.xpath("//input[@id='sponserparam']")).sendKeys("test");	 
			    Thread.sleep(2000);
			    driver.findElement(By.xpath("//*[contains(text(),'SEARCH')]")).click();
			    
			    File sFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		        FileUtils.copyFile(sFile, new File("E:/Selenium_Shubham/screenshot2.jpg"));
			    
			    driver.quit();
	
	}


}
