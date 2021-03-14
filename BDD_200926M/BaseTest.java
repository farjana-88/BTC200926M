package com.bit;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver dr;
	@Before
   public void start() {
	 
	
		String b= System.getProperty("browser");
		if(b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/Oni-Tani/Downloads/chromedriver");
			dr= new ChromeDriver();	
		}
		else if (b.equals("Firefox")) {
			dr= new FirefoxDriver();
		}
		dr.get("https://www.express.com/");
		dr.findElement(By.xpath("//button[@id='closeModal']")).click();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.manage().window().maximize();
 }
}
