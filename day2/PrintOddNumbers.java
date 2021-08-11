package week1.day2;

//Goal : Example of continue statement to print odd numbers

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop to iterate from numbers 1 to 20
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0)          // condition to check even number
				continue;            // to skip even numbers
			System.out.println(i);   // Printing the odd numbers
		}

	}

}
