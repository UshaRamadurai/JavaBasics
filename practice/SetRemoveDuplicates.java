package week3.day2.practice;
//Goal : Code to remove duplicate strings using Set
//Input be "Program to to remove duplicate duplicate words words in a a string"
//Use Linkedhashset to maintain the insertion order and  to remove duplicates
//Using foreach loop to print the result

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetRemoveDuplicates {

	public static void main(String[] args) {

		//Input the string
		String text = "Program to to remove duplicate duplicate words words in a a string";
		
		//Split the string and store it in a array
		String[] textArr = text.split(" ");
		
		//Copy the string array to Linkedhashset
		Set<String> strSet1 = new LinkedHashSet<String>(Arrays.asList(textArr));
		
		//Print the result
		for (String string : strSet1) {
			System.out.print(string + " ");
		}
		
	}

}
