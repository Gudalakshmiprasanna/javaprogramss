package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

class Voweloperations{
	Scanner sc = new Scanner(System.in);
	void countVowelConsonant(String s) {
		int vowel_count = 0;
		int consonant_count = 0;
		System.out.println("Calculating the Vowel and Consonant count");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
					s.charAt(i)=='O'||s.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonant_count++;
			}
		}
		System.out.println("The Vowel count: " + vowel_count);
		System.out.println("The Consonant count: " + consonant_count);
		System.out.println("========================");
	}
	void lowerCaseVowels(String s) {
		int lower_vowel_count = 0;
		System.out.println("Calculating the lower case Vowel count");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u') {
				lower_vowel_count++;
			}
		}
		System.out.println("The lower case Vowel count: " + lower_vowel_count);
		System.out.println("T=============================");
	}
	void upperCaseVowels(String s) {
		int upper_vowel_count = 0;
		System.out.println("Calculating the upper case Vowel count");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
					s.charAt(i)=='O'||s.charAt(i)=='U') {
				upper_vowel_count++;
			}
		}
		System.out.println("The upper case Vowel count: " + upper_vowel_count);
		System.out.println("=============================");
	}
	void replaceAllVowels(String s) {
		String temp_str = "";
		System.out.println("Replacing all the vowels with a single character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
					s.charAt(i)=='O'||s.charAt(i)=='U') {
				temp_str = temp_str + '@';
			}
			else {
				temp_str = temp_str + s.charAt(i);
			}
		}
		System.out.println("The Replaced String is : " + temp_str);
		System.out.println("========================");
	}
	void replaceUpperCaseVowels(String s) {
		String temp_str = "";
		System.out.println("Replacing all the upper case vowels with a single character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
					s.charAt(i)=='O'||s.charAt(i)=='U') {
				temp_str = temp_str + '@';
			}
			else {
				temp_str = temp_str + s.charAt(i);
			}
		}
		System.out.println("The Replaced String is : " + temp_str);
		System.out.println("========================");
	}
	void replaceLowerCaseVowels(String s) {
		String temp_str = "";
		System.out.println("Replacing all the lower case vowels with a single character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u') {
				temp_str = temp_str + '@';
			}
			else {
				temp_str = temp_str + s.charAt(i);
			}
		}
		System.out.println("The Replaced String is : " + temp_str);
		System.out.println("========================");
	}
	void replaceIndividualVowels(String s) {
		String temp_str = "";
		System.out.println("Replacing individual vowels with individual character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A') {
				temp_str = temp_str + '@';
			}
			else if(s.charAt(i)=='e'||s.charAt(i)=='E') {
				temp_str = temp_str + '#';
			}
			else if(s.charAt(i)=='i'||s.charAt(i)=='I') {
				temp_str = temp_str + '$';
			}
			else if(s.charAt(i)=='o'||s.charAt(i)=='O') {
				temp_str = temp_str + '&';
			}
			else if(s.charAt(i)=='u'||s.charAt(i)=='U') {
				temp_str = temp_str + '*';
			}
			else {
				temp_str = temp_str + s.charAt(i);
			}

		}
		System.out.println("The Replaced String is : " + temp_str);
		System.out.println("========================");
	}
}

public class VowelsCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voweloperations v = new Voweloperations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		v.countVowelConsonant(s);
		v.lowerCaseVowels(s);
		v.upperCaseVowels(s);
		v.replaceAllVowels(s);
		v.replaceUpperCaseVowels(s);
		v.replaceLowerCaseVowels(s);
		v.replaceIndividualVowels(s);
	}

}
