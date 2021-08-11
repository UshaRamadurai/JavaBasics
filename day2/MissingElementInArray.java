package week1.day2;
//Goal : Finding the missing element in the given array
//Input : arr = {0,1,2,3,4,7,6,8}
//Use for loop to iterate till length of the array
//compare the values of iterator to array element by not equal operator
//print the missing number and abort the loop.

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 1, 2, 3, 4, 7, 6, 8 };
		//sorting the array in ascending order to compare
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			//comparing the index number against array element
			if (i != arr[i]) {
				System.out.println("The missing element of array is :" + i);
				break;       //aborting the entire loop once finding the missing element
			}
		}

	}

}
