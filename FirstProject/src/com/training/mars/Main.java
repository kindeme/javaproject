package com.training.mars;

public class Main {

	public static void main(String[] args) {
	
		// implicite conversion
		
		int i = 100;
		long l = i; 
		float f = l;
		double d = 100.04;
		int newInt = (int)d;
	
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(newInt);
		

	}

}
