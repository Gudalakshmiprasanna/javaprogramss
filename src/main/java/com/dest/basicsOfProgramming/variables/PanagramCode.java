package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

public class PanagramCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		s = s.toUpperCase();
		
		int arr[] = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = 0;
		}
		int temp;
		for(int i=0;i<s.length();i++) {
			temp = s.charAt(i) - 65;
			arr[temp] = 1;
		}
		for(int i=0;i<s.length();i++) {
			if(arr[i] != 1) {
				System.out.println("Not Pangram");
				System.exit(0);
			}
		}
		System.out.println("Pangram");

	}

}
