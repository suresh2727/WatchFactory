package com.bikefacotry;

import java.util.Scanner;
// Customer utilization logic
public class TestBike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand to check the price");
		String a=sc.next();
		Bike b = BikeFactory.getBike(a);  
		 
         if(b!=null) {
			b.Brand();
			b.Price();
			b.Start();
         }
	
		
		
	}
}
