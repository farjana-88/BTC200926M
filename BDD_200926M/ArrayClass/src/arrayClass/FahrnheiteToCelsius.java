package arrayClass;
import java.util.Scanner;

public class FahrnheiteToCelsius {

		public static void main(String arg[])	
		{
		    double f,c;
	             	    Scanner input=new Scanner(System.in);
		    System.out.println("Choose type \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
	                   int ch=input.nextInt();
		    switch(ch)
		    {
		    case 1:  System.out.println("Fahrenheit temperature");
	                   	  f=input.nextDouble();
		    	  
		    	  c=5/9*(f-32);
		    	  System.out.println("Celsius temperature is = "+c);
			  break;
		    case 2:  System.out.println("Celsius temperature");
	                   	  c=input.nextDouble();
	                   	  
		    	  f=(9/5*c)+32;
		    	  System.out.println("Fahrenheit temperature is = "+f);
			  break;
		   default:  System.out.println("valid choice");
		   }  
	                   
		
		} 
	}
	
	
	

