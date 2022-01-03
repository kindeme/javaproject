package com.training.mars;

public class ArrayDemo {

	
	public static void main(String[] args) {
		
	
		int[][] arrayEl = {{1},{1,2},{1,2,3}};
		
		
		for(int i = 0; i  < arrayEl.length; i++) {
			
			for(int j =0; j < arrayEl[i].length; j++) {
				
				System.out.print(arrayEl[i][j] + " ");
			}
			System.out.println();
		}; 
	}
}
