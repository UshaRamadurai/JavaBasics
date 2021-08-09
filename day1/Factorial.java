package week1.day1;

//Goal : calculate the factorial of a number 
//factorial of a number input - 5; output - 120
//calculation of 5!- 5*4*3*2*1 in for loop
//Print the output

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1;

		for (int i = 5; i > 0; i--) {
			fact = fact * i;

		}
		System.out.println("The factorial of 5 is :" + fact);
	}

}
