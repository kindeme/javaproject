package com.training.mars;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Please enter your first word or phrase"); 
        
		String firstWord = scanner.nextLine();
		
       System.out.println("Please enter your second word or phrase"); 
        
		String secondtWord = scanner.nextLine();
		
		firstWord = firstWord.replaceAll("\\s+","");
		secondtWord = secondtWord.replaceAll("\\s+","");
		
		
		if(firstWord.length() != secondtWord.length()) {
			System.out.println(" Your two words or phrases are not anagrams !");
			return;
			
		}else {
			// transform string to array
			firstWord = firstWord.toLowerCase();
			secondtWord = secondtWord.toLowerCase();
			
			char firstWordToArray[] = firstWord.toCharArray();
			char secondWordToArray[] = secondtWord.toCharArray();
			
			Arrays.sort(firstWordToArray);
			Arrays.sort(secondWordToArray);
			
			for(int i = 0; i< firstWord.length(); i++) {
				if(firstWordToArray[i] != secondWordToArray[i]) {
					System.out.println(" Your two words or phrases are not anagrams !");
					return;
				}
			}
			
			System.out.println(" Your two words or phrases are anagrams !");
		}
		
		
;	}

}
