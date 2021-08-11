package week1.day2;

//Goal : Simple scenario of actions made on mobile

public class MyMobile {

	//declaring the variables
	int size = 15; 
	boolean isTouchScreen = true;

	// Creating actions of mobile
	public void makeCall() {
		System.out.println("Make Call method");
	}

	public void sendMsg() {
		System.out.println("Send Message method");
	}

	private void payBills() {
		System.out.println("Paying Bill method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiating the class and calling the methods through object
		MyMobile mobile = new MyMobile();
		mobile.makeCall();
		mobile.sendMsg();
		mobile.payBills();

		// storing and printing the result of variable by local variable
		int size1 = mobile.size;
		System.out.println(size1);

	}

}
