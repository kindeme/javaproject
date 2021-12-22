package com.training.mars;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter 4 digits number");
		
		int number = scanner.nextInt();
		
		String numberLength = Integer.toString(number);
		
		while(numberLength.length() !=4){
			
			System.out.println("Please enter 4 digits number");
			
			 number = scanner.nextInt();
			
			numberLength = Integer.toString(number);
			scanner.nextLine();
		}
		
		if(numberLength.length() ==4) {
			
			
			int sum = 0;
			int remainder = 0;
			while(number > 0) {
				remainder  = number % 10;
				sum += remainder;
				number = number / 10;
			
			}
			System.out.println(" the sum of your input is: " + sum);
			
		}
		

	}

}
