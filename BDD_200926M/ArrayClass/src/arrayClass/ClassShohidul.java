package arrayClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassShohidul {
	
//		String sentance="how are you";
//		//sentance.concat(" doing")
//		String [] words=sentance.split(" ");
//		//StringBuffer sb=new StringBuffer();
//		//how are you--woh era uoy
//		//pick the word
//		for(String word:words) {
//			for(int i=word.length()-1;i>=0;i--) {
//				sb.append(word.charAt(i));
//			}
//			sb.append(" ");
//		}
//		System.out.println(sb.toString().trim());
//		//reverse the word
//		//add the space
//		//hold in another variable and extra last space need to be trimed 
//	}
//}
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
	
	public void countDuplicateCharacter() {
		//how are you---h---1,o---1
	}
	public void getUniqueChar() {
		
	}
	@Test
	public void getDuplicateChar() {
		String s="united state of america";
		char[] c=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap();
		for(Character x:c) {
			if(h.containsKey(x)) {
				h.put(x, h.get(x)+1);
			}else
				h.put(x, 1);
		}
		Iterator<Entry<Character,Integer>> i=h.entrySet().iterator();
		while(i.hasNext()) {
			Entry<Character,Integer> e=i.next();
			System.out.println(e.getKey()+" count is "+e.getValue());
		}
		
//		for(Object f:h) {
//			System.out.println(f);
//		}
	}
	
	WebDriver dr;
	@Test
	public void testMenu() {
		String [] x=getActValue(dr.findElements(By.xpath("xpath of menu")));
		String[] y= {"Men","Women"};
		compare(x,y);
	}
	
	
	

}


