package week1.day2;

//Goal : Create class to access methods and variables from another class
public class MyKid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiating another class MyMobile
		MyMobile kidMobile = new MyMobile();
		
		//accessing the methods of another class
		kidMobile.sendMsg();
		kidMobile.makeCall();
		
		//accessing the variables of another class
		int size = kidMobile.size;
		System.out.println(size);
		
	}

}
