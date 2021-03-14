package arrayClass;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;


public class StringBuilder{
	public static void main(String[] args) {

		int []a ={5,8,9,0,12,8,9,0,5,25,26,5,8,9,0,12,12,12};
		int k=0;
		int b=a.length;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				k++;	
				if(k==1){
					System.out.println(a[j]);
				}
			}
		}
		
		
		
		//		
// Scanner input = new Scanner(System.in);
//
//	System.out.println("Please Enter 12 Numbers :");	
//		int [][][] A=new int[2][3][4];	
//		
//	 for(int a=0;a<=A.length;a++) {
//		for(int row=0;row<=A.length;row++) {
//			for(int col =0;col<=A.length;col++) {
//				System.out.printf("A[%d][%d][%d] = ",a,row,col);//%d specifies that the single variable is a decimal integer.
//				                                               //printf print formatted text.
//				
//				A[a][row][col]=input.nextInt();	
//			}
//		}
//	 }	 
//	 System.out.println(" ******");
//	 for(int a=0;a<=A.length;a++)
//	 {System.out.println("\n");//%n is a platform-independent newline character.
//		 
//	for(int row=0;row<=A.length;row++) {
//			for(int col =0;col<=A.length;col++) {
//			System.out.print("\t"+A[a][row][col]);}
//			System.out.println();
//		}	  
//	}
//	 System.out.println("*******************");
//	 
	
	//The first argument to printf is a string of identifiers. 
	//%s refers to a string 
	//%d refers to an integer 
	//%c refers to a character.
	//Therefore: %s%d%s%c\n prints the string "The first character in sting ",
	//%d prints i, 
	//%s prints " is ", and %c prints str[0].


	//How to find duplicate value from Arry?
//	 int[] num = {18, 25, 5, 25, 6, 76, 7, 18};
//		 for(int i =0; i<num.length;i++){
//			 for(int j=i+1;j<num.length;j++){
//				 if(num[i]==num[j])
//				 {
//					System.out.println("duplicate value is "+ num[i]);
//					  }//System.out.println("duplicate value is "+ ids[i]);
//		 }
//		 }
//}

//  int[] num1 = {18, 25, 5, 5,6,7,25,6,7,18,7,25,6,25,7,18,7};
//	
//  HashSet <Integer>langs =new HashSet();
//  
//  boolean flag =false;
//  
//	for(Integer A:num1){
//		//langs.add(A);
//		if(langs.add(A)==false){
//			System.out.println("Duplicate element;" +A);
//		}
//	}
//	 
//	
//}
//}
/*Declare and initialize an array.
 * Duplicate elements can be found using two loops. 
 * The outer loop will iterate through the array from 0 to length of the array. 
 * The outer loop will select an element. 
 * The inner loop will be used to compare the selected element with the rest of the elements of the array.
 * If a match is found which means the duplicate element is found then, display the element.

 * */

		//How to find duplicate value from Arry?

	
//					 {
//						System.out.println("duplicate value is "+ num[i]);
//						  }//System.out.println("duplicate value is "+ ids[i]);
//			 }
//			 }
	//}
		
	}}
