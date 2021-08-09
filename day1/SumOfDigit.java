package week1.day1;

//Goal : To evaluate the sum of digits of given number
//Input = 345, Output = 12 (3+4+5)
//Using while loop to separate the digits of number
//adding the remainder to get the sum
//Printing the result

public class SumOfDigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 345;
		int sum = 0;
		
		while (n > 0) {
			int r = n % 10;        // extracting the digit
			System.out.println(r);
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("The Sum of Digit 345 is:" + sum);
	}

}
