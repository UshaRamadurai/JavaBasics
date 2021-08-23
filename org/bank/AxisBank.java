package org.bank;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("I am the deposit Account of Axis bank");
	}
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.savings();
		obj.current();
		obj.deposit();
		
	}
}
