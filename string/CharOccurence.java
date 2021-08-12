package week1.day2.string;

/*Goal : To print the number of occurence of an character
 * Declare input string as "Welcome to Chennai" and count variable
 * store the string in char array
 * iterate the array for occurence of the character 'e' 
 * increment the count by 1 for each occurence
 * print the result 
 */

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Welcomeeeee to Chennai";
		int count = 0;

		char[] inputChar = input.toCharArray();         //storing in an array
		for (int i = 0; i < inputChar.length; i++) {

			if (inputChar[i] == 'e')                  //Comparing the charcter 'e' against the string elements
				count++;

		}
		System.out.println("The number of occurence of 'e' is : " + count);
	}

}
