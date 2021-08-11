package week1.day2;

import java.util.Arrays;

//Goal : to print the second largest number in the array
//declare the input of elements in array
//sort the array
//print the last before index of array

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,2,11,56,90,89,34,22};
		Arrays.sort(arr);                   //sorting in Ascending order 
		System.out.println("The second largest number is :" + arr[arr.length-2]);
		
	}

}
