package com.dest.basicsOfProgramming.variables;

public class StringCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("prassu");
		String str2 = new String("Prassu");
		if(str1.equalsIgnoreCase(str2)== true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str1 == str2) {
			System.out.println("Addresses are equal");
		}
		else {
			System.out.println("Addresses are not equal");
		}

	}

}
