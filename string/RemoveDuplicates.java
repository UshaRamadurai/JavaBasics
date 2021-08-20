package week2.day2.practice4;
/*Goal : Code to remove duplicate words in an String
 *Let the input be "Program to to remove duplicate duplicate words words in a a string"
 *Declare a integer variable to count the duplicates
 *Split the string into array to iterate
 *Use another loop for comparison of words
 *Increase the count by 1 at each match 
 *Replace the duplicates by "" if match exist
 *print the resultant string after duplicate removal 
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Initialize the variables
		String text = "Program to to remove duplicate duplicate words words in a a string";
		int count = 0;
		
		//Split and store in Array
		String[] textArr = text.split(" ");

		//Iterate to compare words		
		for (int i = 0; i < textArr.length; i++) {

			for (int j = i + 1; j < textArr.length; j++) {

				if (textArr[i].equals(textArr[j])) {
					
					//Removing the duplicates
					textArr[i] = "";
					count++;
				}
			}
		}
		
		//Printing the string if duplicate exists
		if (count > 1) {
			for (int k = 0; k < textArr.length; k++)
				System.out.print(textArr[k] + " ");
		}
		else
			System.out.println("No Duplicates in the string");

	}

}
