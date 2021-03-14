package arrayClass;

public class ab {
   /*1>What is array? Why we need an array?

   Array is a container which hold same type of value and fixed size. When you need more than one value in a same variable .


     17 Q: Can u tell me how to get max or minimum number from an array?

   int a[]={4,76,4,8,9};

   int max=a[0];

  for(int i=1;i<a.length;i++){

   if(a[i]>max)//if u just say a[i]<max tahole 

   minimum number paben.

   {

    max=a[i];

   }

  }

   syso(max)


  2> Q: How to get a private variable in another class?



   By using getter setter method(getter mean read, setter mean write)

   Example:

   private int a=8;

  int getA()
  {

  return a;

  }

   int setA(int x)
   {

   a=x;

  return a;

   }


   3> Q: How to get an array as a descending order or ascending ?

   Ans:int a[]={6,8,7,9,4}; 

  Arrays.sort(a);

    for(int i=0;i<a.length;i++)
  {

    syso(a[i]);

  }

   for(int i=a.length-1;i>=0;i--)
   {

    syso(a[i]);

  }


   * 
Q.What is abstraction in Java?
Q.How to divided a string?
Q.How to reverse a string?
Q.How to reverse a string by word?
Q.How to remove special character from a string?
Q.How to find duplicate character from a string?
Q.How to get second a from "united state of america"
Q.Difference between string and stringbuffer?
Q.Difference between stringbuffer and stringbuilder?
Q.is given string is polyndrom or not?
Q.What is maven?What is maven lifecycle?
Q.What are the common command use in maven?
Q.What contains pom.xml?
Q.What is .m2 folder?
Q.Describe page object model?
Q.How was your cucumber framework?
Q.How to create feature file?
Q.What are the cucumber option used?
Q.Difference between scenario outline and Datatable?
Q.How to install cucumber ?
Q.What is array?is all array is object or not?
Q.How to copy one array to another array?
Q.How to get max number from an array?
Q.How to find duplicate number from an array?
Q.How to print an array in descending order?
Q.Difference between while and do while loop?
Q.Difference between for loop and enhanced loop?
Q.How switch statement work?
Q.How to handle exception?
Q.Difference between throw and throws clause?
Q.What  are the combination in try catch and finally block?
Q.difference between final ,finally and finalize ?
Q.Can we use more than one catch block ?if yes what is the sequence?
Q.What is System.exit()?

&&&&&&&************&&&&&&&
Java Array Facts:
Arrays are objects which can store collection of same type of elements
An array has a certain number of elements in a fixed order
Accessing an invalid array index causes an exception
Arrays are objects,and are created on the heap, not the stack
Big-O Complexity of operations Access Θ(1), Search Θ(n), Insertion Θ(n), Deletion Θ(n).
Question: What is Array in Java? or how does array works internally?
Answer: Array is a data structure which store multiple variables of the same type.
 It can hold primitive types as well as object references.

In simple words an array is used to store a collection of data, array is declared like this

dataType[] arrayRefVariable = new dataType[arraySize];
These are some important facts of array

Arrays are of fixed length(Static length)
Array can hold same type of data
Arrays can even hold the reference variables of other objects
Arrays are objects,and are created on the heap, not the stack
Question: Can you change size of Array in Java once created?
Answer: Arrays are static, which means that we cannot change the size of array once created.
 If you need dynamic array, consider using ArrayList class, which can resize itself.

Question: Can you use Generics with Array in Java?
Answer: No, Generics cannot be used with array. That is why sometime List is better choice over array in Java.
Question : Why do length of array is referred as length - 1 ?

Values of an array are accessed by using index and by default array starts from index zero.

so if array lenght is 10 then first value 1 is actually placed at index zero and last value 10 is placed at index 9.so.

We always subtract -1 from array length to point to the last index location.

Question: Difference between Array Index Out OF Bounds and ArrayStoreException?
ArrayIndexOutOfBoundsException: is thrown when the code tries to access an invalid index for a given array
 e.g. negative index or higher index than length - 1. While,

ArrayStoreException: is thrown when you try to store an element of another type  then the type of array.
e.g; if array is of type int and we try to add element of type String.

Question: Can you pass the negative number as an Array size?
No. You can’t pass the negative integer as an array size.
 If you pass, there will be no compile time error but you will get NegativeArraySizeException at run time.


public class MainClass
{
    public static void main(String[] args)
    {
        int[] array = new int[-5]; 	//No compile time error
         
        //but you will get java.lang.NegativeArraySizeException at run time
    }
}
Question: What is an anonymous array in Java? Give example?
Answer: Anonymous array is an array without reference.

Here is an  example

 public static void main(String[] args) { 
//Anonymous Array creation 
  System.out.println(new int[]{6,7, 3, 1, 9}.length);
  System.out.println(new int[]{91, 34, 55, 24, 31}[1]); 
  
   }
}
 
Question: Can you assign an Array of 100 elements to an array of 10 elements?
Answer: Yes, In Java an Array of 100 elements can be assigned to an Array of 10 elements.  
The only conditions is that, they should be of same type. 
Because while assigning values the compiler checks only type of the array and not the size.
 Here is code example written in Java.
public class ArrayCopyClass
{
    public static void main(String[] args)
    {
        int[] arrayWitTen = new int[10];
         
        int[] arrayWith100 = new int[100];
         arrayWitTen=arrayWith100;
      } 
}
 
Question: What are the different ways of copying an array into another array in Java?
Answer: There are four methods available in java to copy an array.

 Using for loop
 Using Arrays.copyOf() method
 Using System.arraycopy() method
Using clone() method

Question: What are jagged arrays in java? Give example?
Answer: Jagged arrays in java are type of arrays which have different length.

And Jagged arrays are multidimensional Arrays. 

Here is an example of jagged Arrays

public class JaggedArraysExampleInJava
{
    public static void main(String[] args)
    {
        //One Dimensional Array with length 3
        int[] OneDimensionalArray3 = {1, 2, 3};
 
        //One Dimensional Array with length 4
        int[] oneDimensionalArray4 = {4, 5, 6, 7};
 
        //One Dimensional Array with length 5
        int[] oneDimensionalArray5 = {8, 9, 10, 11, 12};
 
        //Jagged Two Dimensional Array
        int[][] twoDimensionalArray = {OneDimensionalArray3, oneDimensionalArray4, oneDimensionalArray5};
 
        //Printing elements of Two Dimensional Array
        for (int i = 0; i < twoDimensionalArray.length; i++)
        {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
            {
                System.out.print(twoDimensionalArray[i][j]+”");
            }
            System.out.println();
        }
    }
}
Question: How do you check the equality of two arrays in java?
Answer: You can use Arrays.equals() method to compare one dimensional arrays and to compare multidimensional arrays, use Arrays.deepEquals() method.

Question: Where does Java Array is stored in memory?
Answer: Array is created in heap space of JVM memory. Since array is object in Java.

Even if you create array locally inside a method or block, object is always allocated memory from heap.

Question: Which access modifiers can be used to declare Arrays in Java?
Answer: In Java Array can be declared as PRIVATE, PUBLIC, PROTECTED, and without any modifiers.

Following table gives an overview about the accessibility of array for different access modifiers.

            | Class | Package | Subclass | Subclass | World
            |       |         |(same pkg)|(diff pkg)| 
————————————+———————+—————————+——————————+——————————+————————
public      |   +   |    +    |    +     |     +    |   +     
————————————+———————+—————————+——————————+——————————+————————
protected   |   +   |    +    |    +     |     +    |   o     
————————————+———————+—————————+——————————+——————————+————————
no modifier |   +   |    +    |    +     |     o    |   o
————————————+———————+—————————+——————————+——————————+————————
private     |   +   |    o    |    o     |     o    |   o

+ : accessible
o : not accessible
Question: Are Array thread safe in Java?
In general reading from array is Thread-Safe Operation but modifying an array its not.

Question: What is time complexity of different Array operations in terms of big o notation?
Operation	Performance	Description
Access	 Θ(1)	 This means very fast because we read from each index
Search	 Θ(n)	'n' represents no. of elements in array. And it means search operation is  slow as we need to iterate all elements in array to search for one specific element
Insertion	 Θ(n)	 same as above.
Deletion	 Θ(n)	 same as above.
=
   */
}
