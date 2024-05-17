package com.bikefacotry;
//object creation logic
public class BikeFactory {
	public static Bike getBike(String in) {
		if(in.equalsIgnoreCase("Honda")) {
			return new Honda();
		}
		else if(in.equalsIgnoreCase("TVS")){
			return new TVS();
		}
		else if(in.equalsIgnoreCase("KTM")){
			return new KTM();
		}
		else {
			System.out.println("This Bike brand is not Present");
			return null;
		}
	}
}
