package arrayClass;


	import java.util.List;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import junit.framework.Assert;
	public class ClassAsad {
	
		/*
		 * 
		 * What is array? An array is a container object that holds a fixed number of
		 * values of a single type. The length of an array is established when the array
		 * is created. After creation, its length is fixed.
		 * 
		 */
		int a = 10;
		String s = "abc";
		String color[] = { "blue", "Pink" };
		int e[] = { 1, 2, 3, 4, 5 };
		// e[0] = 1;
		ChromeDriver dr;

		@Test
		public void sample() {
			int anArray1[] = new int[10];
			int anArray[];
			anArray = new int[5];
			anArray[0] = 100;
			anArray[1] = 200;
			anArray[2] = 300;
			anArray[3] = 400;
			anArray[4] = 500;
			// anArray[5] = 600;

			int q = anArray.length;
			for (int i = 0; i < q; i++) {
				System.out.println(anArray[i]);// it will print in insertion order
			}

			for (int i = q - 1; i >= 0; i--) {
				System.out.println(anArray[i]);// it will print value by reverse order
			}

		}

		/*
		 * sort (); copyOf (); binarySearch (); asList ();
		 * 
		 * How to get max or minimum number?(done) 
		 * How to return an array?(done) 
		 * How to parameterized an array?(done) 
		 * How to declare double dimension array?(done) 
		 * Return the sum two largest integers in an array?(done)
		 * 
		 * Selenium practice.........
		 */
		@Test
		public int[] returnAnArray() {

			int a[] = new int[5];
			int j = 0;
			for (int i = 1; i <= 20; i++) {
				if (i % 4 == 0) {
					a[j] = i;
					System.out.println(i + "  " + j);
					j++;
				}
			}
			return a;

		}

		
		public String[] getUserData(List<WebElement> elements) {
			String actualValue[] =new String[elements.size()];
			
			int i = 0;
			for(WebElement element:elements) {
				actualValue[i] = element.getText();
				i++;
			}
			return actualValue;
		}

		void abc() {
			String a[] = getUserData(dr.findElements(By.id("")));
			
			for(int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
		}
		
		void compareData(String actual[], String expected[]) {
			
			for(int j=0; j<actual.length; j++) {
				Assert.assertEquals(actual[j], expected[j]);
			}
			
		}
		
		void sp() {
			String color[] = { "blue", "Pink" };
			compareData(color, color);
		}
		
		
		//TBD
		//copy()
		//asList()
		//return using scanner 
		
		
		
		
		
		
		
		
		
		
	}

