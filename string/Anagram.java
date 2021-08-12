package week1.day2.string;

/*Goal : To check the elements of inputted strings are same or not
 * check the length of the string
 *store the string in char array and sort them
 *compare both array of characters and print the result  
 */

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops", text2 = "potss";
		char[] text1Char = null, text2Char = null;
		
		if(text1.length() == text2.length()) {   //comparing the length
				
			 text1Char = text1.toCharArray();   //storing the string in array of characters
			 text2Char = text2.toCharArray();
			 
			 Arrays.sort(text1Char);           // sorting the characters
			 Arrays.sort(text2Char);
								
			boolean result = Arrays.equals(text1Char, text2Char);  //comparing both the strings
				System.out.println("Both the elements of strings are Same : " + result);
			}
		else
			System.out.println("The length of both the strings are not equal");
		
		}
	

	}

