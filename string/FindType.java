package week1.day2.string;

/*Goal : Code to pull the numbers of different data types in a string
 * input string as " && Welcome To The 8th Month of the Year 2021 &&"
 * declare varaibles for each data type
 * store the string in char array
 * iterate till length of the string and inspect the specific data type
 * increment the count and print the number of occurences 
 */
public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring the variables and input
		String input = "&& Welcome To The 8th Month of the Year 2021 &&";
		int space = 0, number = 0, letter = 0, spChar = 0;

		char[] inputArr = input.toCharArray();          //converting to character array

		for (int i = 0; i < inputArr.length; i++) { 

			if (Character.isLetter(inputArr[i]))        //Checking for the data types
				letter++;
			else if (Character.isDigit(inputArr[i]))
				number++;
			else if (Character.isSpaceChar(inputArr[i]))
				space++;
			else
				spChar++;
		}                                                   // printing the counts of each data type
		System.out.println("The total number of letters are : " + letter);
		System.out.println("The total number of digits are : " + number);
		System.out.println("The total number of space are : " + space);
		System.out.println("The total number of special characters are : " + spChar);
	}

}
