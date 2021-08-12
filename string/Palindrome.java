package week1.day2.string;
//Goal : Code to check the string is palindrome or not
//Input the string and  another string to store reverse of it
//iterate from last index to the first index of the string
//Store that into reverse string variable
//Compare both the strings and print the result

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original = "madam", reverse = "";
		int n = original.length();              //getting the length of string

		for (int i = n - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);          // storing character in the reverse string
		}

		System.out.println("The original string is : " + original);
		System.out.println("The reversal string is : " + reverse);

		if (original.equals(reverse))                      //comparing the strings
			System.out.println("Yes, the string is a palindrome");
		else
			System.out.println("No, the string is not a palindrome");

	}

}
