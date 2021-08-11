package week1.day2;
//Goal : To find the same elements in 2 set of array elements
//Declare two arrays of int type 
//declare first for loop from 0 to array length
//declare another for loop from 0 to array length
//Compare the each element of one loop with other by providing comparison operator
//Print the same elements of both array


public class FindIntersection {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		//declaring 2 arrays with few same elements
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		System.out.println("The same elements in both arrays are");
		
		//two for loops to compare
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if (arr1[i]==arr2[j]) {         //condition to check the same element
					System.out.println(arr1[i]);
				}
				
			}
			
		}

	}

}
