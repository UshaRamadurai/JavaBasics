package week3.day2.practice;
//Goal : Code to find intersection elements of two arrays using List

//Declare two arrays of int type in list
//Use retainall() to find the common elements
//Print the result

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFindIntersection {

	public static void main(String[] args) {

		// Declare the two array of elements in ArrayList
		List<Integer> listArr1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> listArr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
		
		System.out.println("The First list is :" + listArr1);
		System.out.println("The Second list is :" + listArr2);

		// Finding the common elements
		listArr1.retainAll(listArr2);

		// Printing the result
		System.out.println("The common elements in both lists are :" + listArr1);

	}

}
