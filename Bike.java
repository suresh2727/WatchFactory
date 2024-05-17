package com.bikefacotry;


//Implementation logic 
public interface Bike {
	void Brand();
	void Price();
	void Start();
}

class Honda implements Bike
{

	@Override
	public void Brand() {
		System.out.println("Honda Shine Bike ");
	}

	@Override
	public void Price() {
		System.out.println("RS.150000");
	}
	
	public void Start() {
		System.out.println("Honda Bike Started");
	}
	
}


class TVS implements Bike{

	@Override
	public void Brand() {
		System.out.println("TVS 310rr");
	}

	@Override
	public void Price() {
		System.out.println("RS.350000");
	}
	public void Start() {
		System.out.println("TVS Bike Started");
	}
	
	
}

class KTM implements Bike{

	@Override
	public void Brand() {
		System.out.println("KTM RC 390");
	}

	@Override
	public void Price() {
		System.out.println("RS.380000");
	}
	
	
	public void Start() {
		System.out.println("KTM Bike Started");
	}
	
}