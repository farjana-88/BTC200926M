package arrayClass;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork {
	static ChromeDriver dr;
	@BeforeClass
  public static void openBrowser(){

	  System.setProperty("webdriver.chrome.driver", "/Users/Oni-Tani/Downloads/chromedriver");
		
	   dr = new ChromeDriver();
	}
	
	@Before
	   public void goToAnyWebsite(){
		   
		   dr.get("https://www.target.com/"); 
		   dr.manage().window().maximize();
		   dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		   //dr.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	} 
	@Test
	public void bcd() throws InterruptedException{
		Thread.sleep(5000);
		abc();
	}
	
	
	
	
	public boolean abc() throws InterruptedException{
		String [] headerMenu= {"Categories","Deals","Whats New","Pickup & Delivery"};
		Thread.sleep(5000);
		List<WebElement> expectedheaderMenu=dr.findElements(By.xpath("//div[@id='header']/nav/a"));
	int a=expectedheaderMenu.size();
	Thread.sleep(5000);
	System.out.println(a);
		for(int i =0;i<expectedheaderMenu.size(); i++ ){
			Thread.sleep(5000);
			dr.findElement(By.xpath("//div[@id='header']/nav/a["+ i +"]")).click();
			//String header=expectedheaderMenu.get(i).getText();
			Thread.sleep(5000);
			if(headerMenu.equals(expectedheaderMenu)){
				System.out.println(dr.getTitle());
				return true;
			}
			dr.navigate().back();
		}
		return false;
	 
	}
   
	
	 
	
	
	
	
	
}
