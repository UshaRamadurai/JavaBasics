package week1.day1;

// Goal : To Print even numbers from 1 to 50 
//implementing for loop to iterate numbers
//implementing if statement to check the condition
//Printing the output

public class LearnIfAndFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The Even numbers from 1 to 50 is :");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

}
