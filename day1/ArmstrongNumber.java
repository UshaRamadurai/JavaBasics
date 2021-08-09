package week1.day1;

//Goal : To calculate the Armstrong number 
//Providing the Input (integer) : 153
//Calculation :  (1*1*1) + (5*5*5) + (3*3*3) = 153
//Comparing and Printing the result

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring the variables
		int numb = 153;
		int calculated = 0;
		int remainder, original;
		original = numb;

		// Separating by each digit and calculating the formula
		while (numb > 0) {
			remainder = numb % 10;
			calculated = calculated + (remainder * remainder * remainder);
			numb = numb / 10;
		}
		System.out.println(" The Calculated Armstrong number is :" + calculated);

		// Comparing the output and printing the result
		if (calculated == original)
			System.out.println("Yes,It is a Armstrong number");
		else
			System.out.println("No, It is not a Armstrong number");

	}

}
