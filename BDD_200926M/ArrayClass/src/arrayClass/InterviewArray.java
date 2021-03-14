package arrayClass;

import java.util.Arrays;
import java.util.Iterator;

public class InterviewArray {
	
	// getMissingNo function for 
	// finding missing number
	static int getMissingNo(int a[], int n)
	{
	    int n_elements_sum = n * (n + 1) / 2;
	    int sum = 0;
	 
	    for(int i = 0; i < n - 1; i++)
	        sum += a[i];
	         
	    return n_elements_sum - sum;
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int a[] = { 1, 2, 4, 5, 6 };
	    int n = a.length + 1;
	    int miss = getMissingNo(a, n);
	     
	    System.out.print(miss);
	
		
	
	 //How to find duplicate elements in a given Array?
	
	String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };

    for(int i=0; i < arr1.length; i++){
        for(int j=i+1; j < arr1.length; j++) {
            
            if(arr1[i].equals(arr1[j]) && i!=j ) {
                System.out.println("Duplicate in Array is : "+ arr1[j]);

            }
        }
        }
    
    //How to find the intersection of two arrays in java
    /* Print both given arrays
     * Loop through first array till the first  array length
     * Inside first array loop,  loop the second array  till the length   of the second array
     *  Compare elements of first array to the elements of the second array
           
                                 
     *  Print resulting  array   showing intersection of the two given arrays
     * */
 
    int myArray1[] = {23, 36, 96, 78, 55};
    int myArray2[] = {78, 45, 19, 73, 55};
    System.out.println("Intersection of the two arrays ::");
   
    for(int i = 0; i<myArray1.length; i++ ) {
       for(int j = 0; j<myArray2.length; j++) {
          if(myArray1[i]==myArray2[j]) {
             System.out.println(myArray2[j]);
          }
       }
    }

    //Find out smallest and largest number in a given Array?
    //// How to get Max/mim number?
    /*Logic to find the smallest and largest number in a given Array is given below :
     *  Create two variables for storing largest and smallest number.
     *   Initialize smallest variable with value Integer.MAX_VALUE
     *   Initialize largest variable with value Integer.MIN_VALUE
     *   In each traversal of for loop, we will compare the current element with the largest and smallest number.
     *    We will update the value.
     *   If a number is larger than largest, then it can not be smaller than the smallest. 
     *   So we can skip if first condition is true.

     * 
     */
    		
    // Given Array
    int[] inputArr = {10,43,27,98,75,59,191};

    // Setting largest value
    int largest = inputArr[0];

    // Setting smallest value
    int smallest = inputArr[0];

    // Iterate through the Given Array
    for( int number : inputArr ) {
        if(number > largest) {
            largest = number;
        }
        else if (smallest > number) {
            smallest = number;
        }
    }
    System.out.println("Largest and Smallest numbers are " 

                        + largest +" "+smallest);
    
    
  //How to Reverse Integer or String Array in Java with Example   
    
    
    int [] input= {3,7,8,9,10,20};
    //print array before reverse
    System.out.println("Array without reverse"+ Arrays.toString(input));
   
    for(int i = input.length-1; i>=0;i--) {
    	System.out.println(input[i] + "  ");
    }
    
    
    //How To Move Zeros To End Of An Array?
    /*Logic to separate zeros and non-zeros is given below :
     *  Initialize variable counter to 0.
     *  Iterating inputArr from left to right. If inputArr[i] is not zero then assign inputArr[i] to inputArr[counter].
     *   Increment the counter by 1.
     *    Assign the remaining elements with 0 value.
     * 
     */
    
    int [] abc ={0,10,43,27,0,98,75,59,191,0};
    int counter= 0;////Initializing counter to 0
    
  //Traversing inputArray from left to right
    for(int i =0;i<abc.length;i++) {
    	//If inputArray[i] is non-zero
    	if(abc[i]!=0) {
    		abc[counter]=abc[i]; //Assigning inputArray[i] to inputArray[counter]
    		counter++; //Incrementing the counter by 1
    	}	
    }
    while(counter<abc.length) { //Assigning zero to remaining elements
    	abc[counter]=0;
    	counter++;
    }
    	System.out.println(Arrays.toString(abc));
    
    
    	//How To Bring Zeros To The Front Of An Array?
    
     int [] inputArray= {0,10,43,27,0,98,75,59,191,0};
   
      int count = inputArray.length-1;//Initializing counter to position of last element
      
      for(int i=inputArray.length-1; i>=0; i--) {//Traversing the inputArray from right to left
    	  if(inputArray[i]!=0) {//If inputArray[i] is non-zero
    		  inputArray[count]=inputArray[i];//Assigning inputArray[i] to inputArray[counter]
    		  count--; //Decrementing the counter by 1
    	  }
      }
    
    //Assigning 0 to remaining elements
    while(count>=0) {
    	inputArray[count]=0;
    	count--;
    }
    
    System.out.println(Arrays.toString(inputArray));
    
    

//Write a program to find second largest element in a given Array in java?

// Given Array
  int inputArray1[] = new int[] {10,43,27,98,75,59,191};

  // Sort Array
  Arrays.sort(inputArray);

  // Iterate Array to Second last element

  for(int i=0; i < inputArray.length; i++) {
      // Print second last element
      if(i == inputArray.length- 2)
          System.out.println(inputArray[i]);
  }
 }
    
    
}





	
		
	
	
	
	
	
	

	
	

