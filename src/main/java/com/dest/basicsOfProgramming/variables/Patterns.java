package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word - 1");
		String s1 = sc.next();
		System.out.println("Enter word - 2");
		String s2 = sc.next();
		
		if(s1.length() == s2.length()) {
			char arr1[] = new char[s1.length()];
			char arr2[] = new char[s2.length()];
			
			for(int i = 0 ; i < arr1.length ; i++) {
				arr1[i]  = s1.charAt(i);
				arr2[i]  = s2.charAt(i);
			}
		
		arr1 = sortArrays(arr1);
		arr2 = sortArrays(arr2);
		
		for(int i = 0;i<arr1.length ;i++) {
				if(arr1[i]!=arr2[i]) {
				System.out.print("Not anagrams");
				}
		}
		System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Anagrams");
		}

	}



	private static char[] sortArrays(char[] arr) {
		// TODO Auto-generated method stub
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
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
