package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;
import java.util.Arrays; 

public class PangramOwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		s = s.toUpperCase();
		
		char arr1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
				        'P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		System.out.println(arr1);
		int alphaCount = 0;
        int specialCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z')) {
                alphaCount++;  // Count alphabets
            } else {
                specialCount++;  // Count special characters and spaces
            }
        }

        // Creating arrays to store alphabetic characters and special characters
        char[] arr2 = new char[alphaCount];
        char[] specialChars = new char[specialCount];

        // storing alphabets in arr2 and special characters into special chars array
        int alphaIndex = 0;
        int specialIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z')) {
         
                arr2[alphaIndex] = c;
                alphaIndex++;
            } 
            else {
                
                specialChars[specialIndex] = c;
                specialIndex++;
            }
        }
		
		arr2 = sortArray(arr2);
		//checking equality of 2 arrays
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] !=arr2[i]) {
				System.out.println("The given string is not a pangram");
				System.exit(0);
			}
		}
		System.out.println("The given string is a pangram");
	}

	private static char[] sortArray(char[] arr) {
		// TODO Auto-generated method stub
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	
}
