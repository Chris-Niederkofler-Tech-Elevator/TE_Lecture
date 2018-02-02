package com.techelevator.staticDemo;

public class StoreRegister {

	private static double storeMoney = 0.0d;
	private double registerMoney = 0.0d;
	
	public void purchaseItemAtRegister(double cash) {
		registerMoney += cash;
		storeMoney += cash;
	}
	
	public double getStoreMoney() {
		return storeMoney;  // The static does not use this since it is part of all objects from this class
	}
	
	public double getRegisterMoney() {
		return this.registerMoney;  // the non-static does use this, since it is unique for each individual object from this class
	}
}
