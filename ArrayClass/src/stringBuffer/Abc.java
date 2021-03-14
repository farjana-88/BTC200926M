package stringBuffer;

import org.junit.Test;

public class Abc {

	@Test
	public void bgd() {
	
		String inputString = "I am string not reversed";
		
		 String[] words = inputString.split(" ");
         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            reverseString = reverseString + reverseWord + " ";
	        }
	         
	        System.out.println(inputString);
	         
	        System.out.println(reverseString);
	         
	        System.out.println("-------------------------");
	    }
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

