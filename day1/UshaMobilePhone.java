package week1.day1;

//Goal : To learn about the data types in Java
//Declaring the attributes of phone as variables in respective data types
//Printing the same

public class UshaMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring the variables
		String brandName = "Apple";
		String model = "10s max";
		char color = 'W';
		int price = 70000;
		byte memory = 126;
		float screenSize = 15.5f;
		boolean isTouchScreen = true;
		long phoneNumber = 983748727l;

		//Printing the attributes
		System.out.println("Brand name of the Mobile ---" + brandName);
		System.out.println("Model of the Mobile ---" + model);
		System.out.println("Color of the Mobile ---" + color);
		System.out.println("Price of the Mobile ---" + price);
		System.out.println("Memory Size of the Mobile ---" + memory);
		System.out.println("Screen Size of the Mobile ---" + screenSize);
		System.out.println("Touch screen feature of the Mobile ---" + isTouchScreen);
		System.out.println("Phone number of the Mobile ---" + phoneNumber);

	}

}
