package week3.day2.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Goal : Sorting elements using Collections in Java

public class CollectionsList {

	public static void main(String[] args) {

		// Declare a String array and add the Strings values to list
		String[] str1 = { "Aspire systems", "CTS", "Wipro", "HCL" };
		List<String> str2 = new ArrayList<String>(Arrays.asList(str1));

		// Getting the length of the Array
		int sizeOfArray = str1.length;
		System.out.println("The length of the list is :" + sizeOfArray);
		
		// Sort the list
		Collections.sort(str2);
		System.out.println("The Sorted List is :" + str2);
		
		//Iterate it in the reverse order
		Collections.reverse(str2);
		System.out.println("The reversed List is :" + str2);
		   
		
		}

}
