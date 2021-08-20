package week2.day2.practice4;
//Goal : Code to add the digits from an alphanumeric string
//let the input be "Te13st24di46g3i45t"
//Removing alphabets : Replace all the non-digit character to ""
//convert the string into array
//Iterate the array and add get character
//convert character into integer value 
//Add the digits and print the sum

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		//Declaring the string and sum integer
		String text = "Te13st24di46g3i45t";
		int sum = 0;
		
		//Removing alphabets
		text = text.replaceAll("\\D", "");
		System.out.println("After replcement :" + text);
		
		//Conversion to Array
		char[] textArray = text.toCharArray();
		
		//Converting to integer and adding to sum in each iteration 
		for (int i = 0; i < textArray.length; i++) {
			sum = sum + Character.getNumericValue(text.charAt(i));
		}
		
		//Printing the result
		System.out.println("The sum of digits from string is :" + sum);

	}

}
