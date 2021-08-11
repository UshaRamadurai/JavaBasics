package week1.day2;
//Goal : To print the duplicate elements in an array
//declare the input of array with repeated elements
//use first for loop to iterate the array from 0 to the length-1
//use nested for loop till length of the array
//compare the elements by == operator
//increase the count if both the elements are same
//print the duplicate elements

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the array elements
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 17, 19, 18, 17, 20 };
		int count = 0;

		System.out.println("The duplicate elements of the array are :");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {    		//comparing both the values
					count++;
					System.out.println(arr[j]);  //printing the duplicates
				}

			}
		}
		if (count>0)
			
		System.out.println("The number of duplicates : "+ count);

	}

}
