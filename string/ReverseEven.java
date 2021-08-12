package week1.day2.string;

/* Goal : Code to print only the odd words of a sentence in reverse order
 * input : "Welcome to the world of Testing"
 * output : "Welcome ot the dlrow of gnitseT "
 * Split the sentence into words and store in array
 * Traverse through the loop from 0 to string length -1 
 * check with condition to print the odd words in reverse
 * print the even words as such
 */
public class ReverseEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Welcome to the world of Testing";  // declaration of input
		String[] splitInput = input.split(" ");            // spliting the string into words and storing in array 
		
		for (int i = 0; i < splitInput.length; i++) {      // Traversing the String array 
			
			if (i % 2 != 0) {                              // if odd            
			
				for (int j = splitInput[i].length() - 1; j >= 0; j--) { // Traverse in reverse iteration
					
					System.out.print(splitInput[i].charAt(j));          //printing odd words
				}
				System.out.print(" ");
			}

			else
				System.out.print(splitInput[i] + " ");                // printing even words
		}
	}
}