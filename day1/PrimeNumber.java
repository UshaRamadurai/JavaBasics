package week1.day1;

//Goal : To evaluate the  inputted number is Prime number or not
//declaring the number to 13 to evaluate
//implementing for loop to iterate from 2 to half of the number
//if statement to check the remainder and setting flag accordingly
// printing the result 

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 13;
		boolean flag = false;

		for (int i = 2; i <=input/2; i++) {
			
			if (input % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("The given number is a Prime number");
		else
			System.out.println("The given number is not a Prime number");

	}

}
