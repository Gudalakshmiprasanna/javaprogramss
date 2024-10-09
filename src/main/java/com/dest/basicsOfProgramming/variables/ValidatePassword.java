package com.dest.basicsOfProgramming.variables;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password: ");
		String pwd = sc.next();
		
		int cond1 = 0;
		int cond2 = 0;
		int cond3 = 0;
		int cond4 = 0;
		if(pwd.charAt(0) >=48 && pwd.charAt(0)<=57) {
			System.out.println("Invalid Password");
			System.exit(0);
		}
		else {
		for(int i = 0; i<pwd.length(); i++) {
			if( pwd.charAt(i)>=65 && pwd.charAt(i)<=90) {
				cond1 = 1;
			}
			else if( pwd.charAt(i)>=97&&pwd.charAt(i)<122) {
				cond2 = 1;
			}
			else if( pwd.charAt(i)>=48&&pwd.charAt(i)<=57) {
				cond3 = 1;
			}
			else if(pwd.charAt(i)== ' ') {
				System.out.println("invalid password");
				System.exit(0);
			}
			else {
				cond4 = 1;
			}
		}
		}
		if(cond1 ==1 &&cond2 == 1 && cond3 == 1 && cond4 == 1) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}

	}

}
