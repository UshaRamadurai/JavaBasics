package org.system;

public class Desktop extends Computer{
	
	public void desktopModel() {
		
		System.out.println("This is Child class- Desktop");
		
	}

	public static void main(String[] args) {
		
		Desktop obj1 = new Desktop();
		obj1.desktopModel();
		obj1.ComputerModel();
		
	}
}
