package week3.day2.practice;
//Goal : Code to remove the duplicate characters in given string using collections
//Using Set here to remove the duplicates

import java.util.LinkedHashSet;
import java.util.Set;

public class Paypal {

	public static void main(String[] args) {
		
		//Input the string
		String str = "PayPal India";
		
		//Converting to lowercase and removing whitespace characters
		String text1 = str.toLowerCase();
		String str1 = text1.replace(" ", "");
		
		//Printing the final input
		System.out.println("The input string is :" + str1 );
		
		//Converting the string the character array 
		char[] charArr = str1.toCharArray();
			
		//Declaring two Sets for Character set and duplicate character set
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> duplicateSet = new LinkedHashSet<Character>();
		
		//Copying each character of input in Characterset and duplicates in duplicateset
		for (Character eachChar : charArr) {
			
			boolean add = charSet.add(eachChar);
			if(!add)
				duplicateSet.add(eachChar);
		}
		
		//Printing both the results
		System.out.println("The Duplicates are :" + duplicateSet );
		System.out.println("After removal of Duplicates :" + charSet);

	}

}
