package week1.day2;

//Goal : accessing the methods with passing arguments of another class

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiating object for class calculator
		Calculator calci = new Calculator(); 
		
		//printing the result by passing arguments to the methods
		//Creating local variable to store and print the result
		
		int add1 =calci.addition(200,450, 49834);
		System.out.println("The addition result is :" + add1);
		
		int sub1 = calci.subtraction(3455, 321);
		System.out.println("The Subtraction result is :" + sub1);
		
		double mul1 = calci.multiplication(23.5, 340.45);
		System.out.println("The Multiplication result is :" + mul1);
		
		float div1 =calci.division(230.5f, 34.5f);
		System.out.println("The Division result is :" + div1);
	}

}
