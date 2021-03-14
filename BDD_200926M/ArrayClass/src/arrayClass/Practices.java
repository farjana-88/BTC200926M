package arrayClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Practices {
	

	 static ChromeDriver dr;
	 @BeforeClass
	   public static void openBrowser(){
		   
		   System.setProperty("webdriver.chrome.driver", "/Users/Oni-Tani/Downloads/chromedriver");
		
		   dr = new ChromeDriver();
		
	}
	 @Before
	   public void goToAnyWebsite(){
		   
		   dr.get("https://www.target.com/");	
		   dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   }
//
// @Test
// public void abc() {
//	 dr.findElement(By.id("secondary")).click();  //deals
//	 

		public String[] getUserData(List<WebElement> elements) {
			String actualValue[] =new String[elements.size()];
			
			int i = 0;
			for(WebElement element:elements) {
				actualValue[i] = element.getText();
				i++;
			}
			return actualValue;
		}
		
   @Test
		public void abc() throws InterruptedException {
			dr.findElement(By.id("secondary")).click();  //deals
			String a[] = getUserData(dr.findElements(By.xpath("//div[@id='secondaryMenu']/ul/li")));
			
			for(int i=1; i<a.length; i++) {
				Thread.sleep(5000);
				dr.findElement(By.xpath("//div[@id='secondaryMenu']/ul/li["+i+"]/a")).click();
				System.out.println(dr.getTitle());
				System.out.println(a[i]);
				dr.navigate().back();
				dr.findElement(By.id("secondary")).click();  //deals
			}
		}
	
   
   public String[] getActValue(List<WebElement> elements) {
		String [] acV=new String[elements.size()];
		int i=0;
		for(WebElement element:elements) {
			String text=element.getText();
			acV[i]=text;
			i++;
		}
		
     return acV;
	}
	public void compare(String [] acv,String[] exv) {
		for(int i=0;i<acv.length;i++) {
			if(acv[i].equals(exv[i])) {
				System.out.println("true");
			}else
				System.out.println("false");
		}
	}
	
	@Test
	public void testMenu() {
		String [] x=getActValue(dr.findElements(By.xpath("xpath of menu")));
		String[] y= {"Men","Women"};
		compare(x,y);
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
 }























