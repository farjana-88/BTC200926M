package arrayClass;

import java.util.Arrays;

public class ClassWork {
   
	public static void main(String[] args) {
		/*date Structure
		 * data organization,management,and
		 * storage format that enables efficient access and mosification
		 * More Precisely, a data structure is a collection of data values,
		 * the relations among them,and the function or operations that
		 * can be applied to the date
		 * 
		 * CRUd Function
		 * 
		 * Colloection of elements identified by index
		 * 
		 * dynamic so grows
		 * 
		 * part of core
		 * part of framework
		 * 
		 * assignment operator used to assign
		 * methods are used
		 * 
		 * contains primitives or object
		 * only object
		 * 
		 * fixed size
		 * Dynamic
		 * 
		 * homogeneous
		 * hetterogebeous
		 * 
		 * 
		 * definition:an Arrau is a container object that holds a
		 * fixed number of values of a single type
		 * length is established at the time of creation
		 */ 
		 //two ways of initialization
		 int size =10;
		 int []ids = new int [size];
		 ids[0]=142;
		 ids[1]=56;
		 ids[2]=144542;
		 ids[3]=997;
		 ids[4]=6;
		 ids[5]=74;
		 ids[6]=3465;
		 ids[7]=334;
		 ids[8]=978;
		 ids[9]=46;
		 System.out.println(ids[3]);
		 
		 int number[]={11,22,33,44 };
		 System.out.println(number[3]);
		 for(int i = 0; i<ids.length;i++){
			 System.out.println(ids[i]);
		 }
		 
		 System.out.println("**************");
		 for(int i:number){
			 System.out.println(i);
		 }
		 
		
		 int [][][]id = new int [2][3][4];
		 
		 id[0][0][0]=1;
		 id[0][1][0]=10;
		 id[0][2][0]=100;
		 id[0][0][1]=2;
		 id[0][1][1]=20;
		 id[0][2][1]=200;
		 id[0][0][2]=3;
		 id[0][1][2]=30;
		 id[0][2][2]=300;
		 id[0][0][3]=4;
		 id[0][1][3]=40;
		 id[0][2][2]=400;
		 //all methods Arrays class all throw a NullPointer Execption
		 
		 //string []name ={"Name1","Name2","Name3"};
		 Arrays.sort(ids);
		 
		 for(int i:ids){
			System.out.println(i); 
		 }
		 for (int i:number){
			 System.out.println(i);
		 }
		int index=Arrays.binarySearch(ids, 46);
		System.out.println(index);
		///******************************************///***********
		// How to get Max/mim number?
		int max= ids[0];
		for(int i=1; i<ids.length;i++){
			if(ids[i]>max){
				max = ids[i];
			}
		}
//		int max= ids[9];
//		for(int i=ids.length-1; i>0;i--){
//			if(ids[i]>max){
//				max = ids[i];
//			}
//		}
		 System.out.println("Largest"+max);
		 
		 int min =ids[0];
		 for(int i=1; i<ids.length;i++){
			 if(ids[i]<min){
				 min=ids[i];
			 }
		 }
		 System.out.println("Smallest" + min);
		 
		 System.out.println("*******************");
		 
		 
//		 //Retun and Use parametererized array 
		 String students []=getArrayOfStudents(ids);
//sum of two largest int
		 int largeOne=ids[0],
				 largeTwo=0;
		 for(int i=1;i<ids.length;i++){
			 if(ids[i]>largeOne){
				 largeTwo= largeOne;
				 largeOne=ids[i];
			 }
			
		 }
		 System.out.println(largeOne);
		 System.out.println(largeTwo);
//		 System.out.println("*^^^^^^^^^^^^^^^^^^^^^^^^^*");
//	//How to find duplicate value from Arry?
//		 for(int i =0; i<ids.length;i++){
//			 for(int j=i+1;j<ids.length;j++){
//				 if(ids[i]==ids[j]){
//					 System.out.println("duplicate value is "+ ids[i]);
//					 return true;
//				 }
//		 }
//		 }
//		 
//		 String Student[]= getArryOfStudent();
//		 setArryOfStudentids();
//		 	 
	}

	private static String[] getArrayOfStudents(int[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String[] getArryOfStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
