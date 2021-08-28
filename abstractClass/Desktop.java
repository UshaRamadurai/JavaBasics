package week3.day2.abstractClass;
//Goal: Code to achieve multiple inheritance 
//Implementing the interfaces Hardware and Software
//Achieving 50% abstraction by implementing 1 method

public abstract class Desktop implements Hardware, Software {

	public void softwareResources() {
		System.out.println("This is Software resources implemented in abstract class");
	}
	
	}
