package week1.day2.string;
//Goal : To Print a string with UpperCase at its odd numbered indeces
//declare the string variable
//implement for loop from 0 to length of string
//Store each character of string in new char variable
//set the condition to print uppercase for odd index
//print the other with lowercase

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "changeme";

		for (int i = 0; i < text.length(); i++) {

			char changeText = text.charAt(i);       //Storing by character
			
			if (i % 2 == 0) {                      // condition check for even number
				System.out.print(Character.toLowerCase(changeText));
			} else
				System.out.print(Character.toUpperCase(changeText));

		}

	}

}
