package week1.day1;

//Goal : Fibanocci for a given range
//Input the range for fibanocci series as 8, first num = 0, second num = 1
//Output : 0 1 1 2 3 5 8 13
//calculation : adding first two numbers resulting in third number
//0+1 =1 , 1+1 = 2, 1+2 = 3, ..... 5+8 = 13
//Printing the fibanocci series

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initializing first and second number as 0 and 1 and range as 8
		int range = 8, firstNumber = 0, secondNumber = 1, sum;

		System.out.println("The Fibanocci series for range 8 is :");
		System.out.println(firstNumber + "\n" + secondNumber);  // printing first 2 numbers 

		for (int i = 2; i <range; i++) {           // loop from 3rd element to range

			sum = firstNumber + secondNumber;     // adding 2 consecutive numbers
			System.out.println(sum);              // printing th output from 3rd element
			firstNumber = secondNumber;
			secondNumber = sum;

		}

	}

}
